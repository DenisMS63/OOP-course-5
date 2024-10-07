package service;

import model.Group;
import model.Teacher;
import model.User;

import java.util.List;

public class GroupService {
    public Group createNewGroup(Teacher teacher, List<User> students){
        return new Group(teacher, students);
    }
}
