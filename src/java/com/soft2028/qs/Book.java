package com.soft2028.qs;

import lombok.*;

import java.util.Date;

/**
 * @ClassName Book
 * @Description TODO
 * @Author Chris
 * @Date 2020/10/15
 **/

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {
    private String bookName;
    private int price;
    private Date date;

}
