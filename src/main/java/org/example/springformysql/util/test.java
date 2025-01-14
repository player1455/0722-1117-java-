package org.example.springformysql.util;

import org.apache.logging.log4j.util.StringBuilders;

public class test {


    public StringBuilder createStringBuilder() {
        return new StringBuilder("Hello world");
    }

    public static void main(String[] args) {
        test t = new test();
        StringBuilder sb = t.createStringBuilder();
        sb.append("a") ;
        System.out.println(sb);

    }
}
