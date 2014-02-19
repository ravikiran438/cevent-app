package com.mycompany.cevent.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(name = "server")
public class ServerConfigProperties {

	private int port;

	private int wsport;

	private String address;

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public int getWsport() {
		return wsport;
	}

	public void setWsport(int wsport) {
		this.wsport = wsport;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
