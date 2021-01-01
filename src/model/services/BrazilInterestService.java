package model.services;

public class BrazilInterestService implements InterestService {

    public final Double interestRate = 2.0;

    public BrazilInterestService() {
    }
    @Override
    public Double getInterestRate() {
        return interestRate;
    }


}
