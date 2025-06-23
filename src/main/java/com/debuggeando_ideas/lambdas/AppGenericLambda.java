package com.debuggeando_ideas.lambdas;

import com.debuggeando_ideas.fundamentals.Employee;
import com.debuggeando_ideas.fundamentals.Product;

public class AppGenericLambda {

    public static void main(String[] args) {
        Printer<String> printString = System.out::println;
        printString.print("Hola mundo!");

        Printer<Product> printProduct = System.out::println;
        printProduct.print(new Product(1L, "Laptop", 1000.0));

        Printer<Employee> printEmployee = System.out::println;
        printEmployee.print(new Employee("87654321", "John Doe", 5000.0));
    }
}
