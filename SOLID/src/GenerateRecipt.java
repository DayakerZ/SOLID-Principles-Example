import java.util.ArrayList;
import java.util.List;

class CalculateBill{

    public double paidBill =0;
    private final List<FeeStructure> feelist;
    public CalculateBill(List<FeeStructure> feelist){
        this.feelist = feelist;
    }
    public void calculateTotalBill(){

        for (FeeStructure i : feelist){
            paidBill += i.getFee();
        }
    }
}
class PrintRecipt{
    CalculateBill calculatedBill;
    Studentgetter student;
    public PrintRecipt(CalculateBill calculatedBill,Studentgetter student){
        this.student = student;
        this.calculatedBill = calculatedBill;
    }
    public void printRecipt(){
        System.out.println("Name : "+student.getName());
        System.out.println("Roll Number : "+student.getRollNo());
        System.out.println("Department: "+student.getDepartment().getDepartmentName());
        System.out.println("Total : "+calculatedBill.paidBill);

    }

}

class ShowStatus{

    protected List<FeeStatus> statusList;
    public ShowStatus(List<FeeStatus> statusList) {
        this.statusList = statusList;
    }
    public void printStatus(){
        for( FeeStatus i:statusList){
            i.printFeeStatus();
        }
    }
}

public class GenerateRecipt {


    public static void main(String[] args) {

        Studentgetter student = new Studentgetter();
        Department department = new CSE();
        student.setName("Dayaker Reddy");
        student.setRollNo("2451-18-733-125");
        student.setDepartment(department);

        List<FeeStructure> list = new ArrayList<FeeStructure>();
        list.add(new TutionFee());
        list.add(new UniversityFee());

        List<FeeStatus> statusList = new ArrayList<FeeStatus>();
        statusList.add(new TutionPaymentStatus(true));
        statusList.add(new UniversityPaymentStatus(true));
        statusList.add(new MiscelleneousPaymentStatus(false));

        CalculateBill bill = new CalculateBill(list);
        bill.calculateTotalBill();
        PrintRecipt printRecipt = new PrintRecipt(bill,student);
        printRecipt.printRecipt();

        ShowStatus status = new ShowStatus(statusList);
        status.printStatus();
    }
}