package assignment2_part1;

/**
 * Created by zhong on 16/4/20.
 */
public class Student
{
    private String name;
    //private Cat pet;
    private IPet pet;
    //Constructor.
    //public Student(String name, Cat pet)
    public Student(String name, IPet pet)
    {
        this.name = name;
        this.pet = pet;
    }

    /*****QUESTION 8*****/
    //public Student(String name, Dog pet)
    //{
    //    this.name = name;
    //    this.pet = pet;
    //}
    //Appearance: Type is not match.
    /*******************/

    //Method to return name.
    public String getName()
    {
        return name;
    }
    //Method to return cat.
    //public Cat getPet()
    public IPet getPet()
    {
        return pet;
    }
    //public void changePet(Cat pet)
    public void changePet(IPet pet)
    {
        this.pet = pet;
    }
    public void goHome()
    {
        pet.feed();
    }
    //Test method.
    public static void TestStudent()
    {
        //Create a new object of Cat.
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
        //Cat c1 = new Cat("A",3.0);
        Dog d1 = new Dog("A",3.0);
        s.changePet(d1);
        System.out.println(s.getPet() == d1);
        //Check goHome method.
        s.goHome();
        System.out.print("Check goHome: ");
        System.out.println(s.getPet().getWeight() == 5.0);
    }
}
