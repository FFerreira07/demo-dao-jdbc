package application;

import java.time.LocalDate;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("==== TEST 1: seller findById ====");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n==== TEST 2: seller findByDepartment ====");
        Department dep = new Department(2, null);
        List<Seller> sellers = sellerDao.findByDepartment(dep);

        for (Seller obj : sellers) {
            System.out.println(obj);
        }

        System.out.println("\n==== TEST 3: seller findAll ====");
        sellers = sellerDao.findAll();

        for (Seller obj : sellers) {
            System.out.println(obj);
        }

        System.out.println("\n==== TEST 4: seller insert ====");
        Seller newSeller = new Seller(null, "Emilly", "emilly@gmail.com", LocalDate.of(1997, 10, 12), 4000.0, dep);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New Id = " + newSeller.getId());
    }
}
