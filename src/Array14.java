import java.util.Arrays;

public class Array14 {
    public static void main(String[] args) {
        int[] array={5,4,3,1,2};

        Arrays.sort(array);

        // 1~100 x라는 숫자를 생각하자.
        // 20보다 크다
        // 50보다 작다
        // 1~100     50
        // 1~50      25
        // 25~49     ..

        int i = Arrays.binarySearch(array,4);
        System.out.println(i);
    }
}
