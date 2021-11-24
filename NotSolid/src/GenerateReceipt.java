public class GenerateReceipt {

    public static void main(String[] args) {

        Department department = new CSE();
        Student student = new StudentWithOutRole("2451-18-733-125","Dayaker reddy",department,"Distance");

        FeeStructure feeslist = new FeeStructure(true,true,false);
        FeeStatus feeStatus = new PaymentStatus(true,true,false);


        PrintReceipt printReceipt = new PrintReceipt(feeslist,student);
        printReceipt.printReceipt();

        ShowStatus status = new ShowStatus(feeStatus);
        status.printStatus();
    }
}