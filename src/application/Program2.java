package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

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

	
	}

}
