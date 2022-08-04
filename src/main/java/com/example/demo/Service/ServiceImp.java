package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.StudentDemo;
import com.example.demo.Repositary.StudentRepositary;

@Service
public class ServiceImp implements ServiceInt {
	@Autowired
private StudentRepositary studentRepositary;
	@Override
	public boolean savedata(StudentDemo studentDemo) {
	StudentDemo save = studentRepositary.save(studentDemo);
	if (save!=null) {
		return true;
	}else {
		return false;
	}}

	@Override
	public List<StudentDemo> getAll() {
		List<StudentDemo> findAll = studentRepositary.findAll();
		return findAll;
	}

	@Override
	public StudentDemo getbyAge(String Age) {
		// TODO Auto-generated method stub
		return null;
	}

}
