
/**
 * Sniya Gorthi
 * 9/1/2022
 * 2.9 program project (chapter 1/2 labs)
 * Determine the volume, surface area and circumference of a sphere given it's radius. 
 * Who helped me:
 *
 */
import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;
public class radius
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // initialize variables
        double radius;
        double volume;
        double surfacearea;
        double circum;
        
        
        DecimalFormat fint = new DecimalFormat ("0.####");
        
        //ask user for the radius of the sphere and assign the user's input to a variable called radius 
        System.out.println("What is the radius of the sphere?" );
        radius = input.nextDouble();
        
        // calculate volume, surface area and circumference of sphere 
        volume = (1.333333333)*(Math.PI)*Math.pow(radius,3);
        surfacearea = (4)*(Math.PI)*Math.pow(radius,2);
        circum = (2)*(Math.PI)*radius;
        
        //print out results with four decimal points 
        System.out.println("Volume: " +fint.format(volume));
        System.out.println("Surface Area: "+fint.format(surfacearea));
        System.out.println("Circumference: "+fint.format(circum));
        
        
        
    }
}
