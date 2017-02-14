package assignment2_part2;

/**
 * Created by zhong on 16/4/22.
 */
public class Animal implements IPet
{
    private String name;
    private double weight;

    public Animal(String name, double weight)
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

    public static void TestAnimal()
    {
        System.out.println("Start TestAnimal: ");
        Animal c = new Animal("Meow",2.0);
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
