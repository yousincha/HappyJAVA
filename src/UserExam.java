public class UserExam {
    public static void main(String[] args){
        User user = new User("yougod@nate.com","yougod");
//        System.out.println(user.getEmail());
//        System.out.println(user.getName());
        System.out.println(user);
        User user2 = new User("megod@nate.com","1234","megod");
        System.out.println(user2.getEmail());
        System.out.println(user2.getPassword());
        System.out.println(user2.getName());
        System.out.println(user2);
    }
}
