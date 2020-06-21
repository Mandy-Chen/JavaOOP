package Test;

import model.Student;

public class Test {
    public static void main(String[] args) {
        Student student=new Student();
        student.setName("Mandy Chen");
        student.setAge(23);
        student.setGender("女");
        student.setId(20164477);
        System.out.println("学生姓名："+student.getName());
        System.out.println("学生年龄："+student.getAge());
        System.out.println("学生性别："+student.getGender());
        System.out.println("学生ID："+student.getId());
    }
}
