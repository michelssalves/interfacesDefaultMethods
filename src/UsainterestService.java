import java.security.InvalidParameterException;

public class UsainterestService implements InterestService{

    private double interestRate;

    public UsainterestService(double interestRate){

        this.interestRate = interestRate;
    }
    @Override
    public double getInterestRate(){

        return interestRate;
    }


}
