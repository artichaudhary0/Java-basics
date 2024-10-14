package Thread;
/*
sleep() :
The sleep() method pauses the execution of the current thread for a specific period of time.
The thread remains in the sleep state for the given no. of milliseconds
*/



public class SleepThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            for(int i = 1 ; i<= 5 ; i++){
                System.out.println("Thread1- "+" : "+i);
                try{
                    Thread.sleep(1000); // pauses for 1 sec(1000 milliseconds)
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        t1.start();
    }
}
