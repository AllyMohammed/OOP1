public class Years {

    public Integer YearRange;
    public Integer FirstYear;
    public Integer SecondYear;
    public Integer FirstDivisor;
    public Integer SecondDivisor;
    public Integer RangeType;



    public Years() {}


    public Years(Integer divisibility) {

        myFirstRange.setRangeType(1);
    }

    public Years(Integer olypmicyear) {

        mySecondRange.setRangeType(2);
    }

    public Years(Integer leapyear) {
        myThirdRange.setRangeType(3);
    }
    public void setRangeType (Integer Range){
        return RangeType;

    }
    public  void YearRange(Integer Range){
        return YearRange;
    }
    public void getFirstDivisor( ){
        return FirstDivisor;
    }
    public void getSecondDivisor(){
        return SecondDivisor;
    }
    public void getFirstYear(){
        return FirstYear;
    }
    public void getSecondyear(){
        return SecondYear;
    }

}

