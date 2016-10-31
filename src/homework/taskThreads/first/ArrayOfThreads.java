package homework.taskThreads.first;

public class ArrayOfThreads {
    Thread[] threads = new Thread[100];
    public void arrayOfThreads(){
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new MyThread(i+1));
            threads[i].start();
        }
    }

}
