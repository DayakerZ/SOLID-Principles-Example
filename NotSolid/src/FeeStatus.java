public interface FeeStatus{
    public void printTutionFeeStatus();
    public void printMiscelleneousFeeStatus();
    public void printUniversityFeeStatus();
}
class PaymentStatus implements FeeStatus{

    private boolean tutionFeestatus;
    private boolean miscelleneousFeeStatus;
    private boolean universityFeeStatus;
    public PaymentStatus(boolean tutionFeestatus,boolean universityFeeStatus ,boolean miscelleneousFeeStatus){
        this.tutionFeestatus = tutionFeestatus;
        this.miscelleneousFeeStatus = miscelleneousFeeStatus;
        this.universityFeeStatus = universityFeeStatus;
    }

    @Override
    public void printTutionFeeStatus() {
        if(tutionFeestatus)
            System.out.println("***Tution Fee paid***");
        else
            System.out.println("***Tution Fee not paid***");
    }

    @Override
    public void printMiscelleneousFeeStatus() {
        if(miscelleneousFeeStatus)
            System.out.println("***Miscelleneous Fee paid***");
        else
            System.out.println("***Miscelleneous Fee not paid***");
    }

    @Override
    public void printUniversityFeeStatus() {
        if(universityFeeStatus)
            System.out.println("***University Fee paid***");
        else
            System.out.println("***University Fee not paid***");
    }
}

