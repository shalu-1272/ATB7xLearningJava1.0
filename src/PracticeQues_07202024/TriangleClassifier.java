package PracticeQues_07202024;
import java.util.Scanner;
public class TriangleClassifier {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimensions: length , breadth and width");
        float length = sc.nextFloat();
        float width = sc.nextFloat();
        float breadth = sc.nextFloat();

        if (length==breadth && breadth==width)
        {
            System.out.println("Equilateral Triangle");
        }
        else if (length==breadth || length == width && width != breadth)
        {
            System.out.println("Isosceles Triangle");
        }
        else if (breadth==width || breadth == length && length != width)
        {
            System.out.println("Isosceles Triangle");
        }
        else if (width == breadth || width == length && length != breadth)
        {
            System.out.println("Isosceles Triangle");
        }
        else
        {
            System.out.println("Scalene Triangle");
        }

    }
}
