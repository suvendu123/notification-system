package com.suvendu.notification.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import com.suvendu.notification.model.Channel;
import com.suvendu.notification.model.Notification;
import com.suvendu.notification.service.NotificationService;

@Service
public class NotificationServiceImpl implements NotificationService {
	
	@Autowired
	private JmsTemplate jmsTemplate;
	
	@Value("${activemq.email.queue}")
	private String emailQueue;
	
	@Value("${activemq.slack.queue}")
	private String slackQueue;
	

	@Override
	public void notify(Notification notification) {
		
		if(notification.getChannel().equals(Channel.EMAIL)) {
			jmsTemplate.convertAndSend(emailQueue, notification);
		}
		if(notification.getChannel().equals(Channel.SLACK)) {
			jmsTemplate.convertAndSend(slackQueue, notification);
		}
	}

}
