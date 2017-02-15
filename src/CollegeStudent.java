import com.sun.javafx.image.impl.ByteIndexed;

public class CollegeStudent extends Student {

    private String collegeName;
    private int rating;
    private long id;

    CollegeStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }
    CollegeStudent(String lastName,Course[] coursesTaken){super(lastName,  coursesTaken);}
    CollegeStudent(String firstName, String lastName,int group , int rating, long id,String collegeName,Course[] coursesTaken,int age){
        super(firstName, lastName,1);
        super.setCoursesTaken(coursesTaken);
        super.setAge(age);

        this.rating = rating;
        this.id = id;
        this.collegeName=collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public long getId() {
        return id;
    }

    public String getCollegeName() {
        return collegeName;
    }
}
