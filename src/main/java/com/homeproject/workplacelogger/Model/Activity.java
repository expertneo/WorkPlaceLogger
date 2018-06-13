package com.homeproject.workplacelogger.Model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Activity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer activityId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userId")
	private User user;

	private LocalDate timeStamp;
	private boolean checkIn;
	private boolean checkOut;

	public Activity() {
		super();
	}

	public Activity(Integer activityId, User user, LocalDate timeStamp, boolean checkIn, boolean checkOut) {
		super();
		this.activityId = activityId;
		this.user = user;
		this.timeStamp = timeStamp;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getActivityId() {
		return activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public LocalDate getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDate timeStamp) {
		this.timeStamp = timeStamp;
	}

	public boolean isCheckIn() {
		return checkIn;
	}

	public void setCheckIn(boolean checkIn) {
		this.checkIn = checkIn;
	}

	public boolean isCheckOut() {
		return checkOut;
	}

	public void setCheckOut(boolean checkOut) {
		this.checkOut = checkOut;
	}
}
