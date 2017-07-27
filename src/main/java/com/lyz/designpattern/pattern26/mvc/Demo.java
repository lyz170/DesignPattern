package com.lyz.designpattern.pattern26.mvc;

/**
 * MVC模式<br>
 * MVC 模式代表 Model-View-Controller（模型-视图-控制器） 模式。<br>
 * 这种模式用于应用程序的分层开发。<br>
 * Model（模型） - 模型代表一个存取数据的对象或 JAVA POJO。它也可以带有逻辑，在数据变化时更新控制器。<br>
 * View（视图） - 视图代表模型包含的数据的可视化。<br>
 * Controller（控制器） - 控制器作用于模型和视图上。<br>
 * 它控制数据流向模型对象，并在数据变化时更新视图。它使视图与模型分离开。<br>
 */
public class Demo {
    public static void main(String[] args) {

        // 从数据可获取学生记录
        StudentModel model = retriveStudentFromDatabase();

        // 创建一个视图：把学生详细信息输出到控制台
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        // 更新模型数据
        controller.setStudentName("John");

        controller.updateView();
    }

    private static StudentModel retriveStudentFromDatabase() {
        StudentModel student = new StudentModel();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
}
