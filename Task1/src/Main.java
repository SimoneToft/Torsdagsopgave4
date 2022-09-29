public class Main {
    public static void main(String[] args) {
        Student a = new Student("Tobias");
        Student b = new Student("Simone");

        Course eng = new Course("english");
        Course mat = new Course("math");
        Course his = new Course("history");

        a.addCourse(eng);
        b.addCourse(mat);
        b.addCourse(his);

        System.out.println(a);
        System.out.println(b);
    }
}
