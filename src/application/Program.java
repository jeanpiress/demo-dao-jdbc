package application;

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

}

}