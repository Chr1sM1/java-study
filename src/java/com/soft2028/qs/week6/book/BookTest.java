package com.soft2028.qs.week6.book;

/**
 * @ClassName BookTest
 * @Description TODO
 * @Author Chris
 * @Date 2020/11/5
 **/
public class BookTest {
    public static void main(String[] args) {
        Book book1 = Book.builder().isbn("1234567890123").price(80).text("123").build();
        Book book2 = Book.builder().isbn("1234567890123").price(200).text("123").build();
        Book book3 = Book.builder().isbn("1234567890123").price(80).text("恐怖").build();

        BookService ss = new BookServiceImpl();
        boolean flag = false;
        try{
            flag = ss.checkBook(book3);
        }catch(ISBNException|PriceException|TextException e){
            System.out.println(e.getMessage());
        }
        System.out.println(flag);
    }
}
