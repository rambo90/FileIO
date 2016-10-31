package homework.taskThreads.first;

import java.math.BigInteger;

public class MyThread implements Runnable {

    private int n;

    public MyThread(int n) {
        this.n = n;
    }

    public MyThread() {
    }

    @Override
    public void run() {
        for (int i = 1; i < this.n; i++) {
            System.out.println(Thread.currentThread().getName() + " -> " + i
                    + " != " + factorial(i));
        }
    }

    private BigInteger factorial(int n) {
        BigInteger fact = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(new BigInteger("" + i));
        }
        return fact;
    }
}
