import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Айнура", 20, "Java"));
        students.add(new Student("Бакыт", 22, "Java"));
        students.add(new Student("Айбек", 19, "JavaScript"));
        students.add(new Student("Жамиля", 21, "Java"));
        students.add(new Student("Улан", 23, "JavaScript"));
        students.add(new Student("Мээрим", 18, "Java"));
        students.add(new Student("Руслан", 20, "JavaScript"));
        students.add(new Student("Нурлан", 25, "Java"));
        students.add(new Student("Алия", 19, "JavaScript"));
        students.add(new Student("Эрлан", 22, "Java"));


        System.out.println("Бардык студенттер:");
        for (Student student : students) {
            System.out.println(student);
        }


        List<Student> javaGroup = new ArrayList<>();
        List<Student> javaScriptGroup = new ArrayList<>();
        for (Student student : students) {
            if (student.getGroup().equalsIgnoreCase("Java")) {
                javaGroup.add(student);
            } else if (student.getGroup().equalsIgnoreCase("JavaScript")) {
                javaScriptGroup.add(student);
            }
        }

        System.out.println("\nJava группасы:");
        for (Student student : javaGroup) {
            System.out.println(student);
        }
        System.out.println("\nJavaScript группасы:");
        for (Student student : javaScriptGroup) {
            System.out.println(student);
        }


        List<Student> ageFilteredStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.getAge() >= 19 && student.getAge() <= 23) {
                ageFilteredStudents.add(student);
            }
        }

        System.out.println("\nЖашы 19-23 кочейнки студенттер:");
        for (Student student : ageFilteredStudents) {
            System.out.println(student);
 }

    }
}