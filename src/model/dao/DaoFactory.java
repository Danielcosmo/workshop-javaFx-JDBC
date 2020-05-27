package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoImpl;
import model.dao.impl.SellerDaoImpl;

public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		return new SellerDaoImpl(DB.getConnection());
	}
	public static DepartmentDao createDepartment() {
		return new DepartmentDaoImpl(DB.getConnection());
	}
}
