package com.zhen.designPatterns.structural.composite;

public class Ads implements NewsPaperSection {

    private String pageTitle;
    private String text;

    public Ads(String pageTitle, String text) {
        this.pageTitle = pageTitle;
        this.text = text;
    }

    @Override
    public void showPageDetail() {
        System.out.println("ADS!\n"
                + pageTitle + ": " + text);
    }
}
