package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Model.StudentDemo;

@Service
public class ServiceImp implements ServiceInt {

	@Override
	public boolean savedata(StudentDemo studentDemo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<StudentDemo> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentDemo getbyAge(String Age) {
		// TODO Auto-generated method stub
		return null;
	}

}
