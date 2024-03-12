package com.vn.devmaster.service.demo.baitap;

public class Demo {

        public static void main(String[] args) {
            Student student = new Student();
            Employee employee = new Employee();

            School school = new School(student);
            Company company = new Company(employee);

            System.out.println("School activities:");
            school.person();

            System.out.println("Company activities:");
            company.person();
        }
}
