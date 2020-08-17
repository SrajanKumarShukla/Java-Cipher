/*
Create two classes:
BaseClass
	The Rectangle class should have two data fields-width and height of int types. The class
	should have display() method, to print the width and height of the rectangle separated
	by space.
DerivedClass
	The RectangleArea class is derived from Rectangle class, i.e., it is the sub-class of
	Rectangle class.The class should have read_input() method, to read the values of width
	and height of the rectangle. The class should also overload the display() method to print
	the area (width*height) of the rectangle.
Input Format
	The first and only line of input contains two space separated integers denoting the
	width and height of the rectangle.
Constraints
	1 <= width, height <= 10^3
Output Format
	The output should consist of:
	Print the width and height of the rectangle.
	In the second line, print the area of the rectangle.
 */
import java.util.Scanner;
class Rectangle
{
    public int width,height;
    public void display(int width,int height)
    {
        System.out.println("Width : "+width+"\tHeight : "+height);
    }
}
class RectangleArea extends Rectangle
{
    public void read_input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Please Enter width and height: ");
        width = sc.nextInt();
        height= sc.nextInt();
    }
    public void display()
    {
        System.out.println("Area : "+width*height);
    }
}
public class Main 
{
	public static void main(String[] args) {
        RectangleArea area=new RectangleArea();
        area.read_input();
        area.display(area.width, area.height);
        area.display();
    }
}
