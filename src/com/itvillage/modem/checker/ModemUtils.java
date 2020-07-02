package com.itvillage.modem.checker;

import gnu.io.*;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class ModemUtils {

	private InputStream in1;
	private OutputStream outputStream;
	private CommPort commPort;
	private SerialPort serialPort;
	private String port_name;
	private static int send_to_parser;
	private static String last_cmd;
	private String response = "Error";
	private String responseAdd = "";

	public String connect(String portName, int speed) throws Exception {

		String ret = "connect_fail";
		CommPortIdentifier portIdentifier = CommPortIdentifier
				.getPortIdentifier(portName);
		if (portIdentifier.isCurrentlyOwned()) {
			System.out.println("Error: Port is currently in use");


			String s1 = "\nError: " + portName + " port is currently in use.\n";
			printValue(s1);
			ret = "connect_port_in_use";
		} else {
			try {
				this.commPort = portIdentifier.open(getClass().getName(), 2000);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				String s1 = portName
						+ "  is currently in use. Please close the application that is using this port and connect again."
						+ "\r\n";
				printValue(s1);
				return "connect_port_in_use";
			}
			System.out.println("Active Port is " + this.commPort);
			if ((this.commPort instanceof SerialPort)) {
				this.serialPort = ((SerialPort) this.commPort);
				this.port_name = portIdentifier.getName();

				this.serialPort.setSerialPortParams(speed, 8, 1, 0);

				InputStream in = this.serialPort.getInputStream();
				OutputStream out = this.serialPort.getOutputStream();
				this.in1 = in;
				this.outputStream = out;

				this.serialPort
						.addEventListener(new ModemUtils.SerialReader(
								this.in1));
				this.serialPort.notifyOnDataAvailable(true);
				ret = "connect_sucess";
			} else {
				System.out
						.println("Error: Only serial ports are handled by this example.");

				ret = "connect_error";
				String s1 = "Error connecting to " + portName + ".\r\n";
				printValue(s1);
			}
		}
		return ret;
	}

	/*
	 *  @return A list of Ports Like [COM1,COM2]
	 * */
	private List<String> listPorts() {
		List<String> portsList = new ArrayList<String>();
		Enumeration<CommPortIdentifier> portEnum = CommPortIdentifier.getPortIdentifiers();

		while (portEnum.hasMoreElements()) {
			CommPortIdentifier portIdentifier = (CommPortIdentifier) portEnum
					.nextElement();
			if (getPortTypeName(portIdentifier.getPortType()) == "Serial") {
				System.out.println((getPortTypeName(portIdentifier.getPortType()))+"----------"+portIdentifier.getName());
				portsList.add(portIdentifier.getName());
			}
		}
		return portsList;
	}

	public String disconnect() {
		String res = "Disconnect Failed";
		try {

			serialPort.removeEventListener();
			serialPort.close();
			this.in1.close();
			this.outputStream.close();
			res = "Disconnect Successful";
		} catch (IOException ex) {
			// don't care
		}
		// Close the port.
		serialPort.close();
		return res;
	}





//		String ret = "disconnect_fail";
//		if (this.serialPort != null) {
//			try {
//				this.outputStream.flush();
//				this.in1.close();
//				this.outputStream.close();
//
//			} catch (IOException localIOException) {
//			}
//			String s1 = "Disconnecting port " + this.port_name + ".\r\n\r\n";
//			printValue(s1);
//
//			this.serialPort.close();
//			this.serialPort = null;
//			this.in1 = null;
//			this.outputStream=null;
//			ret = "disconnect_success";
//		} else {
//			String s1 = "No port is connected.\r\n\r\n";
//			printValue(s1);
//			ret = "disconnect_port_not_selected";
//		}
//		responseAdd = "";
//		return ret;
//	}

	static String getPortTypeName(int portType) {
		switch (portType) {
			case 3:
				return "I2C";
			case 2:
				return "Parallel";
			case 5:
				return "Raw";
			case 4:
				return "RS485";
			case 1:
				return "Serial";
		}
		return "unknown type";
	}

	private String sendUssdCode(String str, int type) {

		String res = "submit_fail";
		if (this.serialPort != null) {
			try {
				System.out.println("Command: "+str);

				this.outputStream.write(str.getBytes());
				if (type == 1) {
					String[] t5 = str.split("\r\n");
					last_cmd = t5[0];
				}
				res = "AT Command Submitted";
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			String s1 = "No port is connected.\r\n\r\n";
			printValue(s1);
			res = "submit_port_not_connected";
		}
		return res;
	}

	private String checkPortConnected() {
		String ret = "NULL";
		if (this.serialPort != null) {
			ret = this.serialPort.getName();
		}
		return ret;
	}

	private class SerialReader implements SerialPortEventListener {
		private InputStream in;
		private byte[] portBuffer = new byte[1024];
		private String fileBuffer;
		public int winflag = 1;
		List<String> resp_array = new ArrayList<String>();

		public SerialReader(InputStream in) {
			this.in = in;

		}

		public void serialEvent(SerialPortEvent arg0) {
			String delimiter = "\r\n";
			try {
				int len = 0;
				int data;
				while ((data = this.in.read()) > -1) {

					this.portBuffer[(len++)] = ((byte) data);
					if (data == 10) {
						break;
					}
				}
				this.fileBuffer = new String(this.portBuffer, 0, len);


				response = this.fileBuffer.toString();
				response = this.fileBuffer.toString();
				if (response.contains("RING")) {
					printValue("Ring");
					return;
				}
				if (response.contains("CONNECT OK")) {
					printValue(response);
					printValue("Connect OK");
					return;
				}
				if (response.contains("CLOSE")) {
					printValue(response);
					printValue(resp_array.toString());
					return;
				}
				if (response.contains("NO CARRIER")) {
					printValue(response);
					printValue(resp_array.toString());
					return;
				}
				if (response.contains("+HTTPACTION:0")) {
					String[] temp = response.split(delimiter);
					resp_array.clear();
					resp_array.add(temp[0]);
					printValue(resp_array.toString());
					return;
				}
				if (response.contains("POSITION:")) {
					String[] temp = response.split(delimiter);
					resp_array.clear();
					resp_array.add(temp[0]);
					printValue(resp_array.toString());
					return;
				}
				if (response.contains("IPDATA:")) {
					resp_array.clear();
					while ((data = this.in.read()) > -1) {
						this.portBuffer[(len++)] = ((byte) data);
					}
					this.fileBuffer = new String(this.portBuffer, 0, len);
					System.out.print(this.fileBuffer.toString());
					response = this.fileBuffer.toString();
					resp_array.add(response);
					printValue(resp_array.toString());
					return;
				}
				if (response.contains("+FTPPUT:1,")) {
					String[] temp = response.split(delimiter);
					String[] temp1 = temp[0].split(":");
					temp1 = temp1[1].split(",");
					ModemUtils.last_cmd = "+FTPPUT:";
					resp_array.clear();
					resp_array.add(temp1[0]);
					resp_array.add(temp1[1]);
					if (temp1[1].equals("1")) {
						resp_array.add(temp1[2]);
					}
					printValue(response);
					printValue(resp_array.toString());
					return;
				}
				if (response.contains("+FTPPUT:2,")) {
					String[] temp = response.split(delimiter);
					String[] temp1 = temp[0].split(":");
					temp1 = temp1[1].split(",");
					ModemUtils.last_cmd = "+FTPPUT:";
					resp_array.clear();
					resp_array.add(temp1[0]);
					resp_array.add(temp1[1]);

					printValue(response);
					printValue(resp_array.toString());

					return;
				}
				if (response.contains("+FTPGET:1,")) {
					String[] temp = response.split(delimiter);
					String[] temp1 = temp[0].split(":");
					ModemUtils.last_cmd = "+FTPGET:";
					resp_array.clear();
					resp_array.add(temp1[1]);

					printValue(response);
					printValue(resp_array.toString());

					return;
				}
				if (response.contains("+FTPGET:2,")) {
					String[] temp = response.split(delimiter);
					String[] temp1 = temp[0].split(":");
					temp = response.split(":");
					ModemUtils.last_cmd = "+FTPGET:";
					resp_array.clear();
					resp_array.add(temp1[1]);
					printValue(response);
					return;
				}
				if (response.equals("AT")) {
					resp_array.clear();
					return;
				}
				if (ModemUtils.send_to_parser == 1) {

					printValue(response);
					if ((response.equals(ModemUtils.last_cmd + "\r\r\n"))
							|| (response.equals(ModemUtils.last_cmd + "\r\n"))
							|| (response.equals(ModemUtils.last_cmd + "\r"))) {
						resp_array.clear();
					} else {
						String[] temp = response.split(delimiter);
						if (temp[0].contains("ERROR")) {
							resp_array.add(temp[0]);
							printValue(resp_array.toString());
							resp_array.clear();
						} else if (temp[0].equals("OK")) {
							resp_array.add(temp[0]);
							printValue(resp_array.toString());
							resp_array.clear();
						} else if (temp[0] != "") {
							resp_array.add(temp[0]);
						}
					}
				} else {
					printValue(response);

				}
				return;
			} catch (IOException e) {
				e.printStackTrace();
				System.exit(-1);
			}
		}
	}

	private void printValue(String value) {

		responseAdd = responseAdd+value+",";
		//System.out.println("325--->" + value);

	}

	public String USSDCodeDial(String command) {
		try {
			sendUssdCode(command + "\r\n", 1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		wait(1500);
		return response;
	}

	public String ussdDial(String command) {
		try {
            responseAdd= new String();
			sendUssdCode(command + "\r\n", 1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		wait(1500);

		return responseAdd;
	}

	public List<String> getActivePorts() {
		List<String> activePortsList = new ArrayList<>();
		for (String port : listPorts()) {
			activePortsList.add(port);
		}
		return activePortsList;
	}

	public static void wait(int ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}


}
