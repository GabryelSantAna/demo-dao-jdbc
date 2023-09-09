package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("=== TESTE 1: department findById ===");

		Department dep = departmentDao.findById(3);

		System.out.println(dep);
		
		
		System.out.println("\n === TESTE 2: department findAll ===");

		List<Department> list = departmentDao.finAll();

		for (Department d : list) {
			System.out.println(d);
		}
		
		System.out.println("\n === TESTE 3: department insert ===");

		Department newDepartment = new Department(null,"Music");

		departmentDao.insert(newDepartment);

		System.out.println("Inserted!! Novo Id = " + newDepartment.getId());
		
		System.out.println("\n === TESTE 4: department UPDATE ===");
		 
		Department dep2 = departmentDao.findById(1);

		dep2.setName("Food");

		departmentDao.update(dep2);

		System.out.println("UPDATE completo!!");
		
		System.out.println("\n === TESTE 5: department DELETE ===");

		System.out.println("Enter id for delete test: ");

		int id = sc.nextInt();

		departmentDao.deleteById(id);

		System.out.println("Delete completed");

		sc.close();
	}
}
