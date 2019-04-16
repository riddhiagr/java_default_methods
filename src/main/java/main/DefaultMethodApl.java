package main;

import java.util.concurrent.atomic.AtomicInteger;

import impl.Person;
import impl.PersonImpl;
import impl.Student;
import impl.StudentNoDefault;

public class DefaultMethodApl {
	
	public static final AtomicInteger counter = new AtomicInteger();
	
	public static void main(String args[]) {
		
		/*
		 * Simple default method example
		 * */
		
		Person person = new PersonImpl();
		System.out.println("Person default method "+person.getName());
		System.out.println("Person non-default method "+person.getId());
		
		
		/*
		 * If a class implements two interface and both these interface contains the same default method,
		 * it is mandatory for the implementation class to override the default method.
		 * */
		
		Student student = new Student();
		System.out.println("Student non-default method "+student.getId());
		System.out.println("Student default method "+student.getName());
		
		
		/*
		 * If at least one interface provides an
			implementation, the compiler reports an error, and the programmer must resolve
			the ambiguity
		*/
		
		StudentNoDefault noDefault = new StudentNoDefault();
		System.out.println("StudentNoDefault non-default method "+noDefault.getId());
		System.out.println("NoDefault non-default method "+noDefault.getName());
		
		
	}

}
