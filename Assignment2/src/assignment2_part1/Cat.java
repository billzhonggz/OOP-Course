package assignment2_part1;

/**
 * Created by zhong on 16/4/20.
 */
public class Cat implements IPet
{
    private String name;
    private double weight;
    //Constructor.
    public Cat(String name, double weight)
    {
        this.name = name;
        this.weight = weight;
    }
    //Method return name.
    public String getName()
    {
        return name;
    }
    //Method return weight.
    public double getWeight()
    {
        return weight;
    }
    //Method "feed" make weight add by 1.0.
    public void feed()
    {
        weight = weight + 1.0;
    }
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
        //Feed and check weight after feed.
        c.feed();
        //Chcek name.
        System.out.print("Check name after feed: ");
        System.out.print(c.getName() == "Meow");
        System.out.println();
        //Check weight.
        System.out.print("Check weight after feed: ");
        System.out.print(c.getWeight() == 3.0);
        System.out.println();
    }
}
