package Tweeter_Clone;

import java.time.LocalDateTime;
import java.util.UUID;

public class Message {

	private String id;
	private String messageSender;
	private String messageReceiver;
	private LocalDateTime sentTime;
	private String content;

	public Message(String messageSender, String messageReceiver, String content) {
		super();
		this.messageReceiver = messageReceiver;
		this.messageSender = messageSender;
		this.sentTime = LocalDateTime.now();
		this.content = content;
		this.id = UUID.randomUUID().toString();
	}

	public String getMessageSender() {
		return messageSender;
	}

	public void setMessageSender(String messageSender) {
		this.messageSender = messageSender;
	}

	public LocalDateTime getSentTime() {
		return sentTime;
	}

	public void setSentTime(LocalDateTime sentTime) {
		this.sentTime = sentTime;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public String getMessageReceiver() {
		return messageReceiver;
	}

	public void setMessageReceiver(String messageReceiver) {
		this.messageReceiver = messageReceiver;
	}
	
	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Message [id=" + id + ", messageSender=" + messageSender + ", messageReceiver=" + messageReceiver + ", sentTime=" + sentTime + ", content=" + content + "]";
	}

}
