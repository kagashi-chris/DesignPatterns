package com.zhen.designPatterns.structural.proxy;

import java.awt.print.Book;

public class LazyBookParserProxy implements IBookParser{

    private BookParser bookParser = null;
    private String book = null;

    public LazyBookParserProxy(String book) {
        this.book = book;
    }

    @Override
    public int getNumPages()
    {
        if(bookParser == null)
        {
            bookParser = new BookParser(this.book);
        }
        return bookParser.getNumPages();
    }

}
