package model.services;

public class UsaInterestService implements InterestService {

    public final Double interestRate = 1.0;

    public UsaInterestService() {
    }
    @Override
    public Double getInterestRate() {
        return interestRate;
    }
}
