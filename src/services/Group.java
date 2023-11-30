package services;

public interface Group {
    models.Group  addNewGroup();
    void getGroupByGroupName();
    void updateGroupName();
    void getAllGroups();
}
