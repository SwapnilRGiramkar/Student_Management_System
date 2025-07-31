//In this Student class is blueprint of student
public class Student
{
    private int id;
    private String name;
    private int age;
    private double marks;
     Student()
     {
     }
     Student(int id,String name,int age,double marks)
     {
         this.id=id;
         this.name=name;
         this.age=age;
         this.marks=marks;
     }

     public String getName()
     {
         return name;
     }
     public int getAge()
     {
         return age;
     }
     public double getMarks()
     {
         return marks;
     }
    public int getId()
    {
        return id;
    }
    public int setId(int id)
    {
        this.id=id;
        return id;
    }
     public String setName(String name)
     {
         this.name=name;
         return name;
     }
     public int setAge(int age)
     {
        this.age=age;
        return age;
     }
     public double setMarks(double marks)
     {
         this.marks=marks;
         return marks;
     }


}
