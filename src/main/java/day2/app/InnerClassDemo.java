package day2.app;

import java.util.Random;

public class InnerClassDemo {
    public static void main(String[] args) {
        int n = 10000;
        Random random = new Random();
        int[] numbers = new int[n];
        for(int i = 0 ; i < numbers.length; i++){
            numbers[i] = random.nextInt(100000);
        }
        //klasa wewnętrzna w metodzie;
        class Result {
            int index;
            int max;

            public Result() {
                index = 0;
                max = Integer.MIN_VALUE;
            }
        }
        Result result = new Result();
        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] > result.max){
                result.max = numbers[i];
                result.index = i;
            }
        }
        System.out.println("Pozycja wartości największej " + result.max +" to " + result.index);
    }
}
