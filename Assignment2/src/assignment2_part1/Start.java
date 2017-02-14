package assignment2_part1;

/**
 * Created by zhong on 16/4/20.
 */
public class Start
{
    public static void main (String[] args)
    {
        System.out.println("Start class in PART 1");
        System.out.println("TestStudent");
        Student.TestStudent();
        System.out.println("TestCat");
        Cat.TestCat();
        System.out.println("TestDog");
        Dog.TestDog();

        /*****QUESTION 7*****/
        //Dog d1 = new Dog("Jack",5.0);
        //Student s1 = new Student("Bush",d1);
        //Appearance: Student(String, Cat) cannot apply to Student(String, Dog).
        /*******************/
    }
}
