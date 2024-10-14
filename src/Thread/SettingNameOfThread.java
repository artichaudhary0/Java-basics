package Thread;

class MyNewThread extends Thread {
    public void run() {
        try{
            for(int i = 1 ; i <=5 ; i++)
            {
                System.out.println(Thread.currentThread().getName() + " " + i);
                Thread.sleep(3000); // sleep for 500 milliseconds
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}



public class SettingNameOfThread {
    public static void main(String[] args) throws InterruptedException {
        MyNewThread thread = new MyNewThread();
        thread.setName("Thread-1");
        thread.start();

        thread.join(); // main thread waits until thread finishes

        System.out.println("Main thread resume after thread completed");
    }
}

/*
join() :
allow one thread to wait for the completion of another.
it pauses the execution of the calling thread until the thread on which join() was called has completed.
*/


