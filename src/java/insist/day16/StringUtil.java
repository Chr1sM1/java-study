package insist.day16;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName StringUtil
 * @Description 字符串操作
 * @Author Chris
 * @Date 2020/11/6
 **/
public class StringUtil {
    /**
     * 判断是否是空字符串 null和 “”都返回true
     *
     * @param str 判断的字符串
     * @return 是否有效
     */
    public static boolean isEmpty(String str){
        return  str == null || "".equals(str);
    }

    /**
     * 把string array or list 用给定的符号symbol连接成一个字符串
     *
     * @param list 需要处理的列表
     * @param symbol 链接的符号
     * @return 处理后的字符串
     */
    public static String joinString(List<Object> list, String symbol){
        StringBuilder result = new StringBuilder();
        if(list!=null){
            for(Object o : list){
                String temp = o.toString();
                if(temp.trim().length()>0){
                    result.append(temp).append(symbol);
                }
            }
            if(result.length()>1){
                result = new StringBuilder(result.substring(0,result.length()-1));
            }
        }
        return result.toString();
    }

    /**
     * 隐藏邮件地址前缀
     *
     * @param email -EMail邮箱地址 例如:ssss@qq.com 等等...
     * @return 返回已隐藏前缀邮件地址，如*********@qq.com
     */
    public static String getHideEmailPreix(String email){
        if(null != email){
            int index = email.lastIndexOf("@");
            if(index>1){
                email = repeat("*",index).concat(email.substring(index));
            }
        }
        return email;
    }

    /**
     * repeat - 通过源字符串重复生成N次组成新的字符串。
     *
     * @param src - 源字符串 例如：空格(" "),星号("*"),"浙江"等等...
     * @param num - 重复生成次数
     * @return 返回已生成的重复字符串
     */
    public static String repeat(String src,int num){
        StringBuilder s = new StringBuilder();
        for(int i = 0;i<num;i++){
            s.append(src);
        }
        return s.toString();
    }

    /**
     * 截取字符串左侧的Num位截取到末尾
     *
     * @param str1 处理的字符串
     * @param num 开始位置
     * @return 截取后的字符串
     */
    public static String lTrim(String str1 , int num){
        String tt = "";
        if(!isEmpty(str1)&&str1.length()>=num){
            tt = str1.substring(num,str1.length());
        }
        return tt;
    }

    /**
     * 根据指定的字符把源字符串分割一个list
     *
     * @param src 处理的字符串
     * @param pattern 分割字符串
     * @return 处理后的list
     *
     */
    public static List<String> parseString2List(String src,String pattern){
        List<String> list = new ArrayList<>();
        if(src != null){
            String[]tt = src.split(pattern);
            list.addAll(Arrays.asList(tt));
        }
        return list;
    }

    /**
     * 格式化一个float
     *
     * @param format 要格式化成的格式 such as #.00,#.#
     * @return 格式化后的字符串
     */
    public static String formatDouble(double f , String format){
        DecimalFormat df = new DecimalFormat(format);
        return df.format(f);
    }

    /**
     * 截取字符串左侧指定长度的字符串
     *
     * @param input 输入字符串
     * @param count 截取长度
     * @return 截取字符串
     */
    public static String left(String input , int count){
        if(isEmpty(input)){
            return "";
        }
        count = Math.min(count,input.length());
        return input.substring(0,count);
    }

    /**
     * 删除所有的标点符号
     *
     * @param str 处理的字符串
     */
    public static String trimPunct(String str){
        if(isEmpty(str)){
            return "";
        }
        return str.replaceAll("[\\pP\\p{Punct}]","");
    }

    /**
     * 获取字符串str在String中出现的次数
     *
     * @param string 处理的字符串
     * @param str 子字符串
     */
    public static int countSubStr(String string,String str){
        if((str == null) || (str.length() == 0) || (string == null) || (string.length() == 0)){
            return 0;
        }
        int count = 0;
        int index = 0;
        while ((index = string.indexOf(str,index)) != -1){
            count++;
            index += str.length();
        }
        return count;
    }
}
