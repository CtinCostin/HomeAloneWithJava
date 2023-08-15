package main.java.com.georgescuconstantin.concurrency;

public class ThreadMain {

    public static void main(String[] args) {

        ThreadSample threadSample = new ThreadSample(45);

        Thread thread = new Thread(threadSample);
        thread.start();
        threadSample.setValue(317);

        ThreadSample threadSample1 = new ThreadSample(50);
        Thread thread1 = new Thread(threadSample1);
        thread1.start();

        ThreadSample threadSample2 = new ThreadSample(3);
        Thread thread2 = new Thread(threadSample2);
        thread2.start();

        ThreadSample threadSample3 = new ThreadSample(9);
        Thread thread3 = new Thread(threadSample3);
        thread3.start();

        try {
            Thread.sleep(1000*20);

            threadSample.stopThread();
            threadSample2.stopThread();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
