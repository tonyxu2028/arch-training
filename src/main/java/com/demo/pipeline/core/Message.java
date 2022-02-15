package com.demo.pipeline.core;

import com.demo.pipeline.controller.Request;

/**
 * Message
 * @author WhiteWolf
 */
public class Message {

	private Message(Request request){
		System.out.println(request);
	}

	public static Message getInstance(Request request) {
		return new Message(request);
	}

}
