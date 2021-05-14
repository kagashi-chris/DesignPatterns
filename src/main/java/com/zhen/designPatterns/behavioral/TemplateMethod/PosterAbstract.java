package com.zhen.designPatterns.behavioral.TemplateMethod;

public abstract class PosterAbstract {

    PosterTemplate posterTemplate;

    public PosterAbstract() {
        posterTemplate = new PosterTemplate();
        this.posterTemplate.showTitle();
        this.posterTemplate.showMainImage();
    }

    public abstract void showPosterText();
    public abstract void showPosterPicture();
    public abstract void buildPoster();
}
