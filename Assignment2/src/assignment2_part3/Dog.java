package assignment2_part3;

/**
 * Created by zhong on 16/4/20.
 */
public class Dog extends Animal
{
    private String name;
    private double weight;

    public Dog(String name, double weight)
    {
        super(name,weight);
    }

    //Removed method public String getName()
    //Removed method public double getWeight()
    //Removed method public void feed()

    //Test method.
    public static void TestDog()
    {
        Dog d = new Dog("Woof", 2.0);
        //Test dog name.
        System.out.print("Check dog's name: ");
        System.out.println(d.getName() == "Woof");
        //Check dog weight.
        System.out.print("Check dog's weight: ");
        System.out.println(d.getWeight() == 2.0);
    }
}
