package assignment2_part2;

/**
 * Created by zhong on 16/4/22.
 */
public class Bird extends Animal
{
    private double altitude;
    //Constructor.
    public Bird(String name, double weight, double altitude)
    {
        super(name, weight);
        this.altitude = altitude;
    }
    //Method to get altitude.
    public double getAltitude()
    {
        return altitude;
    }
    //TestBird method.
    public static void TestBird()
    {
        Bird b = new Bird("Fly",1.0,300.0);
        //Chcek name.
        System.out.print("Check name: ");
        System.out.print(b.getName() == "Fly");
        System.out.println();
        //Check weight.
        System.out.print("Check weight: ");
        System.out.print(b.getWeight() == 1.0);
        System.out.println();
        //Check altitude.
        System.out.print("Check altitude: ");
        System.out.print(b.getAltitude() == 300.0);
        System.out.println();
    }
}
