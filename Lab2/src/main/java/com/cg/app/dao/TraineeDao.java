package com.cg.app.dao;

import java.util.List;

import com.cg.app.entity.Trainee;


public interface TraineeDao {
	
	public void create(Trainee trainee);
	
	public List<Trainee> retrieve();
	
	public Boolean delete(int id);

}
