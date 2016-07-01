package com.example.springjmsplayground.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.springjmsplayground.jms.MessageSender;

public class JMSDemo {

	private static final Logger logger = LoggerFactory.getLogger(JMSDemo.class);

	public static void main(String[] args) {

		logger.info("Starting ..");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:jms-context.xml");
		//MessageSender messageSender = applicationContext.getBean("messageSenderImpl", MessageSender.class);
		//messageSender.sendMessage("Test Message !!!");
		
	}

}
