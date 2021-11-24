class PrintReceipt {
    private  FeeStructure feelist;
    Student student;
    public PrintReceipt(FeeStructure feelist, Student student){
        this.student = student;
        this.feelist = feelist;
    }
    public double calculateBill() {
        double paidBill =feelist.getMiscellaneousFee()+feelist.getTutionFee()+feelist.getUniversiityFee();
        return paidBill;
    }
    //Single Responsibility principle and Open Closed principle violation
    public void printReceipt(){
        System.out.println("Name : "+student.getName());
        System.out.println("Roll Number : "+student.getRollNo());
        System.out.println("Department: "+student.getDepartment().getDepartmentName());
        if(student.getTypeOfEducation().equals("Distance"))
            System.out.println("Total : "+ calculateBill()*0.9);
        else
            System.out.println("Total : "+ calculateBill());

    }

}
