package com.suvendu.notification.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.suvendu.notification.model.Notification;
import com.suvendu.notification.service.NotificationService;

import io.swagger.annotations.Api;

@RestController
@Api
public class NotificationController {
	
		
	@Autowired
	private NotificationService service;
	
	@PostMapping(value="/api/notify")
	public Notification postCustomer(@RequestBody Notification notification){
		service.notify(notification);
		return notification;
	}
	

}
