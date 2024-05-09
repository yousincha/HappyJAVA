public class Person {
    String name; // static이 없으면 인스턴스 필드
    String address;
    boolean isVip;
    static int count = 0; // 클래스 필드
    static { // 클래스 필드는 static 블록에서 초기화 할 수 있다.
        count = 100;
    }
    public void printName(){ // 인스턴스 메소드
        System.out.println("내 이름은"+name);
    }

    public static void printCount(){ // 클래스 메소드
//        System.out.println(name); // static한 메소드에서는 인스턴스 필드나, 인스턴스 메소드를 사용할 수 없다.
        System.out.println("count: "+count);
    }
}
