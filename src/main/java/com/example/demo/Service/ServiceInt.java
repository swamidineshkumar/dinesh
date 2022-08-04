package com.example.demo.Service;

import java.util.List;

import com.example.demo.Model.StudentDemo;

public interface ServiceInt {

	public boolean savedata(StudentDemo studentDemo);
	public List<StudentDemo> getAll();
	public StudentDemo getbyAge(String Age);
}
