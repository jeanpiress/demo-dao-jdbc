package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1 ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println("\n=== TEST 2 ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);	
		for(Seller s: list) {
			System.out.println(s);
		}
	
		System.out.println("\n=== TEST 3 ===");
		list = sellerDao.findAll();	
		for(Seller x: list) {
			System.out.println(x);
		}
		
		System.out.println("\n=== TEST 4 ===");
        Seller newSeller = new Seller(null, "Jean Pires", "Jean@gmail.com", new Date(), 4000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());
        
        System.out.println("\n=== TEST 4 ===");
        seller = sellerDao.findById(1);
        seller.setName("Bruce Waine");
        sellerDao.update(seller);
        System.out.println("Update completed!");
}

	
}