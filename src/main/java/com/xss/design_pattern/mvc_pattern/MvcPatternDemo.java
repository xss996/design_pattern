package com.xss.design_pattern.mvc_pattern;

public class MvcPatternDemo {
    public static void main(String[] args) {
        //模拟从数据库获取学生记录
        Student model = retrieveStudentFromDatabase();
        //创建一个视图：把学生详细信息输出到控制台
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        controller.setStudentGrade(3);
        controller.updateView();

    }

    static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setName("张三");
        student.setGrade(2);
        return student;
    }
}
