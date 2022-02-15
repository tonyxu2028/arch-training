package com.demo.pipeline.core;

/**
 * @author WhiteWolf
 */
public class PipelineFactory {

	public static Pipeline getPipeline(String bizType){

		return new Pipeline();
	}
}
