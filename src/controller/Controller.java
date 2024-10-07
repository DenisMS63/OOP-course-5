package controller;

import View.StudentView;
import model.*;
import service.DataService;
import service.GroupService;

import java.util.List;

public class Controller {
    private final DataService dataService = new DataService();
    private final StudentView view = new StudentView();
    private final GroupService groupService = new GroupService();

    public void createStudent (String firstName, String lastName, String middleName){
        dataService.create(firstName, lastName, middleName, Type.STUDENT);
    }

    public void getAllStudents(){
        List<User> list = dataService.getAllStudents();
        for (User user : list){
            Student student = (Student) user;       // нужно скастисть user в student так как метод view.printOnConsole() работает с классом student
            view.printOnConsole(student);
        }
    }

    public Group createGroup (Teacher teacher, List<User> students){
        return groupService.createNewGroup(teacher, students);
    }
}
