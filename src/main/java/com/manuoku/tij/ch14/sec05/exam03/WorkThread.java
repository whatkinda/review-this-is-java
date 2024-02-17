package com.manuoku.tij.ch14.sec05.exam03;

public class WorkThread extends Thread {

    public boolean work = true;

    public WorkThread(String name) {
        setName(name);
    }

    @Override
    public void run() {
        while (true) {
            if (work) {
                System.out.println(getName() + " 작업처리");
            } else {
                System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
                Thread.yield();

            }
        }
    }
}
