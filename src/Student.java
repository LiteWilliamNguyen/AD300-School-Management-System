/*
Student Class

Attributes: Name, Grade level.
Methods: Get name, Get grade level.
 */
public class Student {
    private String studentName;
    private String gradeLevel;

    public Student(String studentName, String gradeLevel) {
        this.studentName = studentName;
        this.gradeLevel = gradeLevel;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

}
