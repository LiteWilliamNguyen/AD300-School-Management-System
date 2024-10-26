import java.util.ArrayList;
import java.util.List;

/*
School Class

Attributes: Name of the school, List of Departments.
Methods: Add department, Get all departments.
The School class should contain a list of Department objects.
 */
class School {
    private String schoolName;
    private List<Department> departments;

    /*
    Assigning value into the schoolName, and using "this" ensure it assign the parameter value to schoolName instead of other variable.
    Initialize new empty arrayList for department
     */
    public School(String schoolName){
        this.schoolName = schoolName;
        this.departments = new ArrayList<>();
    }

    public String getSchoolName() {
        return schoolName;
    }

    //Methods: Add department
    public void addDepartment(Department department){
        departments.add(department);
    }
    //Method: Getting All the department
    public List<Department> getDepartments(){
        return departments;
    }







}
/*
Department Class

Attributes: Name of the department, List of Teachers, List of Students.
Methods: Add teacher, Add student, Get all teachers, Get all students.
The Department class should contain lists of Teacher and Student objects.
 */
class Department {
    private String departmentName;
    private List<Teacher> teachers;
    private List<Student> students;

    public Department(String departmentName){
        this.departmentName = departmentName;
        this.teachers = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    //Method: Add teacher
    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }
    //Methods: Add student
    public void addStudent(Student student){
        students.add(student);
    }
    //Method: Get all teachers
    public List<Teacher> getTeachers(){
        return teachers;
    }
    //Get all students
    public List<Student> getStudents(){
        return students;
    }

}
/*
Teacher Class

Attributes: Name, Subject taught.
Methods: Get name, Get subject.
 */
class Teacher {
    private String teacherName;
    private String subjectTaught;

    public Teacher(String teacherName, String subjectTaught){
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
/*
Student Class

Attributes: Name, Grade level.
Methods: Get name, Get grade level.
 */
class Student {
    private String studentName;
    private String gradeLevel;

    public Student(String studentName, String gradeLevel){
        this.studentName = studentName;
        this.gradeLevel = gradeLevel;
    }

    public String getStudentName(){
        return studentName;
    }
    public String getGradeLevel(){
        return gradeLevel;
    }

}


/*
Create a Main class where you create instances of School, Department, Teacher, and Student.
Populate your school with at least two departments, and each department with at least two teachers and three students.
From the Main class, print out:
All departments in the school.
All teachers in each department.
All students in each department.
 */
class Main {
    public static void main(String[] args){

        //Adding school name
        School school = new School("Springfield High");

        //Add department to school
        school.addDepartment(new Department("Science"));
        school.addDepartment(new Department("Mathematics"));

        //Adding Science Department name
        Department scienceDepartment = new Department("Science");

        //Add teacher into science department
        scienceDepartment.addTeacher(new Teacher("Mr.Smith","Biology"));
        scienceDepartment.addTeacher(new Teacher("Mrs.Jones","Chemistry"));

        //Add Student into science department
        scienceDepartment.addStudent(new Student("John Doe","Grade 10"));
        scienceDepartment.addStudent(new Student("Jane Doe","Grade 12"));
        scienceDepartment.addStudent(new Student("Jim Beam","Grade 11"));

        //Adding Mathematics Department
        Department mathDepartment = new Department("Mathematics");

        //Add teacher into Mathematics department
        scienceDepartment.addTeacher(new Teacher("Mr.White","Calculus"));
        scienceDepartment.addTeacher(new Teacher("Ms.Black","Algebra"));

        //Add Student into science department
        scienceDepartment.addStudent(new Student("Tim Cook","Grade 10"));
        scienceDepartment.addStudent(new Student("Ann Taylor","Grade 11"));
        scienceDepartment.addStudent(new Student("Gary Oak","Grade 12"));

        /*
        //Display output
        //School: Springfield High
        System.out.println("School: "+ school.getSchoolName());
        //Departments: Science, Mathematics
        //using for loop to display all department
        for(Department department: school.getDepartments()){
            System.out.println("Departments: " + department.getDepartmentName());
        }
        //output
        //School: Springfield High
        //Departments: Science
        //Departments: Mathematics
        */







    }

}
/*
School: Springfield High
Departments: Science, Mathematics
Science Department
- Teachers: Mr. Smith (Biology), Mrs. Jones (Chemistry)
- Students: John Doe (Grade 10), Jane Doe (Grade 12), Jim Beam (Grade 11)
Mathematics Department
- Teachers: Mr. White (Calculus), Ms. Black (Algebra)
- Students: Tim Cook (Grade 10), Ann Taylor (Grade 11), Gary Oak (Grade 12)
 */