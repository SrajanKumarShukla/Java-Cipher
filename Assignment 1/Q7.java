/*Write a program, creating a Triangle class which contains a method that takes three parameters of the three sides of the 
triangle, ‘a’, ‘b’, ‘c’, and returns you with the area of the triangle and print it.*/
import java.util.Scanner;
public class Triangle 
{
    public static void main(String[] args) 
    {
        double area = areamethod();
        System.out.format("\n The Area of triangle = %.2f\n", area);
    }
        public static double areamethod()
        {
            double s, Area;
            Scanner sc = new Scanner(System.in);
            System.out.println("\n Please Enter Three sides of triangle: ");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            s = (a + b + c) / 2;
            Area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            return Area;
        }
}
