package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

public class DepartmentService {
	
	public List<Department> findAll(){
		List<Department> list = new ArrayList<>();
		
		list.add(new Department(1, "BOOKs"));
		list.add(new Department(2, "GAMEs"));
		list.add(new Department(3, "CLOTHSs"));
		list.add(new Department(4, "DVDs"));
		
		return list;
	}
}
