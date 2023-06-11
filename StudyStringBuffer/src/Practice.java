public class Practice {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        employees[0] = new Employee("RY001","xioWang", "man");
        employees[1] = new Employee("RY002","xioHua", "man");
        employees[2] = new Employee("RY003","xioHu", "man");

        for (int i=0; i<employees.length;i++){
            System.out.println(employees[i].toString());
        }
    }

}

class Employee{
    private String id;
    private String name;
    private String gender;

    public Employee() {
    }

    public Employee(String id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee   " +
                "员工 id：'" + id + '\'' +
                ", 员工性别 name：'" + name + '\'' +
                ", 员工性别 gender：'" + gender + '\'';
    }
}
