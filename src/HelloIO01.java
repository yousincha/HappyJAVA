import java.io.FileOutputStream;
import java.io.OutputStream;

public class HelloIO01 {
    public static void main(String[] args) throws Exception{
//        // 현재 작업 디렉토리 출력
//        String currentDirectory = System.getProperty("user.dir");
//        System.out.println("현재 작업 디렉토리: " + currentDirectory);
        OutputStream out = new FileOutputStream("./tmp/a.dat");
        out.write(1); //0000 0000  0000 0000  0000 0000  0000 0001
        out.write(255);
        out.write(0);
        out.close();
    }
}
