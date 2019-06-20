package com.suvendu.notification.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.suvendu.notification.connectors.EmailConnector;
import com.suvendu.notification.model.Notification;

@Component
public class EmailNotificationConsumer implements NotificationConsumer{
	
	@Autowired
	private EmailConnector connector;
	
	@Override
	@JmsListener(destination = "${activemq.email.queue}", containerFactory="jsaFactory")
	public void receive(Notification notification){
		System.out.println("Recieved Notification: " + notification.getChannel());
		connector.send(notification);
		
	}
}