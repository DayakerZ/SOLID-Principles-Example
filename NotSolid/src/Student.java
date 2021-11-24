public class Student {

    protected String rollNo;
    protected String name;
    protected Department department;
    protected String typeOfEducation;
    protected String role;
    public Student(String rollNo,String name,Department department,String typeOfEducation,String role){
        this.rollNo = rollNo;
        this.name = name;
        this.department = department;
        this.typeOfEducation = typeOfEducation;
        this.role = role;
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
    //Liskov's substitution principle violation
    public String getRole(){
        return role;
    }
}



