package com.jai.controller;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jai.model.Task;
import com.jai.service.TaskServiceImple;

@RestController
public class TaskController {
	
	
	@Autowired
	TaskServiceImple taskservice;
	
	@GetMapping("/tasks")
	public List<Task> getAllTasks(){
		return taskservice.getTasks();	
	}
	@GetMapping("/task/{id}")
	public Task getTask(@PathVariable("id")Long id) {
		System.out.println("the passing id is :  "+id);
//		long iD=Long.parseLong(id);
		return taskservice.gettask(id);
	}
	@PostMapping("/add")
	public String addTask(Task t){
//		t.setCreatedAt(LocalDate.now());
//		return taskservice.addTask(t);
		return t.getDescription();
	}

}
