import java.io.FileReader;
import java.io.Reader;

public class HelloIO04 {
    public static void main(String[] args) throws Exception{
        Reader in = new FileReader("./tmp/hello.txt");
//        int ch1 = in.read();
//        System.out.println((char) ch1); //1
//        int ch2 = in.read();
//        System.out.println((char) ch2); //255
//        int ch3 = in.read();
//        System.out.println((char) ch3); // 0
//        int ch4 = in.read();
//        System.out.println((char) ch4); //-1 (파일의 끝)
        int ch = -1;
        while ((ch = in.read())!= -1){
            System.out.println((char) ch);
        }
        in.close();
    }
}
