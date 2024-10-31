import java.util.ArrayList;
import java.util.List;

/*
Department Class

Attributes: Name of the department, List of Teachers, List of Students.
Methods: Add teacher, Add student, Get all teachers, Get all students.
The Department class should contain lists of Teacher and Student objects.
 */
public class Department {
    private String departmentName;
    private List<Teacher> teachers;
    private List<Student> students;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.teachers = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    //Method: Add teacher
    public void addTeacher(Teacher teacher) {
        if (!teachers.contains(teacher)){
            teachers.add(teacher);
        }else {
            System.out.println("Teacher's name exist.");
        }
    }

    //Methods: Add student
    public void addStudent(Student student) {
        if (!students.contains(student)){
            students.add(student);
        }else {
            System.out.println("Student's name exist.");
        }
    }

    //Method: Get all teachers
    public List<Teacher> getTeachers() {
        return teachers;
    }

    //Get all students
    public List<Student> getStudents() {
        return students;
    }

}
