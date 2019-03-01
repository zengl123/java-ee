package com.zl.example.design.factory;

/**
 * 描述:
 * 项目名:java-ee
 *
 * @Author:ZENLIN
 * @Created 2019/3/1  11:54.
 */
public interface AbstractFactory {
    /**
     * 创建CPU对象
     *
     * @return CPU对象
     */
    Cpu createCpu();

    /**
     * 创建主板对象
     *
     * @return 主板对象
     */
    MainBoard createMainBoard();


}
