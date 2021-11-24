class StudentWithRole extends Student {
    private String role;


    public StudentWithRole(String rollNo, String name, Department department,String typeOfEducation,String role) {
        super(rollNo, name, department,typeOfEducation);
        this.role = role;
    }

    public String getRole(){
        return role;
    }
}