package com.data.plalindrome;

public class Plalindrome {
    public static void main(String[] args) {
        String s = ";";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char[] chars = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < chars.length; i++) {
            if(!Character.isLetterOrDigit(chars[i])){
                continue;
            }
            sb.append(chars[i]);
        }
        String s1 = sb.toString();
        String s2 = sb.reverse().toString();
        if(s1.equals(s2)){
            return true;
        }else {
            return false;
        }

    }
}
