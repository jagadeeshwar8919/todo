package com.jai.controller;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
		return taskservice.gettask(id);
	}
	@PostMapping("/add")
	public String addTask(@RequestBody Task t){
		t.setCreatedAt(LocalDate.now());
		return taskservice.addTask(t);
	}
	@PutMapping("/update")
	public Task updateTask(@RequestBody Task t){
		return taskservice.updateTask(t);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteTask(@PathVariable("id")Long id){
		return taskservice.deleteTask(id);
	}

}
