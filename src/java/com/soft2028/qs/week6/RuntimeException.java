package com.soft2028.qs.week6;

import java.util.Scanner;

/**
 * @ClassName RuntimeException
 * @Description 运行时异常练习
 * @Author Chris
 * @Date 2020/11/5
 **/
public class RuntimeException {
    public static void main(String[] args) {
        //1.ArithmeticException 算数异常

//        try {
//            System.out.println(3 / 0);
//        }catch (ArithmeticException e){
//            //e.printStackTrace();
//            System.err.println("除数不能为0！！");
//            System.err.println(e.getMessage());
//            System.err.println(e.getCause());
//            System.err.println(e);
//            e.printStackTrace();
//            JOptionPane.showMessageDialog(null,"除数不能为0！！");
//        }

        //2.从键盘输入一串字符，将其转为整型输出
        System.out.println("please input: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int result = 0;
        try {
            result = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("数字格式化异常！！");
        }finally {
            //应用场景：关闭数据库连接，线程资源的释放,流的关闭
            System.out.println("finish");
            scanner.close();
        }

        System.out.println("result");
        System.out.println("***********");

        //3.仿照完成ArrayIndexOutOfBoundsException的异常处理
        int[] arr = {1,2,3,4,5};
        try{
            for(int i=0;i<=arr.length;i++){
                System.out.println(arr[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界");
        }
        System.out.println("**************");
//        //4.关于空指针异常NullPointerException(NPE)的问题
////        String s = null;
////        if("admin".equals(s)) {
////            System.out.println("success");
////        } else{
////                System.out.println("failure");
////            }
//        String s = null;
//        if(s == null || "".equals(s)){
//            System.out.println("账号不能为空");
//        }
        }
    }
