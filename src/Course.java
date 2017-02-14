import java.util.Date;

public class Course {
    private String name;
    private java.util.Date startDate;
    private int hourseDuration;
    private String teacherName;

    Course(java.util.Date startDate,String name){
        this.startDate= startDate;
        this.name = name;
    }

    Course(int hourseDuration,String name,String teacherName){
        this.hourseDuration = hourseDuration;
        this.name = name;
        this.teacherName = teacherName;
    }

    public void setHourseDuration(int hourseDuration) {
        this.hourseDuration = hourseDuration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public int getHourseDuration() {
        return hourseDuration;
    }

    public String getName() {
        return name;
    }

    public String getTeacherName() {
        return teacherName;
    }
}

