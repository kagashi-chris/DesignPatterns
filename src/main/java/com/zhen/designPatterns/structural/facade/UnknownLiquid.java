package com.zhen.designPatterns.structural.facade;

public class UnknownLiquid extends Liquid{

    String info = "Unknown Substance";

    @Override
    public String toString() {
        return "UnknownLiquid{" +
                "info='" + info + '\'' +
                '}';
    }
}
