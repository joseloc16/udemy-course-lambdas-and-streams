package com.debuggeando_ideas.fundamentals;

import lombok.Data;

import java.util.List;

public class App {

    public static void main(String[] args) {

        System.out.println(Product.class.getName());
        System.out.println(Employee.class.getName());
        System.out.println(String.class.getName());

        DatabaseService<String> dbAnonimo = new DatabaseService<String>() {

            @Override
            public String getById(Long id) {
                return "";
            }

            @Override
            public List<String> getAllRecords() {
                return List.of();
            }
        };
        System.out.println(dbAnonimo.getClass().getName());
    }

}
