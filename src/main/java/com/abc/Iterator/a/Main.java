package com.abc.Iterator.a;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("a"));
        bookShelf.appendBook(new Book("b"));
        bookShelf.appendBook(new Book("c"));
        bookShelf.appendBook(new Book("d"));
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book next = (Book) iterator.next();
            System.out.println(next.getName());
        }
    }
}
