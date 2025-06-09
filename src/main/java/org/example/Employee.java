package org.example;

public class Employee {
    int empId;
    String name;
    int age;
    float salary;
    String gender;
    String department;

    public Employee(int empId, String name, int age, float salary, String gender, String department) {
        this.empId = empId;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender=gender;
        this.department=department;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender="+gender+
                ", department="+department+
                '}';
    }
}
