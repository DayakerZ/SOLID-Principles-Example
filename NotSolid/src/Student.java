public class Student {

    protected String rollNo;
    protected String name;
    protected Department department;
    protected String typeOfEducation;
    protected String title;
    public Student(String rollNo,String name,Department department,String typeOfEducation,String title){
        this.rollNo = rollNo;
        this.name = name;
        this.department = department;
        this.typeOfEducation = typeOfEducation;
        this.title = title;
    }
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
    public String getTitle(){
        return title;
    }
}

class StudentWithTitle extends Student {


    public StudentWithTitle(String rollNo, String name, Department department, String typeOfEducation,String title) {
        super(rollNo, name, department, typeOfEducation,title);
    }
}
class StudentWithOutTitle extends Student{

    public StudentWithOutTitle(String rollNo, String name, Department department, String typeOfEducation) {
        super(rollNo, name, department, typeOfEducation);
    }
}


