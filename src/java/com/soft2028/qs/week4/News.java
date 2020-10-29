package com.soft2028.qs.week4;

/**
 * @ClassName News
 * @Description TODO
 * @Author Chris
 * @Date 2020/10/29
 **/
public class News implements MyComparable {
    private Integer id;
    private String title;
    private Integer readCount;

    public News(){

    }

    public News(Integer id,String title,Integer readCount)
    {
        this.id=id;
        this.title=title;
        this.readCount=readCount;
    }
    @Override
    public int compareTo(Object obj) {
        //把比较对象转化成具体的News类型
        News other = (News) obj;
        return this.readCount - other.readCount;
    }
    @Override
    public  String toString(){
        return "News:[id="+ this.id+",title"+this.title+",readCount"+this.readCount;
    }
}
