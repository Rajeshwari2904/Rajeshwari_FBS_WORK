package com.raju;

public interface observable {


		void registered (observer o);
		void unregistered (observer o);
		void notifyToAll();
	

}
