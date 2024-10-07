package model;

import service.DataService;

import java.util.List;

public class Group {
    private Teacher teacher;
    private List<User> students;

    public Group(Teacher teacher, List<User> students) {
        this.teacher = teacher;
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<User> getStudents() {
        return students;
    }

    public void setStudents(List<User> students) {
        this.students = students;
    }
}
