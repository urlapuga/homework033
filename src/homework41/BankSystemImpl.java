package homework41;

/**
 * Created by Андрей on 22.02.2017.
 */
public class BankSystemImpl implements BankSystem {
    @Override
    public void withdrawOfUser(User user, int amount) {
        user.setBalance(user.getBalance()-amount);
    }

    @Override
    public void fundUser(User user, int amount) {
        user.setBalance(user.getBalance()+amount);
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        if ((fromUser.getBalance()-amount)>=0) {
            fromUser.setBalance(fromUser.getBalance() - amount);
            toUser.setBalance(toUser.getBalance()+amount);
        }
    }

    @Override
    public void paySalary(User user) {
        user.setBalance(user.getBalance()+user.getSalary());
    }
}
