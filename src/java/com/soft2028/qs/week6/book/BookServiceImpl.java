package com.soft2028.qs.week6.book;


/**
 * @ClassName BookServiceImpl
 * @Description TODO
 * @Author Chris
 * @Date 2020/11/5
 **/
public class BookServiceImpl implements BookService{
    @Override
    public boolean checkBook(Book book) throws ISBNException, TextException,PriceException {
        if(book.getIsbn().length()!=13){
            throw new ISBNException("ISBN错误！");
        }else if(book.getPrice()>100){
            throw new PriceException("价格超过100元！");
        }else if("暴力".equals(book.getText())| "恐怖".equals(book.getText())){
            throw new TextException("包含禁词！");
        }
        else{
            return true;
        }

    }
}
