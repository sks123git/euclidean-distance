import java.util.Scanner;
// program to find euclidean distance
public class Distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x; //x axis
        double y; //y axis
        double distance;
        System.out.println("Enter point x:");
        x = scanner.nextInt();
        System.out.println("Enter point y:");
        y = scanner.nextInt();

        distance = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));

        System.out.println("The distance is: " + distance);
    }
}