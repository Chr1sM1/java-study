package com.soft2028.qs.week6.book;

/**
 * @ClassName BookService
 * @Description TODO
 * @Author Chris
 * @Date 2020/11/5
 **/
public interface BookService {
    /**
     *
     * @param book :入参：图书对象
     * @return boolean :检查结果
     * @throws ISBNException, PriceException,TextException
     */
    boolean checkBook(Book book) throws ISBNException, PriceException,TextException;
}
