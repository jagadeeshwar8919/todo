package com.jai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jai.model.Task;


@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
	
	

}
