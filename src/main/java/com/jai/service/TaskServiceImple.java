package com.jai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jai.model.Task;
import com.jai.repository.TaskRepository;

@Service
public class TaskServiceImple implements TaskService{
	
	@Autowired
	TaskRepository taskrepo;

	@Override
	public List<Task> getTasks() {
		// TODO Auto-generated method stub
		return taskrepo.findAll();
	}

	

}