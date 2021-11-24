import java.util.List;

class CalculateBill implements Calculate {

    private List<FeeStructure> feeList;

    public CalculateBill(List<FeeStructure> feeList){
        this.feeList = feeList;
    }
    @Override
    public double calculateBill() {
        double paidBill =0;
        for (FeeStructure i : feeList){
            paidBill += i.getFee();
        }
        return paidBill;
    }
}
