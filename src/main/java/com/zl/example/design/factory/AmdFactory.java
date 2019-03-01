package com.zl.example.design.factory;

public class AmdFactory implements AbstractFactory {

    @Override
    public Cpu createCpu() {
        // TODO Auto-generated method stub
        return new IntelCpu(938);
    }

    @Override
    public MainBoard createMainBoard() {
        // TODO Auto-generated method stub
        return new IntelMainBoard(938);
    }

}