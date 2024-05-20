package com.example.net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class VerySimpleWebServer {
    public static void main(String[] args) throws Exception{
        // 9090 port로 대기한다.
        ServerSocket ss = new ServerSocket(9090);

        // 클라이언트를 대기한다.
        // 클라이언트가 접속하는 순간, 클라이언트와 통신할 수 있는 socket을 반환한다.
        // 브라우저에서 http://127.0.0.1:9090/을 입력한다.
        // 2번째는 http://127.0.0.1:9090/board/hello.html
        System.out.println("클라이언트 접속을 기다립니다.");
        // socket은 브라우저(client)와 통신할 수 있는 객체다.
        Socket socket = ss.accept();

        // Client와 읽고 쓸수있는 InputStream, OutputStream이 반환된다.
        OutputStream out = socket.getOutputStream();
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
        InputStream in = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String firstLine = br.readLine();
        List<String> headers = new ArrayList<>();
        String line = null;
        while (!(line = br.readLine()).equals("")){
            headers.add(line);
        }
        //요청정보 읽기 끝
        System.out.println(firstLine);
        for(int i = 0; i< headers.size(); i++){
            System.out.println(headers.get(i));
        }

        // 서버에게 응답메시지 보내기
        // HTTP/1.1 200 OK <-- 상태메시지
        // 헤더1
        // 헤더2
        // 빈줄
        // 내용.
        pw.println("HTTP/1.1 200 OK");
        pw.println("name: yougod");
        pw.println("email: yougod@example.com");
        pw.println();
        pw.println("<html>");
        pw.println("<h1>Hello!!</h1>");
        pw.println("</html>");
        pw.close();

//        // Http프로토코은 클라이언트가 정보를 서버에게 보내준다. (요청정보)
//        byte[] buffer = new byte[512];
//        int readCount = 0;
//
//        while ((readCount = in.read(buffer))!=-1){
//            System.out.write(buffer,0,readCount);
//        }
//
//        System.out.println(socket.toString());

        ss.close();
        System.out.println("서버가 종료됩니다.");
    }
}
