import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n= sc.nextInt();
        ArrayList<Integer> list= new ArrayList<>(n);
        int a;
        for(int i=1;i<=n;i++) 
        {
            try
            {
                a=sc.nextInt();
            }catch (InputMismatchException e) 
            {
                System.out.println("Can only enter Integer values");
                break;
            }
            list.add(a);
        }
        for (Integer integer : list) 
        {
            System.out.println((0.67)*integer + " ");
        }
    }
}
