import java.util.ArrayList;
import java.util.List;

public class GenerateReceipt {


    public static void main(String[] args) {

        Department department = new CSE();
        Student student = new
                StudentWithOutRole("Dayaker Reddy","2451-18-733-125",department,"Distance");

        List<FeeStructure> feeslist = new ArrayList<>();
        feeslist.add(new TuitionFee());
        feeslist.add(new UniversityFee());

        List<FeeStatus> statusList = new ArrayList<>();
        statusList.add(new TuitionPaymentStatus(true));
        statusList.add(new UniversityPaymentStatus(true));
        statusList.add(new MiscellaneousPaymentStatus(false));

        Calculate bill = new CalculateBill(feeslist);

        PrintReceipt printReceipt = new PrintReceiptForDistanceStudents(bill,student);
        printReceipt.printReceipt();

        ShowStatus status = new ShowStatus(statusList);
        status.printStatus();
    }
}