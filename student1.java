package studentinformation;

public class Student 
{
    private String Fname;
    private intr studnum;
    private String Course;
    private String Address;
    private String guardian;
    private String Gender;

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

//Method 5:Greyam
    public void getguardian's name(guardian's name)
    {
        this.guardian's name = guardian's name;
    }
 
    public String showguardian's name(String guardian's name)
    {
        return guardian's name;
    }
    
    //Method 6: Greyam
    public void getGender(Gender)
    {
        this.Gender = Gender;
    }
    
    public String showGender(String Gender)
    {
        return Gender;
    }