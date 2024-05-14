public class Exception5 {
    public static void main(String[] args) {
        int[] array = {4};
        int[] value = new int[1];
        try {
            value[0] = array[0]/array[1];
        }catch (ArrayIndexOutOfBoundsException aiob){
            // Array 범위를 벗어났을 때 발생
            System.out.println(aiob.toString());
        }catch (ArithmeticException ae){
            // 연산 에러
            System.out.println(ae.toString());
        }catch (Exception ex){
            System.out.println(ex);
        }
    }
}
