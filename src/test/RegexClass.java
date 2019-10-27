package test;

import java.util.regex.Pattern;

public class RegexClass {
    public static void main(String args[]){
        String content = "I love China.";
        String pattern = ".*China.*";
        boolean isMatch = Pattern.matches(pattern,content);
        System.out.println(isMatch);
    }
}
