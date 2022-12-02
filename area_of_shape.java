import java.util.Scanner;

public class area_of_shape {
    class area_Perimeter
    {
        //function to get the area of triangle
        static void triangle_area(float base,float height)
        {
            System.out.println("the area of triangle ="+(.5*base*height));
        }
        //function to get the perimeter of triangle
        static void triangle_Perimeter(float l1,float l2,float l3)
        {
            System.out.println("the perimeter of triangle="+(l1+l2+l3));
        }
        //function to get the area of circle
        static void circle_area(float d)
        {
            System.out.println("the area of circle ="+(3.14*(d*d)));
        }
        //function to get the permiter of the circle
        static void circle_Perimeter(float d)
        {
            System.out.println("the circumference of circle="+(2*3.14*d));
        }
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the lengths and the height of triangle base l2 l3 height and the diameter of circle");
        float base=in.nextFloat();
        float l2=in.nextFloat();
        float l3=in.nextFloat();
        float height =in.nextFloat();
        float diameter=in.nextFloat();
        diameter/=2;
        area_Perimeter.triangle_area(base,height);
        area_Perimeter.triangle_Perimeter(base,l2,l3);
        area_Perimeter.circle_area(diameter);
        area_Perimeter.circle_Perimeter(diameter);

    }
}