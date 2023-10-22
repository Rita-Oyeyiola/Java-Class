import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome");

        Student student = new Student();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name \n");
        String name = scanner.nextLine();
        student.setName(name);

        System.out.println("Please enter your department \n");
        String department = scanner.nextLine();
        student.setDepartment(department);

        System.out.println("Please enter your matric number \n");
        String matricNumber = scanner.nextLine();
        student.setMatricNumber(matricNumber);

        System.out.println("Please enter your level \n");
        String level = scanner.nextLine();
        student.setLevel(level);

        System.out.println("Please enter your age \n");
        int age = scanner.nextInt();
        student.setAge(age);

        System.out.println("Your full name is"+ student.getName());
        System.out.println("Your department name is"+ student.getDepartment());
        System.out.println("Your level is"+ student.getName());
        System.out.println("Your matric number is"+ student.getName());
        System.out.println("You are"+ student.getAge() + "years old");


    }
}