/*Design a Calculator class which contains four lambda methods:
	a. add(a, b)
	b. difference(a, b)
	c. product(a, b)
	d. safeDivision(a, b)
Also design the main methods which pass actual parameters to test the Calculator class.*/
import java.util.Scanner;
interface op
{
    int operations(int a,int b);
}
public class Calculator
{
    public static void main(String[] args)
    {
        op addition= (int a, int b)-> a+b;
        op difference=(int a, int b)-> a-b;
        op product=(int a, int b)-> a*b;
        op safeDivision=(int a, int b)-> a/b;     
        System.out.println("1.Addition\n2.Difference\n3.Product\n4.SafeDivision");
        System.out.println("Enter the option");
        int n=sc.nextInt();
        switch (n)
        {
            case 1:System.out.println("Addition = "+addition.operations(2,3));
            break;
            case 2:System.out.println("Difference = "+difference.operations(5,2));
            break;
            case 3:System.out.println("Product = "+product.operations(2,5));
            break;
            case 4:System.out.println("SafeDivision = "+safeDivision.operations(10,2));
            break;
        }
    }
}
