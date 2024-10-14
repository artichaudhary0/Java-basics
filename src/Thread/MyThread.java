package Thread;

class NewThread extends Thread {
    public void run(){
        System.out.println("New Thread");
    }
}

public class MyThread {

    public static void main(String[] args) {
        NewThread t1 = new NewThread();
        t1.start(); // start the thread
    }
}
