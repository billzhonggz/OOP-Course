package assignment2_part3;

/**
 * Created by zhong on 16/4/22.
 */
public class Chicken extends Bird
{
    public Chicken(String name, double weight, double altitude)
    {
        super(name, weight, altitude);
    }

    public static void TestChicken()
    {
        Chicken k = new Chicken("Chick",5.0,0.0);
        //Chcek name.
        System.out.print("Check name: ");
        System.out.print(k.getName() == "Chick");
        System.out.println();
        //Check weight.
        System.out.print("Check weight: ");
        System.out.print(k.getWeight() == 5.0);
        System.out.println();
        //Check altitude.
        System.out.print("Check altitude: ");
        System.out.print(k.getAltitude() == 0.0);
        System.out.println();
    }
}
