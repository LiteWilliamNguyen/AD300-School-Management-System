/*
Teacher Class

Attributes: Name, Subject taught.
Methods: Get name, Get subject.
 */
public class Teacher {
    private String teacherName;
    private String subjectTaught;

    public Teacher(String teacherName, String subjectTaught) {
        this.teacherName = teacherName;
        this.subjectTaught = subjectTaught;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getSubjectTaught() {
        return subjectTaught;
    }
}
