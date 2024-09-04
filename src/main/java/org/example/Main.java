package org.example;

public class Main {
    public static void main(String[] args)
    {
        StudentService studentService = new StudentService();

        Student newStudent = Student.builder()
                .name("A")
                .subject("Geschichte")
                .build();

        Student savedStudent = studentService.addNewStudent(newStudent);

        System.out.println("Student saved: " + savedStudent);

        System.out.println("Student ill");
        String beverage = null;
        beverage = skippGeshishte();
        System.out.println("Student ill " +beverage);
    }

    public static String skippGeshishte() {
        System.out.println("Student: wisit the Nurse ");
        String beverage = null;
        try{
            beverage = getBeverageGoHome();
        }
        catch(BeInClassIllException e){
            System.out.println("Student tell Teacher and want to go Home");
            beverage = "Stay";
        }
        System.out.println("Student: " +beverage);
        return "stay in Class";
    }

    public static String getBeverageGoHome() throws BeInClassIllException {
        throw new BeInClassIllException("In Class Ill, sh*t!");
    }
}
