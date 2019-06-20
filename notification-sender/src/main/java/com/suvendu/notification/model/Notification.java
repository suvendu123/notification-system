package com.suvendu.notification.model;

import java.util.List;

public class Notification {
	
	private Sender sender;
	private List<Receiver> receivers;
	private MessageContent message;
	private Channel channel;
	
	
	public Sender getSender() {
		return sender;
	}
	public void setSender(Sender sender) {
		this.sender = sender;
	}
	public List<Receiver> getReceivers() {
		return receivers;
	}
	public void setReceivers(List<Receiver> receivers) {
		this.receivers = receivers;
	}
	public MessageContent getMessage() {
		return message;
	}
	public void setMessage(MessageContent message) {
		this.message = message;
	}
	public Channel getChannel() {
		return channel;
	}
	public void setChannel(Channel channel) {
		this.channel = channel;
	}
	
	
	

}
