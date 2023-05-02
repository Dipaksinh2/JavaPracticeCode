package org.example;

import java.util.*;

public class FrequencyClass {
    public static void main(String[] args) {
        String[] a={"Car","Old Car","Car","No Car","Old Car"};

        List<String> strList= Arrays.asList(a);
        System.out.println(strList.toString());

        Set<String> strSet=new HashSet<>(strList);
        for (String data:strSet){
            System.out.println(data+"\t"+Collections.frequency(strList,data));
        }





    }
}
