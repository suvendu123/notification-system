package com.suvendu.notification.consumer;

import com.suvendu.notification.model.Notification;

public interface NotificationConsumer {
	
	public void receive(Notification notification);

}
