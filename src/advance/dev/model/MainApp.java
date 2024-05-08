package advance.dev.model;

import advance.dev.dao.Manager;
import advance.dev.model.Teacher;

public class MainApp {
    public static void main(String[] args) {
        // Tạo một đối tượng Manager
        Manager manager = new Manager();

        // Thêm giáo viên vào danh sách
        manager.addTeacher(new Teacher("Binh",50,"B001"));
        manager.addTeacher(new Teacher("Quyen",40, "Q002"));
        manager.addTeacher(new Teacher("Tri", 30, "T003"));

        // In ra danh sách giáo viên hiện có
        manager.printTeacherList();

        // In ra số giáo viên hiện có trong danh sách
        System.out.println("Number of Teachers: " + manager.getNumberOfTeachers());

        // Lấy ra thông tin của giáo viên cao tuổi nhất
        Teacher oldestTeacher = manager.getOldestTeacher();
        if (oldestTeacher != null) {
            System.out.println("Oldest Teacher:");
            System.out.println("Name: " + oldestTeacher.getName() + ", Age: " + oldestTeacher.getAge());
        } else {
            System.out.println("There are no teachers in the list.");
        }
    }
}