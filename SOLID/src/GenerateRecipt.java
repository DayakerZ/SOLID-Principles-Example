import java.util.ArrayList;
import java.util.List;

interface Calculate{
    double calculateBill();
}
class CalculateBill implements Calculate {

    private  List<FeeStructure> feelist;

    public CalculateBill(List<FeeStructure> feelist){
        this.feelist = feelist;
    }
    @Override
    public double calculateBill() {
        double paidBill =0;
        for (FeeStructure i : feelist){
            paidBill += i.getFee();
        }
        return paidBill;
    }
}

abstract class PrintRecipt{
    Calculate calculatedBill;
    Student student;
    public PrintRecipt(Calculate calculatedBill,Student student){
        this.student = student;
        this.calculatedBill = calculatedBill;
    }
    public void printRecipt(){
        System.out.println("Name : "+student.getName());
        System.out.println("Roll Number : "+student.getRollNo());
        System.out.println("Department: "+student.getDepartment().getDepartmentName());
        System.out.println("Total : "+ calculatedBill.calculateBill());

    }

}
class PrintReciptForDistanceStudents extends PrintRecipt{
    public PrintReciptForDistanceStudents(Calculate calculatedBill, Student student) {
        super(calculatedBill, student);
    }

    @Override
    public void printRecipt() {
        System.out.println("Name : "+student.getName());
        System.out.println("Roll Number : "+student.getRollNo());
        System.out.println("Department: "+student.getDepartment().getDepartmentName());
        System.out.println("Total : "+ calculatedBill.calculateBill()*0.9);
    }
}
class PrintReciptForRegularStudents extends PrintRecipt{
    public PrintReciptForRegularStudents(Calculate calculatedBill, Student student) {
        super(calculatedBill, student);
    }
    public void printRecipt(){
        System.out.println("Name : "+student.getName());
        System.out.println("Roll Number : "+student.getRollNo());
        System.out.println("Department: "+student.getDepartment().getDepartmentName());
        System.out.println("Total : "+ calculatedBill.calculateBill());

    }
}

class ShowStatus{

    protected List<FeeStatus> statusList;
    public ShowStatus(List<FeeStatus> statusList) {
        this.statusList = statusList;
    }
    public void printStatus(){
        for(FeeStatus i:statusList){
            i.printFeeStatus();
        }
    }
}

public class GenerateRecipt {


    public static void main(String[] args) {

        Department department = new CSE();
        Student student = new Studentwithouttitle("Dayaker Reddy","2451-18-733-125",department,"Distance");

        List<FeeStructure> feeslist = new ArrayList<>();
        feeslist.add(new TutionFee());
        feeslist.add(new UniversityFee());

        List<FeeStatus> statusList = new ArrayList<>();
        statusList.add(new TutionPaymentStatus(true));
        statusList.add(new UniversityPaymentStatus(true));
        statusList.add(new MiscelleneousPaymentStatus(false));

        Calculate bill = new CalculateBill(feeslist);

        PrintRecipt printRecipt = new PrintReciptForDistanceStudents(bill,student);
        printRecipt.printRecipt();

        ShowStatus status = new ShowStatus(statusList);
        status.printStatus();
    }
}