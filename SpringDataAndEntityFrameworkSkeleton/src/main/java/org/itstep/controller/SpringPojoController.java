package org.itstep.controller;

import org.itstep.model.PojoObject;
import org.itstep.service.SpringPojoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.Delegate;

@Controller
@RequestMapping( path = "/spring-pojo" )
public class SpringPojoController {

	@Autowired
	SpringPojoService springPojoService;
	
	@PostMapping( consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<PojoObject> save(@RequestParam PojoObject springPojo){
		PojoObject savedSpringPojo = springPojoService.save(springPojo);
		if(savedSpringPojo != null) {
			return new ResponseEntity<PojoObject> (savedSpringPojo, HttpStatus.OK);
		}
		return new ResponseEntity<PojoObject>(HttpStatus.METHOD_NOT_ALLOWED);
	}
	
	@PutMapping( consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE) 
	public ResponseEntity<PojoObject> update(@RequestParam PojoObject springPojo){
		PojoObject savedSpringPojo = springPojoService.update(springPojo);
		if(savedSpringPojo != null) {
			return new ResponseEntity<PojoObject> (savedSpringPojo, HttpStatus.OK);
		}
		return new ResponseEntity<PojoObject>(HttpStatus.METHOD_NOT_ALLOWED);
	}
	
	@GetMapping( produces = MediaType.APPLICATION_JSON_UTF8_VALUE) 
	public ResponseEntity<PojoObject> get(@RequestParam Integer id){
		PojoObject foundSpringPojo = springPojoService.get(id);
		if(foundSpringPojo != null) {
			return new ResponseEntity<PojoObject> (foundSpringPojo, HttpStatus.OK);
		}
		return new ResponseEntity<PojoObject>(HttpStatus.METHOD_NOT_ALLOWED);
	}
	
	@DeleteMapping
	ResponseEntity delete(Integer id) {
		springPojoService.delete(id);
		return new ResponseEntity(HttpStatus.OK);
	}
}
