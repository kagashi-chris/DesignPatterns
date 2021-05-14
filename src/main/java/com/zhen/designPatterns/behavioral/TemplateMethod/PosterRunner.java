package com.zhen.designPatterns.behavioral.TemplateMethod;

public class PosterRunner {

    public static void main(String[] args) {
        System.out.println("Using poster template to build poster!");
        PosterAbstract posterOne = new PosterOne();
        posterOne.buildPoster();
    }
}
