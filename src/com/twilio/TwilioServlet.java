package com.twilio;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;

import com.twilio.twiml.Body;
import com.twilio.twiml.Message;
import com.twilio.twiml.MessagingResponse;
import com.twilio.twiml.TwiMLException;
//@WebServlet("/sms")


public class TwilioServlet extends HttpServlet {
	MessagingResponse twiml;
    // service() responds to both GET and POST requests.
    // You can also use doGet() or doPost()
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
	}
	
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
EngineStart.execute();
       
    }
}