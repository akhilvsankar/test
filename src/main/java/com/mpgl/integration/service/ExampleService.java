package com.mpgl.integration.service;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.annotation.Transformer;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class ExampleService {
	
	@Transformer(inputChannel = "fromRabbit",outputChannel = "outbound")
	public Message<String> transform(Message<String>message)
	{
		System.out.println("In transformer........................"+message.getPayload());
		return message;
		
	}
	@ServiceActivator(inputChannel = "outbound")
	public void service(Message<String>message)
	{
		System.out.println("in service method.......................");
	}
	

}
