package com.example;

public class MyRunnableMain {
    public static void main(String[] args) {
        
//        Lambda 인터페이스 - 메소드를 하나만 가지고 있는 인터페이스
//        runnableExecute.execute(()-> {
//                    System.out.println("hello!");
//                }
//        );

        MyRunnable r = new MyRunnable() {
            @Override
            public void run() {
                System.out.println("myrunnable run!!");
            }
        };
        r.run();
    }
}
