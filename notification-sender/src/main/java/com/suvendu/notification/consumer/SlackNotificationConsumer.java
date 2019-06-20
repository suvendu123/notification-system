package com.suvendu.notification.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.suvendu.notification.connectors.SlackConnector;
import com.suvendu.notification.model.Notification;

@Component
public class SlackNotificationConsumer implements NotificationConsumer{
	
	@Autowired
	private SlackConnector connector;
	
	@Override
	@JmsListener(destination = "${activemq.slack.queue}", containerFactory="jsaFactory")
	public void receive(Notification notification){
		System.out.println("Recieved Notification: " + notification.getChannel());
		connector.send(notification);
		
	}
}