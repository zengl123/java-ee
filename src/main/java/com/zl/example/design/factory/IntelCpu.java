package com.zl.example.design.factory;

/**
 * 描述:
 * 项目名:java-ee
 *
 * @Author:ZENLIN
 * @Created 2019/3/1  11:32.
 */
public class IntelCpu implements Cpu {
    /**
     * CPU的针脚数
     */
    private int pins = 0;

    public IntelCpu(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("Intel CPU的针脚数：" + pins);
    }
}
