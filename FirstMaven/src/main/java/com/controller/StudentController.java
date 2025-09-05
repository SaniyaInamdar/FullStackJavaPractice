package com.controller;

import com.dao.Dao;
import com.entity.Student;

public class StudentController {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Dao d=new Dao();
		Student s=new Student(1,"Sara",21);
		//d.insert(s);
		//d.update(s);
		//d.delete(s);
	}

}
