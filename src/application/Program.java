package application;

import java.time.LocalDate;

import model.entities.Department;
import model.entities.Seller;

public class Program {
    public static void main(String[] args) {

        Department department = new Department(1, "Books");

        Seller seller = new Seller(10, "Felipe", "felipe@gmail.com", LocalDate.now(), 5000.00, department);

        System.out.println(seller);
    }
}
