package com.zeroten.common.util;

public class CheckUtils {

    public static  boolean isAnyEmpty(String... args){
        if(args.length==0){
            return  false;
        }
        for (String arg : args) {
            if("".equals(arg)||arg==null){
                return  false;
            }
        }
        return  true;
    }

    public static void main(String[] args) {
        String[] arr=new String[]{"1",null,"","2"};
        System.out.println(isAnyEmpty(arr));
    }
}
