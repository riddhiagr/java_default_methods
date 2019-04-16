package impl;

import main.DefaultMethodApl;

public class Student implements Named, Person{


	
	@Override
	public long getId() {
		return DefaultMethodApl.counter.incrementAndGet();
	}

	/*
	 * It is mandatory to override one of the method.
	 * Else, it is a compiler error.
	 * */
	@Override
	public String getName() {
		return Named.super.getName();
	}

}
