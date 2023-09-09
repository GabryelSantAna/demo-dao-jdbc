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

		System.out.println("=== TESTE 1: seller findById ===");

		Department dep = departmentDao.findById(3);

		System.out.println(dep);
		
		
		System.out.println("\n === TESTE 2: seller findAll ===");

		List<Department> list = departmentDao.finAll();

		for (Department d : list) {
			System.out.println(d);
		}
		/*
		System.out.println("\n === TESTE 3: seller insert ===");

		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);

		sellerdao.insert(newSeller);

		System.out.println("Inserted!! Novo Id = " + newSeller.getId());

		System.out.println("\n === TESTE 4: seller UPDATE ===");

		seller = sellerdao.findById(1);

		seller.setName("Martha Waine");

		sellerdao.update(seller);

		System.out.println("UPDATE completo!!");

		System.out.println("\n === TESTE 5: seller DELETE ===");

		System.out.println("Enter id for delete test: ");

		int id = sc.nextInt();

		sellerdao.deleteById(id);

		System.out.println("Delete completed");

		sc.close();*/
	}
}
