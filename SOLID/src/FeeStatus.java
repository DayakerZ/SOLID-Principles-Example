public interface FeeStatus{
    public void printFeeStatus();
}
interface TutionFeeStatus extends FeeStatus {
    public void printFeeStatus();
}
interface  MiscelleneousFeeStatus extends FeeStatus{

    public void printFeeStatus();
}
interface UniversityFeeStatus extends FeeStatus{

    public void printFeeStatus();
}
class TutionPaymentStatus implements TutionFeeStatus{

    private boolean status;
    public TutionPaymentStatus(boolean status){
        this.status = status;
    }

    @Override
    public void printFeeStatus() {
        if(status)
            System.out.print(" ***Tution fee paid*** ");
        else
            System.out.print(" ***Tution fee not paid*** ");
    }
}
class UniversityPaymentStatus implements UniversityFeeStatus{

    private boolean status;
    public UniversityPaymentStatus(boolean status){
        this.status = status;
    }

    @Override
    public void printFeeStatus() {
        if(status)
            System.out.print(" ***University fee paid*** ");
        else
            System.out.print(" ***University fee not paid*** ");
    }
}
class MiscelleneousPaymentStatus implements  MiscelleneousFeeStatus{

    private boolean status;
    public MiscelleneousPaymentStatus(boolean status){
        this.status = status;
    }

    @Override
    public void printFeeStatus() {
        if(status)
            System.out.print(" ***Miscelleneous fee paid**** ");
        else
            System.out.print(" ***Miscelleneous fee not paid*** ");
    }
}
