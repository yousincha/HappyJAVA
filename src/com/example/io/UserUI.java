package com.example.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;

public class UserUI {
    private BufferedReader br;

    public UserUI() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public int menu() {
        System.out.println("1.회원 등록하기");
        System.out.println("2.회원 목록보기");
        System.out.println("3.회원 정보 수정하기");
        System.out.println("4.회원 정보 삭제하기");
        System.out.println("5.종료");
        int menuId = -1;
        try {
            String line = br.readLine();
            menuId = Integer.parseInt(line); //문자열을 정수로 전환
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return menuId;

    }

    public String inputEmail(){
        System.out.println("수정할 회원의 email을 입력하세요.");
        String email = "";
        try {
            email = br.readLine();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return email;
    }

    public User inputUser(String email){
        try {
            System.out.println(email+"회원의 정보를 수정합니다.");
            System.out.println("이름을 입력하세요.");
            String name = br.readLine();
            System.out.println("생년을 입력하세요.");
            String strBirthYear = br.readLine();
            int birthYear = Integer.parseInt(strBirthYear);

            User user = new User(email, name, birthYear);
            return user;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    public User regUser() {
        try {
            System.out.println("email을 입력하세요.");
            String email = br.readLine();
            System.out.println("이름을 입력하세요.");
            String name = br.readLine();
            System.out.println("생년을 입력하세요.");
            String strBirthYear = br.readLine();
            int birthYear = Integer.parseInt(strBirthYear);

            User user = new User(email, name, birthYear);
            return user;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public static void printUserList(Iterator<User> iter) {
        System.out.println("email          이름          생년");
        System.out.println("================================");
        while (iter.hasNext()){
            User user = iter.next();
            System.out.print(user.getEmail());
            System.out.print("     ");
            System.out.print(user.getName());
            System.out.print("     ");
            System.out.print(user.getBirthYear());
            System.out.println();
        }
    }

}