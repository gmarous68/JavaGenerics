package com.section4;

import java.util.Arrays;
import java.util.List;

public class Exercise {    
    
    public static <T> void toList(T[] arr) {
        List<T> list = Arrays.asList(arr);
        
        for(T t : list)
        	System.out.println(t);
    }
    
    public static void main(String[] args) {
    	Integer[] arr = new Integer[] { 2, 8, 9, 5 };
    	
    	toList(arr);
	}
}
