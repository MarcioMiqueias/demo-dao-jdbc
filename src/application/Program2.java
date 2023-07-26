package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("-=-=-TEST 1: findById-=-=-");
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Department department = departmentDao.findById(3);
		System.out.println(department);
	
		System.out.println("\n-=-=-TEST 2: findAll-=-=-");
		List<Department> list = new ArrayList<>();
		list = departmentDao.findAll();
		for (Department dep : list) {
			System.out.println(dep);
		}
		
		System.out.println("\n-=-=-TEST 3: insert-=-=-");
		Department newDepartment = new Department(null, "insert test");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted. New id= " + newDepartment.getId());

		System.out.println("\n-=-=-TEST 4: update-=-=-");
		Department department2 = departmentDao.findById(3);
		department2.setName("administration");
		departmentDao.update(department2);
		System.out.println("Update completed");
		
		System.out.println("\n-=-=-TEST 5: delete-=-=-");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");

		sc.close();
	}

}
