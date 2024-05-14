public class DaySwitchTest {
    public static void main(String[] args) {
        Day day = Day.MONDAY;

        switch (day){
            case SUNDAY -> System.out.println("일요일입니다.");
            case MONDAY -> System.out.println("월요일입니다.");
            default -> System.out.println("그 밖의 요일");
        }
    }
}
