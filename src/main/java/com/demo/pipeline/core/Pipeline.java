package com.demo.pipeline.core;


import java.util.ArrayList;
import java.util.List;

/**
 * Pipeline
 * @author WhiteWolf
 */
@SuppressWarnings("ALL")
public class Pipeline {

	private final List<Handler> handlerList = new ArrayList<Handler>();

	public void addHandler(Handler handler){
		handlerList.add(handler);
	}

	public void process(Message msg){
		System.out.println("Message"+msg);
	}

}
