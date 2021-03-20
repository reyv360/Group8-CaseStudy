package studentinformation;

public class Student 
{
    private String Fname;
    private intr studnum;
    private String Course;
    private String Address;

    //Method 1:reyval
    public void getFname(String Fname)
    {
        this.Fname = Fname;
    }
 
    public String showFname()
    {
        return Fname;
    }
    
    //Method 2: reyval
    public void getStudentNo(int studnum)
    {
        this.studnum = studnum;
    }
    
    public int showStudentNo()
    {
        return studnum;
    }
   
    //Method 3:JuanMiguel
    public void getCourse(Course)
    {
        this.Course = Course;
    }
 
    public String showCourse(String Course)
    {
        return Course;
    }
    
    //Method 4: Juanmiguel
    public void getAddress(Address)
    {
        this.Address = Address;
    }
    
    public String showAddress(String Address)
    {
        return Address;
    }