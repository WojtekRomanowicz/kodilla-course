package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String text, PoemDecorator poemDecorator){
        System.out.println("Text before decorate:" + text);
        String decoratedText = poemDecorator.decorate(text);
        System.out.println("Text after decorate:" + decoratedText);

    }
}
