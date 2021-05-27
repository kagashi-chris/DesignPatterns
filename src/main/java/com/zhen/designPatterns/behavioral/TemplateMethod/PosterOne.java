package com.zhen.designPatterns.behavioral.TemplateMethod;

public class PosterOne extends PosterAbstract{

    @Override
    protected void showPosterText() {
        System.out.println("Post One Text!");
    }

    @Override
    protected void showPosterPicture() {
        System.out.println("Post One Picture!");
    }

}
