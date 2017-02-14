/**
 * Created by Андрей on 14.02.2017.
 */
public class SuperStudent extends CollegeStudent{

    private long secretKey;
    private String email;
            SuperStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    SuperStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    SuperStudent(String lastName, Course[] coursesTaken,long secretKey) {
        super(lastName, coursesTaken);
        this.secretKey =secretKey;
    }

    public long getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
