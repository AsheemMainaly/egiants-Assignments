package net.test.paraller;

import java.util.concurrent.RecursiveTask;



public class TestParallel extends RecursiveTask<Integer> {

	private final int number;
    public TestParallel(int number) { 
        this.number = number; 
    }
    @Override
    public Integer compute() {
        if (number <= 1)
        return number;
        TestParallel f1 = new TestParallel(number - 1);
        f1.fork();
        System.out.println("Current Therad Name = "+Thread.currentThread().getName());
        TestParallel f2 = new TestParallel(number - 2);
        return f2.compute() + (Integer)f1.join();
    }

}
 
   
    