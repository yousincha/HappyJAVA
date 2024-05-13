    import java.util.ArrayList;
    import java.util.Collection;
    import java.util.HashSet;
    import java.util.Iterator;

    public class ListExam03 {
        public static void main(String[] args) {
            Collection<String> collection = new HashSet<>(); //collection을 구현하고 있는 자료구조
            collection.add("kim");
            collection.add("lee");
            collection.add("hong");

            System.out.println(collection.size());

            Iterator<String> iter = collection.iterator();
            while (iter.hasNext()){
                String str = iter.next();
                System.out.println(str);
            }
        }
    }