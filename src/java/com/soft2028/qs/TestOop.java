package com.soft2028.qs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName testOop
 * @Description TODO
 * @Author Chris
 * @Date 2020/10/15
 **/
public class TestOop {
    public static void main(String[] args){
        Student student = Student.builder()
                .studentName("Tom")
                .id("10111")
                .gender("male")
                .build();
        Book[] books = new Book[]{
                Book.builder().bookName("Java").price(100).build(),
                Book.builder().bookName("JavaWeb").build(),
                Book.builder().bookName("JavaScript").build(),
        };
        List<Book> bookList = new ArrayList<>(Arrays.asList(books));
        student.setBooks(books);
        for(Book book:student.getBooks()){
            System.out.println(book.getBookName());
        }
    }
}
