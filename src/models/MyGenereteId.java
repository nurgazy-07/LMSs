package models;

public class MyGenereteId {
    private static int num = 0;
    public static int idGroup(){
        return ++num;
    }
}
