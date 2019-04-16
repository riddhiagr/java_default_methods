package impl;

import main.DefaultMethodApl;

public class StudentNoDefault implements Person, NoDefault {

	@Override
	public long getId() {
		return DefaultMethodApl.counter.incrementAndGet();
	}

	@Override
	public String getName() {
		return "No Default Impl";
	}

}
