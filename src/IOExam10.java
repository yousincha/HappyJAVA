import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IOExam10 {
    public static void main(String[] args) throws Exception{
        // 키보드로부터 한 줄씩 입력받는다.
        // BufferedReader의 readLine()을 이용해야 한줄 씩 입력 받을수 있다.
        // BufferedReader는 장식역할을 수행한다.

        // 키보드를 나타내는 것은 System.in - 주인공 - InputStream
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        System.out.println(line);
        br.close();
    }
}
