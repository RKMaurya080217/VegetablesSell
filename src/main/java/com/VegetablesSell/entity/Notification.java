package com.VegetablesSell.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Notifications")
public class Notification {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int notificationId;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	private String content;
	private String type;
	private Date dateSent;

	// Getters and Setters

	public int getNotificationId() {
		return notificationId;
	}

	public void setNotificationId(int notificationId) {
		this.notificationId = notificationId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getDateSent() {
		return dateSent;
	}

	public void setDateSent(Date dateSent) {
		this.dateSent = dateSent;
	}

	public Notification(int notificationId, User user, String content, String type, Date dateSent) {
		super();
		this.notificationId = notificationId;
		this.user = user;
		this.content = content;
		this.type = type;
		this.dateSent = dateSent;
	}

	public Notification() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
