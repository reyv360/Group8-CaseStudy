package studentinformation;

public class Student 
{
    private String Fname;
    private intr studnum;
    private String Course;

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