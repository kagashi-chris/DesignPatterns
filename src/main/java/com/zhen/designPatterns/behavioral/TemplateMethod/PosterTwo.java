package com.zhen.designPatterns.behavioral.TemplateMethod;

public class PosterTwo extends PosterAbstract{

    @Override
    public void showPosterText() {
        System.out.println("Post Two Text!");
    }

    @Override
    public void showPosterPicture() {
        System.out.println("Post Two Picture!");
    }

    public void buildPoster()
    {
        showPosterText();
        showPosterPicture();
    }
}
