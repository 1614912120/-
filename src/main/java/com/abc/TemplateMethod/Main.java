package com.abc.TemplateMethod;

public class Main {
    public static void main(String[] args) {
        CharDisplay d1 = new CharDisplay('H');
        StringDisplay helloWord = new StringDisplay("hello word");
        d1.display();
        helloWord.display();
    }
}
