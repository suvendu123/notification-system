package com.suvendu.notification.connectors;

import org.springframework.stereotype.Component;

import com.suvendu.notification.model.Notification;

@Component
public class EmailConnector implements Connector {
	
	@Override
	public void send(Notification notification) {
		/**
		 * TODO  need to configure SMTP then
		 * send email notification; 
		 */
		
	}

}
