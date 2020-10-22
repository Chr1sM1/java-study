    package com.soft2028.qs;

    import lombok.*;

    /**
     * @ClassName student
     * @Description TODO
     * @Author Chris
     * @Date 2020/10/15
     **/
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder

    public class Student {
        private String id;
        private String gender;
        private String studentName;
        private Book[] books;


    }
