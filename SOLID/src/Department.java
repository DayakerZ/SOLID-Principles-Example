
interface Department {

    public String getDepartmentName();
}
class CSE implements Department{

    private String departmentName = "Computer Science";
    public String getDepartmentName(){
        return departmentName;
    }
}
class ECE implements Department{

    private String departmentName = "Electronics and Communication Engineering";
    @Override
    public String getDepartmentName() {
        return departmentName;
    }
}
class EEE implements Department{

    private String departmentName = "Electrical and Electronics Engineering";
    @Override
    public String getDepartmentName() {
        return departmentName;
    }
}


