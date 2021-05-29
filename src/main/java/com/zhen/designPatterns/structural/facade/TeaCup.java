package com.zhen.designPatterns.structural.facade;

import java.util.ArrayList;
import java.util.List;

public class TeaCup {

    List<Object> cupContent = new ArrayList<>();

    public TeaCup() {
    }

    public List<Object> getCupContent() {
        return cupContent;
    }

    public void setCupContent(List<Object> cupContent) {
        this.cupContent = cupContent;
    }

    public void addCupContent(Object object)
    {
        this.cupContent.add(object);
    }

    @Override
    public String toString() {
        return "TeaCup{" +
                "cupContent=" + cupContent +
                '}';
    }
}
