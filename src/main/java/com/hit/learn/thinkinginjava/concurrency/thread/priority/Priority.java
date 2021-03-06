package com.hit.learn.thinkinginjava.concurrency.thread.priority;

class Priority implements Runnable {

    private  int priority;

    private int id;

    public Priority(int priority,int id) {
        this.priority = priority;
        this.id=id;
    }

    @Override
    public void run() {
        Thread.currentThread().setPriority(priority);
        System.out.println(id);
    }
}
