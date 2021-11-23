
interface Department {

    public String getDepartmentName();
}
class CSE implements Department{

    private final String departmentName = "Computer Science";
    public String getDepartmentName(){
        return departmentName;
    }
}
class ECE implements Department{

    private  final String departmentName = "Electronics and Communication Engineering";
    @Override
    public String getDepartmentName() {
        return departmentName;
    }
}
class EEE implements Department{

    private final String departmentName = "Electrical and Electronics Engineering";
    @Override
    public String getDepartmentName() {
        return departmentName;
    }
}

