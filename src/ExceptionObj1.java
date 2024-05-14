// A라는 사용자
public class ExceptionObj1 {
    /**
     * i를 k로 나눈 나머지를 반환한다.
     *
     * @param
     * @param
     * @return
     * @throws ArithmeticException
     */
    public int divide(int i, int k) throws ArithmeticException {
        int value = 0;
        value = i / k;
        return value;
    }
}
