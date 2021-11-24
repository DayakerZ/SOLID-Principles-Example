class MiscellaneousPaymentStatus implements MiscellaneousFeeStatus {

    private boolean status;
    public MiscellaneousPaymentStatus(boolean status){
        this.status = status;
    }

    @Override
    public void printFeeStatus() {
        if(status)
            System.out.print(" ***Miscellaneous fee paid**** ");
        else
            System.out.print(" ***Miscellaneous fee not paid*** ");
    }
}
