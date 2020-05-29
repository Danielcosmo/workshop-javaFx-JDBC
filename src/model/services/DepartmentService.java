package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentService {
	
	private DepartmentDao dpDao = DaoFactory.createDepartment();
	
	public List<Department> findAll(){
		return dpDao.findAll();
	}
	public void saveOrUpdate(Department dp) {
		if(dp.getId() == null) {
			dpDao.insert(dp);
		}else {
			dpDao.update(dp);
		}
	}
	public void remove(Department dp) {
		dpDao.deleteById(dp.getId());
	}
}
