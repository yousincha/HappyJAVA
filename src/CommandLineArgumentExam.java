public class CommandLineArgumentExam {
    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("사용법: CommandLineArgumentExam 값 값...");
            System.exit(0); // return으로 변경 가능
        }

        for(String arg: args){
            System.out.println(arg);
        }
    }
}

/*
*   Hello.java 파일 작성하고
*   javac Hello.java
*   명령을 실행할 때 성공하면 아무런 메시지도 출력하지 않는다.
*   Linux도 Unix 계열
*   작은 명령어들을 조합해서 또 다른 명령을 만든다. (쉘 스크립트 작성)
*   작은 명령들이 실행되고 종료될 때.
*/