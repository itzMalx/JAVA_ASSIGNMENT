package Java_practice;
import java.nio.file.Path;
import java.nio.file.Paths;
public class PathInterface {
    public static void main(String[] args) {
    	Path p1 = Paths.get("C:/Users/Prade/MainProject/Shopping-App-2");
        Path p2 = p1.subpath(1, 3);
        System.out.println("Original Path: " + p1);
        System.out.println("Sub Path: " + p2);
    }
}
