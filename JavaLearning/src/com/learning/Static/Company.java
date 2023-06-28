package com.learning.Static;

public class Company {
    private String name;
    private static int totalEmployees = 0;

    public Company(String name) {
        this.name = name;
    }

    public void hireEmployee() {
        totalEmployees++;
    }

    public void fireEmployee() {
        if (totalEmployees > 0) {
            totalEmployees--;
        }
    }

    public static int getTotalEmployees() {
        return totalEmployees;
    }

    public static void main(String[] args) {
        Company company1 = new Company("ABC Corp");
        company1.hireEmployee();
        company1.hireEmployee();

        Company company2 = new Company("XYZ Inc");
        company2.hireEmployee();

        System.out.println("Total employees at " + company1.name + ": " + company1.getTotalEmployees());
        System.out.println("Total employees at " + company2.name + ": " + company2.getTotalEmployees());
        System.out.println("Total employees at all companies: " + Company.getTotalEmployees());
    }
}

