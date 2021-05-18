package com.zhen.designPatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class NewsPaper implements NewsPaperSection{

    private List<NewsPaperSection> newsPaperSectionList = new ArrayList<>();


    @Override
    public void showPageDetail() {
        for(NewsPaperSection news: newsPaperSectionList)
        {
            news.showPageDetail();
        }
    }

    public void addSection(NewsPaperSection news)
    {
        newsPaperSectionList.add(news);
    }

    public void removeSection(NewsPaperSection news)
    {
        newsPaperSectionList.remove(news);
    }
}
