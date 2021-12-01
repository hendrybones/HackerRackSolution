package com.company;

import java.util.List;

public class BirthdayCandle {

    public static int candleCake(List<Integer>candles){
        int maximum=Integer.MIN_VALUE;

        // height of the tallest
        for (Integer candle:candles){
            if (candle>=maximum)
                maximum=candle;
        }
        //count how many tallest candles present
        int result=0;
        for (Integer candle: candles) {
            if (candle == maximum)
                result++;
        }
        return result;

    }

}
