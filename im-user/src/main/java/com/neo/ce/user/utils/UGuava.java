package com.neo.ce.user.utils;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.base.Strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by neowyp on 2015/6/5.
 */
public class UGuava {
    public static void main(String[] args) {

        try {
            //判断字符串是否为空
            String tmp = null;
            boolean isNullorEmpty = Strings.isNullOrEmpty(tmp);
            System.out.println("isNullorEmpty : " + isNullorEmpty);

            //获取两个字符串相同的前缀和后缀
            String a = "com.gome.user";
            String b = "com.gome.account";
            String prefix = Strings.commonPrefix(a,b);
            System.out.println(prefix);

            String s1 = "test.jsp";
            String s2 = "img.jsp";
            String suffix = Strings.commonSuffix(s1, s2);
            System.out.println(suffix);

            //左右不全字符 【这个很有用】
            int strlen = 10;
            String padEnd = Strings.padEnd("" + 1234, strlen, '0');
            System.out.println(padEnd);

            String padStart = Strings.padStart("" + 432, strlen, '0');
            System.out.println(padStart);

            //Splittler拆分字符床
            Iterable<String> splitResults = Splitter.onPattern("[,，]{1,}")
                    .trimResults()
                    .omitEmptyStrings()
                    .split("hello,word,,世界，水平");
            for(String item : splitResults) {
                System.out.println(item);
            }

            //Splittler二次拆分
            String toSplitString = "a=b;c=d,e=f";
            Map<String,String> kvs = Splitter.onPattern("[,;]{1,}").withKeyValueSeparator('=').split(toSplitString);
            for (Map.Entry<String,String> entry : kvs.entrySet()) {
                System.out.println(String.format("%s=%s", entry.getKey(),entry.getValue()));
            }

            //字符串合并
            String joinStr = Joiner.on(" ").join(new String[] {"hello", "my", "world"});
            System.out.println(joinStr);

            //合并map
            Map<String, String> map = new HashMap<String, String>();
            map.put("ip", "10.10.0.123");
            map.put("port", "8090");
            String mapStr = Joiner.on("\r\n").withKeyValueSeparator("=").join(map);
            System.out.println(mapStr);


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
