package com.suvendu.notification.connectors;

import org.springframework.stereotype.Component;

import com.suvendu.notification.model.Notification;

@Component
public class SlackConnector implements Connector {

	@Override
	public void send(Notification notification) {
		/**
		 * Need to configure SLACK configuration and send 
		 */
	}

}
