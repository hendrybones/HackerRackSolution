package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MiniMaxSum {
    public static void miniMax(List<Integer>arr) {
        long min = 0;
        long max = 0;
        long sum = 0;

        Collections.sort(arr);
        for (int i = 0,j = arr.size() - 1;i<arr.size()-1;
             i++,j--){
            min +=arr.get(i);
            max+=arr.get(i);
        }

//        int arraySIze=arr.size();
//        min= arr.get(0);
//        max=min;
//        sum=min;
//
//        for (int i=1;i<arraySIze;i++){
//            sum+=arr.get(i);
//
//            if (arr.get(i)<min){
//                min=arr.get(i);
//            }
//            if (arr.get(i)>min){
//                max=arr.get(i);
//            }
//      }
       System.out.println(min +" "+max);
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());



        bufferedReader.close();
    }
    
    
}
