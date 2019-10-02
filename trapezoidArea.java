import java.util.Scanner;

public class trapezoidArea {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        
        System.out.print("\nEnter a top for the trapezoid    : ");
        double top    = s.nextDouble();
        System.out.print("\nEnter a bottom for the trapezoid : ");
        double bottom = s.nextDouble();
        System.out.print("\nEnter a height for the trapezoid : ");
        double height = s.nextDouble();

        double area = ((top + bottom) / 2) * height;
        System.out.printf("\nThe area of the trapezoid is %,.1f.\n\n", area);

        s.close();
    }
}