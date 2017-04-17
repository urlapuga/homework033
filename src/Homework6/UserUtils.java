package Homework6;

/**
 * Created by Андрей on 09.03.2017.
 */
public class UserUtils {

    public static User[] uniqueUsers(User[] users) {

        for (int i = 0; i < users.length; i++) {
            for (int j = i + 1; j < users.length; j++) {
                if (users[i].equals(users[j])) {
                    users = delete(users, j);
                }
            }
        }
        return users;
    }

    ;

    public static User[] delete(User[] users, int i) {
        User[] deleted = new User[users.length - 1];
        System.arraycopy(users, 0, deleted, 0, i);
        System.arraycopy(users, i + 1, deleted, i, users.length - i - 1);
        return deleted;
    }

    ;

    static User[] usersWithConditionalBalance(User[] users, int balance) {
        User[] usersCondBal = new User[users.length];
        int k = 0;
        for (User user : users) {
            if (user.getBalance() >= balance) {
                usersCondBal[k] = user;
                k++;
            }
        }
        return usersCondBal;

    }

    ;

    static final User[] paySalaryToUsers(User[] users) {
        for (User user : users) {
            user.setBalance(user.getBalance()+user.getSalary());
        }
        return users;
    }

    ;

    static final long[] getUsersId(User[] users) {
        long ids[] = new long[users.length];
        for (int i = 0; i < users.length; i++) {
            ids[i] = users[i].getId();

        }
        return ids;
    }

    ;

    static User[] deleteEmptyUsers(User[] users) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users = delete(users, i);
            }
        }
        return users;
    }

    ;
}
