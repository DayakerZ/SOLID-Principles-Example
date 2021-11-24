import java.util.List;

class ShowStatus{

    protected List<FeeStatus> statusList;
    public ShowStatus(List<FeeStatus> statusList) {
        this.statusList = statusList;
    }
    public void printStatus(){
        for(FeeStatus i:statusList){
            i.printFeeStatus();
        }
    }
}
