package com.cg.app.service;

import java.util.List;

import com.cg.app.entity.Trainee;


public interface TraineeService {
	
	public Trainee save(Trainee trainee);
	
	public List<Trainee> retrieve();
	
	public Boolean delete(int id);

}
