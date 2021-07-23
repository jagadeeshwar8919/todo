package com.jai.model;





import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name="T_Tasks")
public class Task {
	
	public enum Status{
		Pending,
		Completed
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column(name="taskname",length =50,nullable = false,unique = false)
	private String taskName;
	@Column(name="description",length =5000,nullable = false,unique = false)
	private String description;
	@Column(name="userid",length =50,nullable = false,unique = false)
	private String userId;
	@Column(name="createsat")
	private LocalDate createdAt;
	@Column(name="endedat")
	private LocalDate endedAt ;
	@Column(name="status")
	@Enumerated(EnumType.STRING)
	private Status status ;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public LocalDate getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDate getEndedAt() {
		return endedAt;
	}

	public void setEndedAt(LocalDate endedAt) {
		this.endedAt = endedAt;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
}
