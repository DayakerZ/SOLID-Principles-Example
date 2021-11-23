public class Student {

    protected String rollNo;
    protected String name;
    protected Department department;
    protected String typeOfEducation;
    public Student(String rollNo,String name,Department department,String typeOfEducation){
        this.rollNo = rollNo;
        this.name = name;
        this.department = department;
        this.typeOfEducation = typeOfEducation;
    }
    public String getRollNo(){
        return rollNo;
    }
    public Department getDepartment(){
        return department;
    }
    public String getName(){
        return name;
    }
    public String getTypeOfEducation(){
        return typeOfEducation;
    }
}

class StudentWithTitle extends Student {
    private String title;

    public StudentWithTitle(String rollNo, String name, Department department,String typeOfEducation,String title) {
        super(rollNo, name, department,typeOfEducation);
        this.title = title;
    }

    public String getTitle(){
        return title;
    }
}
class Studentwithouttitle extends Student{
    public Studentwithouttitle(String rollNo, String name, Department department,String typeOfEducation) {
        super(rollNo, name, department,typeOfEducation);
    }
}

