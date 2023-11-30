package services.impl;

import databases.Database;
import models.MyGenereteId;
import models.enums.Role;
import services.Student;

import java.util.Arrays;
import java.util.Scanner;

public class StudentServiceImpl implements Student {
Database database = new Database();

    @Override
    public models.Student addNewStudentToGroup() {
        Scanner scanner = new Scanner(System.in);
        models.Student student = new models.Student();
        System.out.println("Кайсы групага студент кошосуз: ");
        String grup = scanner.nextLine();
        for (int i = 0; i < Database.groups.length; i++) {
           if(Database.groups[i].getGroupName().equals(grup)){
               System.out.println("Студенттин атын жазыныз: ");
               student.setFistName(scanner.nextLine());
               System.out.println("Фамилясын жазыныз: ");
               student.setLastName(scanner.nextLine());
               while (true) {
                   System.out.println("Электрондук почтасын жазыныз: ");
                   String san = scanner.nextLine();
                   if(san.length() > 3){
                       student.setEmail(san);
                       break;
                   }
               }
               while (true) {
                   System.out.println("Парол ойлоп табыныз: ");
                   String pas = scanner.nextLine();
                   if(pas.length() > 3){
                       student.setPassword(pas);
                       break;
                   }
               }
               System.out.println("Жынысын жазыныз: ");
               String soz = scanner.nextLine();
               if (soz.equalsIgnoreCase("m") || soz.equalsIgnoreCase("male")){
                   student.setGender(Role.MALE);
               } else if (soz.equalsIgnoreCase("f") || soz.equalsIgnoreCase("female")) {
                   student.setGender(Role.FEMALE);
               }
               else System.err.println("Мындай жыныс жок!");
               Database.students = Arrays.copyOf(Database.students, Database.students.length + 1);
               Database.students[Database.students.length - 1] = student;
               student.setId(MyGenereteId.idGroup());
           }

        }
        return student;
    }

    @Override
    public void updateStudent() {

    }
}
