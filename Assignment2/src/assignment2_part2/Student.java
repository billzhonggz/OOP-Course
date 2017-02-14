package assignment2_part2;

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

        /*****QUESTION11*****/
        //Change pet to a bird.
        //System.out.println("Change pet to bird: ");
        //Bird b1 = new Bird("Bird1",1.5,250.0);
        //s.changePet(b1);
        //Test get altitude.
        //System.out.print("Check altitude: ");
        //System.out.println(s.getPet().getAltitude() == 250.0);
        //Error: cannot resolve method getAltitude.
        //Explanation: Interface IPet doesn't have method "getAltitude()" and class "Bird" doesn't implement interface IPet.
        /********************/

        /*****QUESTION12*****/
        System.out.print("Change pet to a chicken: ");
        Chicken k1 = new Chicken("k1",2.0,0.0);
        s.changePet(k1);
        System.out.println(s.getPet() == k1);
        /********************/

    }
}
