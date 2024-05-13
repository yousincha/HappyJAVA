public class Book {
    private String title;
    private int price; // field price

    // 필드의 값을 수정하고 얻기 위한 메소드를 만든다.
    // 예) setter, getter - 프로퍼티(property) - price property

    public int getPrice() {
        return this.price*2; // this는 나 자신 인스턴스를 참조하는 예약어이다.
    }

    public void setPrice(int price) {
        this.price = price;
    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }

    public String getName() {
        return title;
    }

    public void setName(String title) {
        this.title = title;
    }
}
