//Using DAO(Data Access Object) we perform CRUD Operation
import java.sql.*;
public class StudentDAO
{
    public void addStudent(Student s)
    {
        String query="INSERT INTO students(name,age,marks) VALUES (?,?,?)";
        try(Connection connection=DBConnection.getConnection();
        PreparedStatement pst=connection.prepareStatement(query))
        {
            pst.setString(1,s.getName());
            pst.setInt(2,s.getAge());
            pst.setDouble(3,s.getMarks());

            pst.executeUpdate();
            System.out.println("Student added Successfully");
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
    public void viewStudent()
    {
        String query="SELECT * FROM students";
        try(Connection connection =DBConnection.getConnection();
             Statement st=connection.createStatement();
             ResultSet rs=st.executeQuery(query))
        {
            while(rs.next())
            {
                System.out.println(rs.getInt("id") + " | " + rs.getString("name") +
                        " | " + rs.getInt("age") + " | " + rs.getDouble("marks"));
            }
        }
        catch(SQLException e)
        {
           System.out.println(e.getMessage());
        }
    }
    public void deleteStudent(int id)
    {
        String query="DELETE FROM students WHERE id=?";
        try(Connection connection=DBConnection.getConnection();
        PreparedStatement pst=connection.prepareStatement(query))
        {
            pst.setInt(1, id);
            int rowsAffected = pst.executeUpdate();
            if(rowsAffected>0)
            {
                System.out.println("DATA Deleted Successfully");
            }
            else
            {
                System.out.println("No student found with given ID.");
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
    public void updateStudent(Student d)
    {
        String query="Update students set name=?,age=?,marks=? where id=?";
        try(Connection conn=DBConnection.getConnection();
        PreparedStatement pst=conn.prepareStatement(query))
        {
            pst.setString(1,d.getName());
            pst.setInt(2,d.getAge());
            pst.setDouble(3,d.getMarks());
            pst.setInt(4,d.getId());

            int rowsAffected = pst.executeUpdate();
            if(rowsAffected>0)
            {
                System.out.println("DATA Updated Successfully");
            }
            else
            {
                System.out.println("No student found with given ID.");
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
}

