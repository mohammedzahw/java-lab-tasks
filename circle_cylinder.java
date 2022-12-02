import java.util.Scanner;
//class of circle
class circle
{
    double radius;
    //function to get area od circle
    double area_circle()
    {
        return 3.14*radius*radius;
    }
}
class cylinder extends circle
{
    double height;
    //function to get the volume of cylinder
    double volume ()
    {
        return height*area_circle();
    }
}
public class circle_cylinder {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //take an object form the class cylinder
        cylinder cyl=new cylinder();
        System.out.println("Enter the radius of circle and the height of cylinder");
        //get the radius of circle
        cyl.radius= in.nextDouble();
        //get the radius of circle
        cyl.height=in.nextDouble();
        //print the area of circle
        System.out.println("the area of circle is     "+cyl.area_circle());
        //print the volume of cylinder
        System.out.println("the volume of cylinder is "+cyl.volume());


    }

}