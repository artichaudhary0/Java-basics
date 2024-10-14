package Thread;

/*
Runnable interface represent a task that can be executed by a thread.
The thread class, runnable is preferred when the class needs to extends another class (java doest support multiple inheritance)
*/

class MyRunnable implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running.");
    }
}


public class RunnableInterface {

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread t1 = new Thread(myRunnable,"Work-1"); // myrunnable is passes as an argument to thread constuctor
        Thread t2 = new Thread(myRunnable,"Work-2");

        t1.start();
        t2.start();
    }

}
