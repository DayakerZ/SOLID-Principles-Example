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