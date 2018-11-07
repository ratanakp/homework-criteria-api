package com.example.homework02criteriaapi.entities;

import com.example.homework02criteriaapi.enums.Gender;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "empType")
public abstract class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String empName;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Embedded
    private Address address;

    @ManyToOne(optional = false, cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, targetEntity = Department.class)
    private Department department;

    @OneToOne(mappedBy = "employee",targetEntity = Account.class, cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true)
    private Account account;

    public Employee() {
    }

    public Employee(String empName, Gender gender, Address address, Department department, Account account) {
        this.empName = empName;
        this.gender = gender;
        this.address = address;
        this.department = department;
        this.account = account;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", empName='" + empName + '\'' +
                ", gender=" + gender +
                ", address=" + address +
                ", account=" + account +
                '}';
    }
}
