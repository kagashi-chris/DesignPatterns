package com.zhen.designPatterns.structural.composite;

public class MainPageArticle implements NewsPaperSection {

    private String pageTitle;
    private String text;

    public MainPageArticle(String pageTitle, String text) {
        this.pageTitle = pageTitle;
        this.text = text;
    }

    @Override
    public void showPageDetail() {
        System.out.println("IMPORTANT STUFF!\n"
                + pageTitle + ": " + text);
    }
}
