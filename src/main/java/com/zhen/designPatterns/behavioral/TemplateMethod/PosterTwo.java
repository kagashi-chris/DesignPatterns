package com.zhen.designPatterns.behavioral.TemplateMethod;

public class PosterTwo extends PosterAbstract{

    @Override
    protected void showPosterText() {
        System.out.println("Post Two Text!");
    }

    @Override
    protected void showPosterPicture() {
        System.out.println("Post Two Picture!");
    }

}
