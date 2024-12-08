import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SchoolManagementTest {

    // Normal Test Case 1: Test creation of a School object
    @Test
    public void testSchoolCreation() {
        School school = new School("Springfield High");

        // Validate the name of the school
        assertEquals("Springfield High", school.getSchoolName());

        // Validate that the school starts with no departments
        assertTrue(school.getDepartments().isEmpty());
    }
    // Normal Test Case 2: Test adding teachers and students to a department
    @Test
    public void testAddTeachersAndStudentsToDepartment() {
        Department science = new Department("Science");

        science.addTeacher(new Teacher("Mr. Smith", "Biology"));
        science.addTeacher(new Teacher("Mrs. Jones", "Chemistry"));

        science.addStudent(new Student("John Doe", "Grade 10"));
        science.addStudent(new Student("Jane Doe", "Grade 12"));

        assertEquals(2, science.getTeachers().size());
        assertEquals(2, science.getStudents().size());
    }

    // Normal Test Case 3: Test hierarchical integration of school, departments, teachers, and students
    @Test
    public void testSchoolHierarchy() {
        School school = new School("Test High");
        Department math = new Department("Mathematics");

        math.addTeacher(new Teacher("Ms. White", "Algebra"));
        math.addStudent(new Student("Alice Blue", "Grade 11"));

        school.addDepartment(math);

        assertEquals(1, school.getDepartments().size());
        assertEquals(1, school.getDepartments().get(0).getTeachers().size());
        assertEquals(1, school.getDepartments().get(0).getStudents().size());
    }


    // Edge Test Case 1: Test adding an empty department
    @Test
    public void testEmptyDepartment() {
        School school = new School("Empty School");
        Department emptyDept = new Department("Empty Dept");

        school.addDepartment(emptyDept);

        assertEquals(1, school.getDepartments().size());
        assertTrue(emptyDept.getTeachers().isEmpty());
        assertTrue(emptyDept.getStudents().isEmpty());
    }

    // Edge Test Case 2: Test adding duplicate teachers and students
    @Test
    public void testDuplicateEntries() {
        Department science = new Department("Science");

        Teacher duplicateTeacher = new Teacher("Dr. Smith", "Physics");
        Student duplicateStudent = new Student("John Doe", "Grade 12");

        science.addTeacher(duplicateTeacher);
        science.addTeacher(duplicateTeacher); // Duplicate

        science.addStudent(duplicateStudent);
        science.addStudent(duplicateStudent); // Duplicate

        assertEquals(1, science.getTeachers().size()); // No Duplicates allowed
        assertEquals(1, science.getStudents().size());
    }

    // Edge Test Case 3: Test handling null teacher and student entries
    @Test
    public void testNullEntries() {
        Department math = new Department("Mathematics");

        assertThrows(NullPointerException.class, () -> math.addTeacher(null));
        assertThrows(NullPointerException.class, () -> math.addStudent(null));
    }
}