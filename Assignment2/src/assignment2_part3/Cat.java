package assignment2_part3;

/**
 * Created by zhong on 16/4/20.
 */
public class Cat extends Animal
{
    private String name;
    private double weight;
    //Constructor.
    public Cat(String name, double weight)
    {
        super(name,weight);
    }
    //Removed method public String getName()
    //Removed method public double getWeight()
    //Removed method public void feed()
    //Test method.
    public static void TestCat()
    {
        Cat c = new Cat("Meow",2.0);
        //Chcek name.
        System.out.print("Check name: ");
        System.out.print(c.getName() == "Meow");
        System.out.println();
        //Check weight.
        System.out.print("Check weight: ");
        System.out.print(c.getWeight() == 2.0);
        System.out.println();
    }
}
