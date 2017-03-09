package Homework6;

/**
 * Created by Андрей on 09.03.2017.
 */
public class UserUtils {

    static User[] uniqueUsers(User[] users) {
        User[] unique = new User[0];
        int k = 0;
        for (int i = 0; i < users.length; i++) {
            for (int j = i; j < users.length; i++) {
                if (users[i].equals(users[j])) break;
                else if (j == users.length) {
                    unique[k] = users[i];
                    k++;
                }
            }

        }
        return unique;

    }

    ;

    static User[] usersWithConditionalBalance(User[] users, int balance) {
        User[] usersCondBal = new User[0];
        int k = 0;
        for (User user : users) {
            if (user.balance == balance) {
                usersCondBal[k] = user;
                k++;
            }
        }
        return usersCondBal;

    }

    ;

    static final User[] paySalaryToUsers(User[] users) {
        for (User user:users){
            user.balance+=user.salary;
        }
        return users;
    }

    ;

    static final long[] getUsersId(User[] users) {
        long ids[] = new long[users.length];
        for(int i = 0;i<users.length;i++){
            ids[i] = users[i].id;

        }
        return ids;
    }

    ;

    static User[] deleteEmptyUsers(User[] users) {
        for(User user:users){
            if (user.firstName.isEmpty() && user.lastName.isEmpty())user = null;
        }
        return users;
    }

    ;
}
