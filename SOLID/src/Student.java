public class Student {

    protected String rollNo;
    protected String name;
    protected Department department;

    public void setRollNo(String rollNo){
        this.rollNo = rollNo;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDepartment(Department department){
        this.department = department;
    }
}
class Studentgetter extends Student{

    public String getRollNo(){
        return rollNo;
    }
    public Department getDepartment(){
        return department;
    }
    public String getName(){
        return name;
    }
}

