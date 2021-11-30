package com.company;

import javax.xml.transform.Result;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Main {

        /*
         * Complete the 'plusMinus' function below.
         *
         * The function accepts INTEGER_ARRAY arr as parameter.
         */

        public static void plusMinus(List<Integer> arr) {
            // Write your code here
            double positive=0;
            double negative=0;
            double zero =0;
            int arraySize=arr.size();

            for (int i=0;i<arr.size();i++){
                if (arr.get(i)>0){
                    positive++;
                }else if (arr.get(i)<0){
                    negative++;
                }else{
                    zero++;
                }
            }
            System.out.println(positive/arraySize);
            System.out.println(negative/arraySize);
            System.out.println(zero/arraySize);

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

