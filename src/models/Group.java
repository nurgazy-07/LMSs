package models;

import java.util.Arrays;

public class Group {
    private int id;
    private String groupName;
    private String description;
    private Lesson[] lessons;
    private Student[] students;

    public Group() {
    }

    public Group(int id, String groupName, String description, Lesson[] lessons, Student[] students) {
        this.id = id;
        this.groupName = groupName;
        this.description = description;
        this.lessons = lessons;
        this.students = students;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Lesson[] getLessons() {
        return lessons;
    }

    public void setLessons(Lesson[] lessons) {
        this.lessons = lessons;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
    public void addGroup(){

    }

    @Override
    public String toString() {
        return "Group: {" +"\n"+
                   "Id         = " + id+"\n" +
                " GroupName   = " + groupName +"\n"+
                " Description =  " + description + "\n"+
                " Lessons     = " + Arrays.toString(lessons) +"\n"+
                " Students    = " + Arrays.toString(students) +
                '}';
    }
}
