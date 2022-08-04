package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentDemo {
	@Id
private int studentId;
private String studentName;
private String studentEmail;
private String studentAge;
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getStudentEmail() {
	return studentEmail;
}
public void setStudentEmail(String studentEmail) {
	this.studentEmail = studentEmail;
}
public String getStudentAge() {
	return studentAge;
}
public void setStudentAge(String studentAge) {
	this.studentAge = studentAge;
}
@Override
public String toString() {
	return "StudentDemo [studentId=" + studentId + ", studentName=" + studentName + ", studentEmail=" + studentEmail
			+ ", studentAge=" + studentAge + "]";
}

}
