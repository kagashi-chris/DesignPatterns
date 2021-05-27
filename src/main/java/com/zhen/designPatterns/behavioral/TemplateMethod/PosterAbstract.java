package com.zhen.designPatterns.behavioral.TemplateMethod;

public abstract class PosterAbstract {

    PosterTemplate posterTemplate;

    public PosterAbstract() {
        posterTemplate = new PosterTemplate();
    }

    protected abstract void showPosterText();
    protected abstract void showPosterPicture();
    public void buildPoster()
    {
        showPosterTitle();
        showPosterMainImage();
        showPosterText();
        showPosterPicture();
    }

    private void showPosterMainImage() {
        this.posterTemplate.showMainImage();
    }

    private void showPosterTitle() {
        this.posterTemplate.showTitle();
    }

}
