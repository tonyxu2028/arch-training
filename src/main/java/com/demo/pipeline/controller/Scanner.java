package com.demo.pipeline.controller;

import com.demo.pipeline.core.Message;
import com.demo.pipeline.core.Pipeline;
import com.demo.pipeline.core.PipelineFactory;

/**
 * Scanner
 * @author WhiteWolf
 */
@SuppressWarnings("ALL")
public class Scanner {
	public void scan(Request request){

		// 获取商业类型
		String bizType = request.getBizType();
		// 根据商业类型获取对应的Pipeline
		Pipeline pipeline = PipelineFactory.getPipeline(bizType);

		Message message = Message.getInstance(request);
		pipeline.process(message);
	}
}
