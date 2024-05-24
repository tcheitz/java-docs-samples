package com.example.concurrency;

public class SleepMessages {
    public static void main(String[] args) throws InterruptedException {
        String[] importantInfo = {"sa re ga me","pa da ni se","marchi veysey","that's what we say"};
        for (int i=0;i<importantInfo.length;i++){
            Thread.sleep(4000); // pause 4 seconds
            System.out.println(importantInfo[i]); // print message
        }
    }
}
