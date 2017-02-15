import java.util.Date;

/**
 * Created by Андрей on 06.02.2017.
 */
public class Main {
    public static void main(String[] args) {

        java.util.Calendar cal = java.util.Calendar.getInstance();


        //cal.set(java.util.Calendar.HOUR_OF_DAY,18);
        //cal.set(java.util.Calendar.MINUTE,30);
        //cal.set(java.util.Calendar.SECOND,0);

        Date date ;
        cal.set(2016, 00, 10);
        date = cal.getTime();
        Course[] courses = new Course[6];
        Course[] tempCourses = new Course[0];
        courses[1] = new Course(date,"java");
        cal.set(2017, 01, 11);
        date = cal.getTime();
        courses[2] = new Course(date,"qa");
        courses[3] = new Course(1000,"SoftSkills","TeachersName1");
        courses[4] = new Course(2000,"HardSkills","TeachersName2");
        courses[5] = new Course(3000,"HardSkillsAgain","TeachersName3");

        Student[] students = new Student[3];
        students[1]=new Student("Name","LastName",1);
        tempCourses = new Course[]{courses[2]};
        students[2]=new Student("LastName",tempCourses);


        CollegeStudent[] cStudents = new CollegeStudent[4];
        tempCourses = new Course[]{courses[1], courses[3]};
        cStudents[1] = new CollegeStudent("LastName1",tempCourses);
        cStudents[2] = new CollegeStudent("Name","Surname",1);
        cStudents[3] = new CollegeStudent("name","lastName",1,100,1,"goit",tempCourses,1);

        SpecialStudent[] sStudents = new SpecialStudent[4];

        sStudents[1] = new SpecialStudent("SpecialSurname",courses);
        sStudents[2] = new SpecialStudent("Specialurname",courses);
        sStudents[3] = new SpecialStudent("Specialurname",courses,12);

        System.out.println(courses[1].getName());
    }
}
