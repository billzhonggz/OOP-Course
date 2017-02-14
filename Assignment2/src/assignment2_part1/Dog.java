package assignment2_part1;

/**
 * Created by zhong on 16/4/20.
 */
public class Dog implements IPet
{
    private String name;
    private double weight;

    public Dog(String name, double weight)
    {
        this.name = name;
        this.weight = weight;
    }

    public String getName()
    {
        return name;
    }

    public double getWeight()
    {
        return weight;
    }

    public void feed()
    {
        weight = weight + 2.0;
    }

    public static void TestDog()
    {
        Dog d = new Dog("Woof", 2.0);
        //Test dog name.
        System.out.print("Check dog's name: ");
        System.out.println(d.getName() == "Woof");
        //Check dog weight.
        System.out.print("Check dog's weight: ");
        System.out.println(d.getWeight() == 2.0);
        //Check dog weight after feeding.
        d.feed();
        System.out.print("Check dog's weight after feeding: ");
        System.out.println(d.getWeight() == 4.0);
    }
}
