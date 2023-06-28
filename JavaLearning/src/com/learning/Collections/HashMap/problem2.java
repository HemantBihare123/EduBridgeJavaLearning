package com.learning.Collections.HashMap;

import java.util.Map;
import java.util.HashMap;

public class problem2 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};

        int i;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for (i = 0; i < arr.length-1; i+=2)
        {
            mp.put(arr[i],arr[i+1]);
        }

        if(i==(arr.length-1))
        {
            mp.put(arr[i],null);
        }
        System.out.println("Map formed is below");
       
        for(Map.Entry e: mp.entrySet())
        {
            System.out.println(e.getKey() + " " + e.getValue());
        }
        
    }
}