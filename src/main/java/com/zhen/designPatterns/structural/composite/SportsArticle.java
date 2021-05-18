package com.zhen.designPatterns.structural.composite;

public class SportsArticle implements NewsPaperSection {

    private String pageTitle;
    private String text;

    public SportsArticle(String pageTitle, String text) {
        this.pageTitle = pageTitle;
        this.text = text;
    }

    @Override
    public void showPageDetail() {
        System.out.println("SPORT!\n"
                + pageTitle + ": " + text);
    }
}
