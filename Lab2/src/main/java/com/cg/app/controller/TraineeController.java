package com.cg.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.app.entity.Trainee;
import com.cg.app.service.TraineeService;


@RestController
public class TraineeController {
	
	@Autowired
	private TraineeService service;
	
	@PostMapping("/trainee")
	public ResponseEntity<Trainee> saveBook(@RequestBody Trainee trainee) {
		Trainee tr = service.save(trainee);
		
		return new ResponseEntity<Trainee>(tr,HttpStatus.OK);
	}
	
	@GetMapping("/getTrainee")
    public ResponseEntity<List<Trainee>> getAllTrainee() {
			List<Trainee> lsttrainee = service.retrieve();
			return new ResponseEntity<List<Trainee>>(lsttrainee,
					HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteTrainee/{traineeId}")
    public ResponseEntity<Trainee> deleteTraineeId
              (@PathVariable("traineeId") int id) {
		
			service.delete(id);
		return new ResponseEntity<Trainee>(HttpStatus.NO_CONTENT);
	}


}
