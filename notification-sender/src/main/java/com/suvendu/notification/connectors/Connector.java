package com.suvendu.notification.connectors;

import com.suvendu.notification.model.Notification;

public interface Connector {
	
	public void send(Notification notification);

}
