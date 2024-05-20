package com.example.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputExam {
    public static void main(String[] args) throws Exception{
        User user = new User("hong@example.com","홍길동",1992);
//        /tmp/user.dat
    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("./tmp/users.dat"));
    out.writeObject(user);
    out.close();
    }
}
