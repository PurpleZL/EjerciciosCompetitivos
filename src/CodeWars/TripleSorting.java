package CodeWars;

import java.util.List;
import java.util.stream.Collectors;

/*
Given a list of students, sort them by (from most important to least important):

GPA (descending)
First letter of last name (ascending)
Age (ascending)
 */
public class TripleSorting {

    public static String sort(List<Student> students) {
        return students.stream()
                .sorted((s1, s2) -> {
                    if (s1.getGpa() != s2.getGpa()) {
                        return Integer.compare(s2.getGpa(), s1.getGpa());
                    }
                    String lastName1 = s1.getFullName().split(" ")[1];
                    String lastName2 = s2.getFullName().split(" ")[1];
                    if (lastName1.charAt(0) != lastName2.charAt(0)) {
                        return Character.compare(lastName1.charAt(0), lastName2.charAt(0));
                    }
                    return Integer.compare(s1.getAge(), s2.getAge());
                })
                .map(Student::getFullName) 
                .collect(Collectors.joining(","));
    }
}

class Student {

    private String fullName;
    private int age;
    private int gpa;

    public Student(String fullName, int age, int gpa) {
        this.fullName = fullName;
        this.age = age;
        this.gpa = gpa;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public int getGpa() {
        return gpa;
    }
}
