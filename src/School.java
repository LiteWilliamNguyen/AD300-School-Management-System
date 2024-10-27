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


