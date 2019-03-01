package com.zl.example.design.factory;

/**
 * 描述:
 * 项目名:java-ee
 *
 * @Author:ZENLIN
 * @Created 2019/3/1  11:33.
 */
public class AmdCpu implements Cpu {
    /**
     * CPU的针脚数
     */
    private int pins = 0;

    public AmdCpu(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("AMD CPU的针脚数：" + pins);
    }
}