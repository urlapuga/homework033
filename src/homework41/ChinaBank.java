package homework41;

/**
 * USBank: limit of withdrawal = 1000 if currency is USD and 1200 if currency is EUR
 * limit of funding - 10000 if EUR and no limit if USD
 * monthly rate - 1% with USD and 2% with EUR
 * commision - 5% if USD and up to 1000, 7% if USD and more than 1000
 * 6% if EUR and up to 1000 and 8% if EUR and more than 1000
 * <p>
 * Created by Андрей on 15.02.2017.
 */
public class ChinaBank extends Bank {

    private static final int withdrawLimitUSD = 1000;
    private static final int withdrawLimitEUR = 1200;

    private static final int limitOfFundingUSD = 0;
    private static final int limitOfFundingEUR = 10000;

    private static final int monthlyRateUSD = 1;
    private static final int monthlyRateEUR = 2;

    private static final int commisionUSDLess = 5;
    private static final int commisionUSDMore = 7;

    private static final int commisionEURLess = 6;
    private static final int commisionEURMore = 8;

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);

    }

    @Override
    int getLimitOfWithdrawal() {
        int result = (super.getCurrency().name() == "USD") ? withdrawLimitUSD : withdrawLimitEUR;
        return result;
    }

    @Override
    int getLimitOfFunding() {
        int result = (super.getCurrency().name() == "USD") ? limitOfFundingUSD : limitOfFundingEUR;
        return result;
    }

    @Override
    int getMonthlyRate() {
        int result = (super.getCurrency().name() == "USD") ? monthlyRateUSD : monthlyRateEUR;
        return result;
    }

    @Override
    int getCommission(int summ) {
        int result = -1;
        if (super.getCurrency().name() == "USD") {
            result = (summ > 1000) ? 7 : 5;
        }
        if (super.getCurrency().name() == "EUR") {
            result = (summ > 1000) ? 8 : 6;
        }
        return result;
    }

    @Override
    double moneyPaidMonthlyForSalary() {
        return 0;
    }
}
