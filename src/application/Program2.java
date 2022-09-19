package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
	DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
	System.out.println("===== Test 1 =======");
	Department dep = departmentDao.findById(3);
	System.out.println(dep);
		
	System.out.println("===== Test 2 =======");
		List<Department> department = departmentDao.findAll();
		for(Department d: department) {
			System.out.println(d);
		}

		System.out.println("===== Test 3 =======");
		
		Department newDepartment = new Department(null, "Music");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! new id is: " + newDepartment.getId());
	}

}
