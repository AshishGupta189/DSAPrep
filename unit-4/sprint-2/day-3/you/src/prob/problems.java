package prob;

public class problems {
	/*
	 * Q1/ What is the difference between a synchronized method and a synchronized block?
	 * 
	 * => synchronized method makes the method one way it means if one thread is executing then no other 
	 * thread can execute in the method while synchronized block makes the statement synchronized which we want 
	 * to make one way.
	 * 
	 * 
	 * example: if there is a bridge and at some place there is only place of a vehicle to pass
	 * if we make the method synchronized then we are blocking the bridge and only one vehicle is passes 
	 * at a time but if we make synchronized block then only at the place where on;y one vehichle can pass
	 * we are using only there .
	 * 
	 * 
	 * Q2/- What’s the difference between class lock and object lock?
	 * =>class lock is unique for the class but object lock is unique for the object only.
	 * 	 one class has only one lock but object has as much locks as much objects we create.
	 * 	 
	 * 
	 * 
	 * Q5/- What is the Difference between the sleep and join method .
	 * => sleep method is a method which suspends the thread only for some time passed in the 
	 * argument while join is a method which suspends the method till the first method is executed.
	 * The join() method is a non-static method while sleep is a static method.
	 * sleep is a method of suspending thread with time while join is a method of suspending thread with conditions.
	 * 
	 * 
	 * 
	 * Q4/- What is a Race condition, How will you solve the Race condition,explain with an Example.
	 * =>A race-condition is a condition in which the critical section (a part of the program where shared memory is accessed)
	 * concurrently executed by two or more threads. It leads to incorrect behavior of a program.
	 * For example, if thread A is reading data from the linked list and another thread B is trying to delete the same data.
	 * This process leads to a race condition that may result in run time error
	 * 
	 * To solve the data inconsistency problem in java synchronized keyword is used.
	 * 
	 * 
	 */
}
