package com.zl.example.thread;

/**
 * 描述:
 * 项目名:java-ee
 *
 * @Author:ZENLIN
 * @Created 2019/3/1  11:08.
 */
public class RunableThread implements Runnable {
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("i = " + i);
        }
    }
}
