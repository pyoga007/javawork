package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookComparable {

    public static void main(String[] args){
        List<Book> books=new ArrayList<>();
        books.add(new Book("The Alchemist","Paul Coelho",15.99));
        books.add(new Book("Clean Code","Robert C Martin",42.99));
        books.add(new Book("Atomic Habits","James Clear",22.99));

        for(Book book:books){
            System.out.println(book);
        }

        Collections.sort(books);

        for(Book book:books){
            System.out.println(book);
        }
    }
}
