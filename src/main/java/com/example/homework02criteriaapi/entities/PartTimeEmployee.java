package com.example.homework02criteriaapi.entities;

import com.example.homework02criteriaapi.enums.Gender;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "pt_emp")
public class PartTimeEmployee extends Employee{

    private Double hourlyRate;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(Double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public PartTimeEmployee(String empName, Gender gender, Address address, Department department, Account account, Double hourlyRate) {
        super(empName, gender, address, department, account);
        this.hourlyRate = hourlyRate;
    }

    public Double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(Double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "hourlyRate=" + hourlyRate +
                '}';
    }
}
