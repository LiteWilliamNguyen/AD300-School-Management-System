/*
Create a Main class where you create instances of School, Department, Teacher, and Student.
Populate your school with at least two departments, and each department with at least two teachers and three students.
From the Main class, print out:
All departments in the school.
All teachers in each department.
All students in each department.
 */
public class Main {
    public static void main(String[] args) {

        //Adding school name
        School school = new School("Springfield High");


        //Adding Science Department name
        Department scienceDepartment = new Department("Science");

        //Create teacher and Student into science department
        Teacher scienceteacher1 = new Teacher("Mr.Smith", "Biology");
        Teacher scienceteacher2 = new Teacher("Mrs.Jones", "Chemistry");
        Student sciencestudent1 = new Student("John Doe", "Grade 10");
        Student sciencestudent2 = new Student("Jane Doe", "Grade 12");
        Student sciencestudent3 = new Student("Jim Beam", "Grade 11");

        //Add teacher and student into science department
        school.addDepartment(scienceDepartment);
        scienceDepartment.addTeacher(scienceteacher1);
        scienceDepartment.addTeacher(scienceteacher2);
        scienceDepartment.addStudent(sciencestudent1);
        scienceDepartment.addStudent(sciencestudent2);
        scienceDepartment.addStudent(sciencestudent3);


        //Adding Mathematics Department
        Department mathDepartment = new Department("Mathematics");

        //Create teacher and student in math department
        Teacher mathteacher1 = new Teacher("Mr.White", "Calculus");
        Teacher mathteacher2 = new Teacher("Ms.Black", "Algebra");
        Student mathstudent1 = new Student("Tim Cook", "Grade 10");
        Student mathstudent2 = new Student("Ann Taylor", "Grade 11");
        Student mathstudent3 = new Student("Gary Oak", "Grade 12");

        //Add teacher and student into math department
        school.addDepartment(mathDepartment);
        mathDepartment.addTeacher(mathteacher1);
        mathDepartment.addTeacher(mathteacher2);
        mathDepartment.addStudent(mathstudent1);
        mathDepartment.addStudent(mathstudent2);
        mathDepartment.addStudent(mathstudent3);

        //Display Output
        System.out.println("School: " + school.getSchoolName());
        System.out.print("Department: ");
        for (int i = 0; i < school.getDepartments().size(); i++) {
            //Print the name from getDepartmentName
            System.out.print(school.getDepartments().get(i).getDepartmentName());
            //if there is still department not list yet, then return ","
            if (i < school.getDepartments().size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        //School: Springfield High
        //Department: Science, Mathematics

        //Display each department details
        for (Department department : school.getDepartments()) {
            System.out.println(department.getDepartmentName() + " Department");
            //Display Teacher and student
            System.out.print("- Teachers: ");
            for (int i = 0; i < department.getTeachers().size(); i++) {
                Teacher teacher = department.getTeachers().get(i);
                System.out.print(teacher.getTeacherName() + "(" + teacher.getSubjectTaught() + ")");
                if (i < department.getTeachers().size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
            /*
            School: Springfield High
            Department: Science, Mathematics
            Science Department
            - Teachers:
            Mathematics Department
            - Teachers:
             */
            System.out.print("- Students: ");
            for (int i = 0; i < department.getStudents().size(); i++) {
                Student student = department.getStudents().get(i);
                System.out.print(student.getStudentName() + "(" + student.getGradeLevel() + ")");
                if (i < department.getStudents().size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();


        }
    }

}
/* Expect Output
School: Springfield High
Departments: Science, Mathematics
Science Department
- Teachers: Mr. Smith (Biology), Mrs. Jones (Chemistry)
- Students: John Doe (Grade 10), Jane Doe (Grade 12), Jim Beam (Grade 11)
Mathematics Department
- Teachers: Mr. White (Calculus), Ms. Black (Algebra)
- Students: Tim Cook (Grade 10), Ann Taylor (Grade 11), Gary Oak (Grade 12)
 */