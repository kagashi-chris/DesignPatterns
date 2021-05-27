package com.zhen.designPatterns.structural.proxy;

public class ProxyRunner {

    public static void main(String[] args) {
        //creating proxy
        LazyBookParserProxy lazyBookParserProxy = new LazyBookParserProxy("BOOK");

        //going through proxy to get book parser
        System.out.println(lazyBookParserProxy.getNumPages());
    }
}
