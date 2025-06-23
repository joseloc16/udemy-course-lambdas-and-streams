package com.debuggeando_ideas.fundamentals;

import lombok.ToString;

@ToString
public class Employee {

    private String dni;
    private String name;
    private Double salary;

    public Employee() {}

    public Employee(String dni, String name, Double salary) {
        this.dni = dni;
        this.name = name;
        this.salary = salary;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
