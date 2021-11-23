import java.util.ArrayList;
import java.util.List;

class PrintRecipt{
    private  FeeStructure feelist;
    Student student;
    public PrintRecipt(FeeStructure feelist,Student student){
        this.student = student;
        this.feelist = feelist;
    }
    public double calculateBill() {
        double paidBill =0;
        return feelist.getMiscellaneousFee()+feelist.getTutionFee()+feelist.getUniversiityFee();
    }
    public void printRecipt(){
        System.out.println("Name : "+student.getName());
        System.out.println("Roll Number : "+student.getRollNo());
        System.out.println("Department: "+student.getDepartment().getDepartmentName());
        if(student.getTypeOfEducation().equals("Distance"))
            System.out.println("Total : "+ calculateBill()*0.9);
        else
            System.out.println("Total : "+ calculateBill());

    }

}

class ShowStatus{

    protected FeeStatus status;
    public ShowStatus(FeeStatus status) {
        this.status = status;
    }
    public void printStatus(){
      status.printMiscelleneousFeeStatus();
      status.printTutionFeeStatus();
      status.printUniversityFeeStatus();
    }
}

public class GenerateRecipt {


    public static void main(String[] args) {

        Department department = new CSE();
        Student student = new StudentWithOutTitle("2451-18-733-125","Dayaker reddy",department,"Distance");

        FeeStructure feeslist = new FeeStructure(true,true,false);

        FeeStatus feeStatus = new PaymentStatus(true,true,false);


        PrintRecipt printRecipt = new PrintRecipt(feeslist,student);
        printRecipt.printRecipt();

        ShowStatus status = new ShowStatus(feeStatus);
        status.printStatus();
    }
}