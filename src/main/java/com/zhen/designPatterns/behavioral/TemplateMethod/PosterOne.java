package com.zhen.designPatterns.behavioral.TemplateMethod;

public class PosterOne extends PosterAbstract{

    @Override
    public void showPosterText() {
        System.out.println("Post One Text!");
    }

    @Override
    public void showPosterPicture() {
        System.out.println("Post One Picture!");
    }

    public void showMorePosterText(){
        System.out.println("Some More Poster One Text!");
    }

    public void buildPoster()
    {
        showPosterText();
        showPosterPicture();
        showMorePosterText();
    }
}
