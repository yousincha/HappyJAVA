public class User {
    private String email;
    private String password;
    private String name;

    // 생성자를 하나라도 만들게 되면 기본 생성자가 만들어지지 않는다.
    public User(String email, String name) {
        // 자신의 생성자 호출 
        this(email,null,name);
        System.out.println("hello");
    }

    // 생성자 오버로딩
    public User(String email,String password, String name) {
        this.email = email;
        this.password = password;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
