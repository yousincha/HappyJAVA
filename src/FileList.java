import java.io.File;

public class FileList {
    public static void main(String[] args) {
        File file = new File("/tmp/a.txt");
        printFiles(file);
    }

    private static void printFiles(File file) {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++) {
                System.out.println("[dir] - "+files[i]);
                printFiles(file);
            }
        }else if(file.isFile()){
            System.out.println(file.getName());
        }
        else {
            System.out.println("else --"+file.getName());
        }
    }
}

