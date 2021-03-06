
package com.hit.learn.thinkinginjava.concurrency.executor.returnvalue;

import java.util.concurrent.Callable;

class MyCallable implements Callable<String> {
    private static int id = 0;

    @Override
    public String call() throws Exception {
        return String.valueOf(id++);
    }
}