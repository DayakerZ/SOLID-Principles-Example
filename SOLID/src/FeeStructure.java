interface FeeStructure {

    public double getFee();
}
class TutionFee implements FeeStructure{

    @Override
    public double getFee() {

        return 95576.76;
    }
}
class UniversityFee implements FeeStructure{


    @Override
    public double getFee() {

        return 5789.98;
    }
}

class MiscellaneousFee implements FeeStructure{

    @Override
    public double getFee() {

        return 10000.0;
    }
}