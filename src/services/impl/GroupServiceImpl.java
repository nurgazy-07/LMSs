package services.impl;

import databases.Database;
import models.MyGenereteId;
import models.Student;
import services.Group;

import java.util.Arrays;
import java.util.Scanner;

public class GroupServiceImpl implements Group {
    Database database = new Database();


    @Override
    public models.Group addNewGroup() {
        Scanner scanner = new Scanner(System.in);
        models.Group group = new models.Group();
        System.out.println("Enter name of group: ");
        group.setGroupName(scanner.nextLine());
        System.out.println("Enter descr: ");
        group.setDescription(scanner.nextLine());
        Database.groups = Arrays.copyOf(Database.groups, Database.groups.length + 1);
        Database.groups[Database.groups.length - 1] = group;
        group.setId(MyGenereteId.idGroup());
        return group;
    }

    @Override
    public void getGroupByGroupName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Групанын атын жазыныз: ");
        String name = scanner.nextLine();
        for (int i = 0; i < Database.groups.length; i++) {
            if (Database.groups[i].getGroupName().equalsIgnoreCase(name)) {
                System.out.println(Database.groups[i]);
            }
        }

    }

    @Override
    public void updateGroupName() {
        models.Group group = new models.Group();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Группанын атын жазыныз: ");
        String soz = scanner.nextLine();
        for (int i = 0; i < Database.groups.length; i++) {
            if (Database.groups[i].getGroupName().equalsIgnoreCase(soz)) {
                System.out.println("Жаны ат жазыныз: ");
               String num = scanner.nextLine();
               Database.groups[i].setGroupName(num);
                group.setId(MyGenereteId.idGroup());
                System.out.println("Группанын аты ийгиликтуу озгортулду!");

            }
        }

//
//        public boolean proverka (String nameGroup){
//            models.Group group = new models.Group();
//            for (int i = 0; i < Database.groups.length; i++) {
//                if (nameGroup.equalsIgnoreCase(Database.groups[i].getGroupName())) {
//                    return false;
//                }
//            }
//            return true;
//        }

    }

    @Override
    public void getAllGroups() {
        for (int i = 0; i < Database.groups.length; i++) {
            System.out.println(Database.groups[i]);
        }
    }
}
