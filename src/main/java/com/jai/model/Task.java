package com.jai.model;

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
	@Column(name="createdat",length =50)
	@Temporal(TemporalType.DATE)
	private Date createdAt;
	@Column(name="endedat",length =50)
	@Temporal(TemporalType.DATE)
	private Date endedAt ;
	@Column(name="status")
	@Enumerated(EnumType.STRING)
	private Status status ;
	
	

}
