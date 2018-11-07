package com.example.homework02criteriaapi.entities;

import com.example.homework02criteriaapi.enums.Gender;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "ft_emp")
public class FullTimeEmployee extends Employee {

    private Double salary;

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(Double salary) {
        this.salary = salary;
    }

    public FullTimeEmployee(String empName, Gender gender, Address address, Department department, Account account, Double salary) {
        super(empName, gender, address, department, account);
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "salary=" + salary +
                '}';
    }
}
