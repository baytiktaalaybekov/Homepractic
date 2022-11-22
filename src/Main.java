import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Student[]students= {
                new Student("Baytik", "Taalaybekov", 'M', LocalDate.of(2002, 2, 21), new School("Peaksoft", "Kyrgyzstan", LocalDate.of(2002, 9, 14))),
                new Student("Baytik", "Taalaybekov", 'M', LocalDate.of(2001, 8, 11), new University("Ala-too", "Kyrgyzstan", LocalDate.of(2002, 9, 14))),
                new Student("Baytik", "Taalaybekov", 'M', LocalDate.of(2002, 2, 21), new College("Harvard", "USA", LocalDate.of(2002, 9, 14))),
                new Student("Baytik", "Taalaybekov", 'M', LocalDate.of(2002, 2, 21), new University("Ala-too", "Kyrgyzstan", LocalDate.of(2002, 9, 14))),
                new Student("Baytik", "Taalaybekov", 'M', LocalDate.of(2002, 2, 21), new School("Peaksoft", "Kyrgyzstan", LocalDate.of(2002, 9, 14)))
        };

        for (Student s:students) {
            System.out.println(s);
        }

       method(students);
        method1();

    }
    public static void method(Student[]students){
        for (Student student : students) {
            System.out.println(student);

        }

    }
    public static void method1(){

        EducationCenter[] educationCenters = {
                new School("Peaksoft", "Kyrgyzstan", LocalDate.of(2002, 9, 14)),
                new College("Harvard", "USA", LocalDate.of(2002, 9, 14)),
                new University("Ala-too", "Kyrgyzstan", LocalDate.of(2002, 9, 14)),

        };
//        int counterU = 0, counterS = 0, counterC = 0;
//        for (Student student : students) {
//            if(student.getEducationCenter().equals(""));
//        }
        for (EducationCenter s:educationCenters) {
            System.out.println(s);
        }
    }


}