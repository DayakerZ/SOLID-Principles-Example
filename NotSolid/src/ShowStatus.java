class ShowStatus{

    protected FeeStatus status;
    public ShowStatus(FeeStatus status) {
        this.status = status;
    }
    public void printStatus(){
        status.printMiscellaneousFeeStatus();
        status.printTuitionFeeStatus();
        status.printUniversityFeeStatus();
    }
}
