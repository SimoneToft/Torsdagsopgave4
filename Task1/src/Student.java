import java.util.ArrayList;
public class Student {
    private String name;
    private ArrayList<Course> courses= new ArrayList<>();

    Student(String name){
        this.name = name;
    }
    public void addCourse(Course course){
        courses.add(course);
    }
    public String toString(){
        return name+ " "+ courses;
    }
}
