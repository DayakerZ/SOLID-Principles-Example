abstract class PrintReceipt {
    Calculate calculatedBill;
    Student student;
    public PrintReceipt(Calculate calculatedBill, Student student){
        this.student = student;
        this.calculatedBill = calculatedBill;
    }
    public void printReceipt(){
        System.out.println("Name : "+student.getName());
        System.out.println("Roll Number : "+student.getRollNo());
        System.out.println("Department: "+student.getDepartment().getDepartmentName());
        System.out.println("Total : "+ calculatedBill.calculateBill());

    }

}