import java.util.HashMap;

public class ELYATSIHW4 {
    public static void main(String[] args) {
        HashMap<Student, String> studentMap = new HashMap<>();

        // Create and add Student objects to the HashMap
        Student student1 = new Student("Nova", "Dirshe", "Computer Science");
        studentMap.put(student1, student1.getName());

        Student student2 = new Student("Kira", "Suraj", "Mathematics");
        studentMap.put(student2, student2.getName());

        Student student3 = new Student("Michael", "Benny", "Biology");
        studentMap.put(student3, student3.getName());

        Student student4 = new Student("Emily", "Rose", "History");
        studentMap.put(student4, student4.getName());

        Student student5 = new Student("Donovan", "Cantly", "Physics");
        studentMap.put(student5, student5.getName());

        Student student6 = new Student("Mohammed", "jamski", "English");
        studentMap.put(student6, student6.getName());

        Student student7 = new Student("Don", "Corlione", "Chemistry");
        studentMap.put(student7, student7.getName());

        Student student8 = new Student("V", "Star", "Psychology");
        studentMap.put(student8, student8.getName());

        Student student9 = new Student("Marco", "Polo", "Political Science");
        studentMap.put(student9, student9.getName());

        Student student10 = new Student("David", "Martinez", "Cybersecurity");
        studentMap.put(student10, student10.getName());

        // Print the contents of the HashMap
        for (Student student : studentMap.keySet()) {
            System.out.println(student.getName() + ": " + studentMap.get(student));
        }
    }
}