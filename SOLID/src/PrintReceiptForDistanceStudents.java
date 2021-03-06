class PrintReceiptForDistanceStudents extends PrintReceipt {
    public PrintReceiptForDistanceStudents(Calculate calculatedBill, Student student) {
        super(calculatedBill, student);
    }

    @Override
    public void printReceipt() {
        System.out.println("Name : "+student.getName());
        System.out.println("Roll Number : "+student.getRollNo());
        System.out.println("Department: "+student.getDepartment().getDepartmentName());
        System.out.println("Total : "+ Math.round(calculatedBill.calculateBill()*0.9*100.0)/100.0);
    }
}