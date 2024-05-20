package com.example.thread;

// 1. Thread 클래스를 상속받는다.
public class MyThread extends Thread{
    private String str;

    public MyThread(String str){
        this.str=str;
    }
    // 2. run() 메소드를 오버라이딩 한다.
    // 동시에 실행시키고 싶은 코드 작성
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println("--- "+ name + " ---");
        for(int i=0; i<10; i++){
            System.out.print(str);
            try{
                Thread.sleep(1000); // 1초간 쉰다.}
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
