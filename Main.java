import java.rmi.StubNotFoundException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("output from java program");
        System.out.println(java.time.LocalDateTime.now());
        System.out.println("This is a test message.");
        System.out.println("This line has a typo in the print statement.");
        System.out.println("End of the program.");
        Student student = new Student();
        student.displayInfo(); 
        
  
    }
}