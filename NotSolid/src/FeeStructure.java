public class FeeStructure {

    private boolean tutionFee;
    private boolean universityFee;
    private boolean miscellaneousFee;
    public FeeStructure(boolean tutionFee,boolean universityFee,boolean miscellaneousFee){
        this.tutionFee = tutionFee;
        this.universityFee = universityFee;
        this.miscellaneousFee = miscellaneousFee;
    }
    public double getTutionFee(){
        if(tutionFee)
            return 95576.76;
        else
            return 0;
    }
    public double getUniversiityFee(){
        if(universityFee)
            return 5789.98;
        else
            return 0;
    }
    public double getMiscellaneousFee(){
        if(miscellaneousFee)
            return 10000;
        else
            return 0;
    }
}
