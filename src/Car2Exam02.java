public class Car2Exam02 {
    public static void main(String[] args) {
//        Car2 c = new Car2("yougod");
//    Bus2 b =  new Bus2();
//    b.run();
//
//    SportsCar s1 = new SportsCar("sportsCar!!");
//    s1.run();
//
//    Car2 c = new SportsCar("sportsCar!!");
//    c.run();

    Car2[] array = new Car2[2]; // Car2를 2개를 참조할 수 있는 배열을 선언.
    array[0] = new Bus2();
    array[1] = new SportsCar("sportsCar!!");
    for(Car2 c2 : array ){
        c2.run();
    }
    }
}
