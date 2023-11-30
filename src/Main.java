import models.Admin;
import models.Group;
import models.Lesson;
import services.impl.GroupServiceImpl;
import services.impl.LessonServiceImpl;
import services.impl.StudentServiceImpl;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GroupServiceImpl groupService = new GroupServiceImpl();
        LessonServiceImpl lessonService = new LessonServiceImpl();
        StudentServiceImpl studentService = new StudentServiceImpl();
//        Group group = new Group();
        Admin admin = new Admin();
        admin.setEmail("asdf");
        admin.setPasword("asdff");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Кутман кеч!  Саат -> " + " " + LocalTime.now());
        System.out.println();
        System.out.println("""
                Катталган болсонуз 1 басыныз, пороль унутуп калып, озгортуу учун 2 басыныз.
                """);
        String san = scanner.nextLine();
        if (san.equalsIgnoreCase("1")) {
            System.out.println("Кируу учун электрондук почтанызды жана паролунузду жазыныз:");
            System.out.print("Электрондук почтанызды жазыныз: ");
            String ll = scanner.nextLine();
            System.out.print("Парол жазыныз: ");
            String pp = scanner.nextLine();
            if (admin.getEmail().equalsIgnoreCase(ll) && admin.getPasword().equalsIgnoreCase(pp)) {
                System.out.println("Кош келиниз!");
                while (true) {
                    System.out.println("""
                            *** Бир команда танданыз! ***
                            1 -> Add new group
                            2 -> Get group by name
                            3 -> Update group name
                            4 -> Get All groups
                            5 -> Add new Student to group
                            """);
                    switch (scanner.nextLine()) {
                        case "1" -> System.out.println(groupService.addNewGroup());
                        case "2" -> groupService.getGroupByGroupName();
                        case "3" -> groupService.updateGroupName();
                        case "4" -> groupService.getAllGroups();
                        case "5" -> System.out.println(studentService.addNewStudentToGroup());
                    }
                }
            } else System.err.println("Акаунт ката");

        } else if (san.equalsIgnoreCase("2")){
            System.out.println("Пароль озготуу учун email жазып жаны password жазыныз");
            while (true) {
                System.out.println("Enter email: ");
                String san2 = scanner.nextLine();
                if(san2.equalsIgnoreCase(admin.getEmail())){
                    admin.setEmail(san2);
                }
                System.out.println("Enter new password: ");
                String san3 = scanner.nextLine();



            }

        }
    }

}



