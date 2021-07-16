package com.jai.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jai.model.Task;
@Service
public interface TaskService {
	
	List<Task> getTasks();

}
