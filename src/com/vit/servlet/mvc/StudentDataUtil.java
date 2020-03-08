package com.vit.servlet.mvc;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {
	public  static List <Student> getStudent () {
		
		// create am empty list
		List <Student> students =  new  ArrayList<>();
		
		// add sample data
		students.add(new Student("Vitaliy","Rodyna","v@gmail.com"));
		students.add(new Student("Elena","Buyanova","elena@gmail.com"));
		students.add(new Student("El","Buya","buya@gmail.com"));
		students.add(new Student("Alena","Bu","bu@gmail.com"));
		
		//return the  list
		return students;
		
	}

}
