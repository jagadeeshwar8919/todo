package com.jai.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

}
