package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.StudentDemo;
import com.example.demo.Service.ServiceInt;

@RestController
public class StudentController {
@Autowired
private ServiceInt  serviceInt;

@PostMapping(value="/save", consumes =  "application/json",produces = "application/json")
public ResponseEntity<String> savedata(@RequestBody StudentDemo studentDemo){
	boolean savedata = serviceInt.savedata(studentDemo);
	if(savedata==true) {
	String msg="data added";
return new ResponseEntity<String>(msg,HttpStatus.OK);
}else {
	String msg="data not  added";
	return new ResponseEntity<String>(msg,HttpStatus.OK); 
}
}
	}

