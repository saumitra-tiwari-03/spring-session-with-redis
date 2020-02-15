package com.saumitra.sessionmgmt.component;

import org.springframework.stereotype.Component;

@Component
public class SessionData {
	
	private String sessionID ;
	
	private String username ;

	public String getSessionID() {
		return sessionID;
	}

	public void setSessionID(String sessionID) {
		this.sessionID = sessionID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	

}
