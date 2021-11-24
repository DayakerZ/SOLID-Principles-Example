class PrintReceiptForRegularStudents extends PrintReceipt {

    public PrintReceiptForRegularStudents(Calculate calculatedBill, Student student) {
        super(calculatedBill, student);
    }
    public void printreceipt(){
        System.out.println("Name : "+student.getName());
        System.out.println("Roll Number : "+student.getRollNo());
        System.out.println("Department: "+student.getDepartment().getDepartmentName());
        System.out.println("Total : "+ calculatedBill.calculateBill());

    }
}
