//This is main class of project
import java.util.*;
public class MainApp extends Student
{
    public static void main(String[] args)
    {
        StudentDAO dao=new StudentDAO();
        Scanner sc=new Scanner(System.in);

        while(true)
        {
            System.out.println("\n 1.Add Student \n 2.View Student \n 3.Delete Student \n 4.Update Data \n 5.Exit");
            int choice =sc.nextInt();
            sc.nextLine();
            switch(choice)
            {
                case 1:
                {
                    System.out.println("Enter your Name : ");
                    String name=sc.nextLine();
                    System.out.println("Enter Your Age : ");
                    int age=sc.nextInt();
                    System.out.println("Enter Your Marks :");
                    double marks=sc.nextDouble();

                    Student s=new Student();
                    s.setName(name);
                    s.setAge(age);
                    s.setMarks(marks);

                    dao.addStudent(s);
                    break;
                }
                case 2:
                {
                    dao.viewStudent();
                    break;
                }
                case 3:
                {
                    System.out.println("Enter Id which you want to DELETE");
                    int id=sc.nextInt();
                    dao.deleteStudent(id);
                    break;
                }
                case 4:
                {
                    System.out.print("Enter student ID to update: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // consume newline

                    System.out.print("Enter new name: ");
                    String newName = sc.nextLine();
                    System.out.print("Enter new age: ");
                    int newAge = sc.nextInt();
                    System.out.print("Enter new marks: ");
                    double newMarks = sc.nextDouble();

                    Student updatedStudent = new Student();
                    updatedStudent.setId(id);
                    updatedStudent.setName(newName);
                    updatedStudent.setAge(newAge);
                    updatedStudent.setMarks(newMarks);

                    dao.updateStudent(updatedStudent);
                    break;
                }
                case 5:
                {
                    System.out.println("EXIT the Program! Have A Nice Day!");
                    return;
                }
                default :
                {
                    System.out.println("Invalid Choice!");
                }
            }
        }
    }
}

