package com.example.demo.Repositary;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.StudentDemo;

public interface StudentRepositary extends JpaRepository<StudentDemo, Integer> {

}
