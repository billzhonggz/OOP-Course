package assignment2_part3;

/**
 * Created by zhong on 16/4/20.
 */
public class Student extends LivingThing
{
    //Remove variable private String name;
    private IPet pet;
    //Constructor.
    public Student(String name, IPet pet)
    {
        super(name);
        //Remove statement this.name = name;
        this.pet = pet;
    }

    //Remove method public String getName()

    public IPet getPet()
    {
        return pet;
    }

    public void changePet(IPet pet)
    {
        this.pet = pet;
    }
    //Test method.
    public static void TestStudent()
    {
        //Create a new object of cat.
        Cat c = new Cat("Mewo",2.0);
        //Check name.
        Student s = new Student("Smith",c);
        System.out.print("Check student name: ");
        System.out.println(s.getName() == "Smith");
        //Check pet.
        System.out.print("Check student pet: ");
        System.out.println(s.getPet() == c);
        //Check changePet.
        System.out.print("Check change pet: ");
        Dog d1 = new Dog("A",3.0);
        s.changePet(d1);
        System.out.println(s.getPet() == d1);
        System.out.print("Change pet to a chicken: ");
        Chicken k1 = new Chicken("k1",2.0,0.0);
        s.changePet(k1);
        System.out.println(s.getPet() == k1);
    }
}
