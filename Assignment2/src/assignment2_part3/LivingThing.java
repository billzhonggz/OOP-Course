package assignment2_part3;

/**
 * Created by zhong on 16/4/22.
 */
public class LivingThing
{
    private String name;

    public LivingThing(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public static void TestLivingThing()
    {
        LivingThing lt = new LivingThing("Test");
        //Check name.
        System.out.print("Check name: ");
        System.out.println(lt.getName() == "Test");
    }
}
