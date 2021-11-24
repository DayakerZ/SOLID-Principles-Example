class PaymentStatus implements FeeStatus{

    private boolean tuitionStatus;
    private boolean miscellaneousFeeStatus;
    private boolean universityFeeStatus;
    public PaymentStatus(boolean tuitionStatus, boolean universityFeeStatus , boolean miscellaneousFeeStatus){
        this.tuitionStatus = tuitionStatus;
        this.miscellaneousFeeStatus = miscellaneousFeeStatus;
        this.universityFeeStatus = universityFeeStatus;
    }

    @Override
    public void printTuitionFeeStatus() {
        if(tuitionStatus)
            System.out.println("***Tuition Fee paid***");
        else
            System.out.println("***Tuition Fee not paid***");
    }

    @Override
    public void printMiscellaneousFeeStatus() {
        if(miscellaneousFeeStatus)
            System.out.println("***Miscellaneous Fee paid***");
        else
            System.out.println("***Miscellaneous Fee not paid***");
    }

    @Override
    public void printUniversityFeeStatus() {
        if(universityFeeStatus)
            System.out.println("***University Fee paid***");
        else
            System.out.println("***University Fee not paid***");
    }
}
