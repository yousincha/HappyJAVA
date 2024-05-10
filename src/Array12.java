import java.util.Arrays;

public class Array12 {
    public static void main(String[] args) {
        int[] array1 = {101,2,3,4,5};
        int[] array2 = {100,2,3,4,5};
//        int[] array1 = {1,2,3,4,6};
//        int[] array2 = {1,2,3,4,4};

//        양수, 0, 음수 (비교 시)
//        x-y = 결과가 양수가 나왔다면?
        int compare = Arrays.compare(array1,array2);

        System.out.println(compare);
    }
}
