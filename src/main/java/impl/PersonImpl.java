package impl;

import main.DefaultMethodApl;

public class PersonImpl implements Person{
	
	@Override
	public long getId() {
		return DefaultMethodApl.counter.incrementAndGet();
	}

}
