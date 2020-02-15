package com.saumitra.sessionmgmt.controller;

import java.util.Set;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saumitra.sessionmgmt.component.SessionData;

import redis.clients.jedis.Jedis;

@RestController
public class SessionEndPoint {
	
	@Autowired
	private HttpSession httpSession;
	
	@Autowired
	private Jedis jedis;
	
	@Autowired
	private SessionData sessionData;
	
	@GetMapping("/setSession")
	public String createSession() {
		sessionData.setSessionID(httpSession.getId());
		sessionData.setUsername("dcmsadmin");
		
		httpSession.setAttribute("sessionData", sessionData);
		return "session created with ID : "+sessionData.getSessionID();
	}
	
	@GetMapping("/getSession")
	public String getSession() {
		
		Set<String> redisResult = jedis.keys("*");
		
		String redisKey = "spring:session:sessions:f0550e87-d2da-40c5-b2c4-a5d4e540a4bd";
		
		String sessionMap = jedis.hget(redisKey, "sessionAttr:data");
		System.out.println("Session Data : "+sessionMap);
		return "session data:"+redisResult.toString();
	}
	
	@GetMapping("/killsession")
	public String killSession() {
		jedis.del("dcms:session:sessions:"+httpSession.getId());
		jedis.del("dcms:session:sessions:expires:"+httpSession.getId());
		httpSession.invalidate();
		return "session killed";
	}
	
	

}
