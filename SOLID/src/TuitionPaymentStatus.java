class TuitionPaymentStatus implements TuitionFeeStatus {

    private boolean status;
    public TuitionPaymentStatus(boolean status){
        this.status = status;
    }

    @Override
    public void printFeeStatus() {
        if(status)
            System.out.print(" ***Tuition fee paid*** ");
        else
            System.out.print(" ***Tuition fee not paid*** ");
    }
}