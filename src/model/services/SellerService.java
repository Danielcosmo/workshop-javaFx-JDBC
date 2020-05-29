package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class SellerService {
	
	private SellerDao sellerDao = DaoFactory.createSellerDao();
	
	public List<Seller> findAll(){
		return sellerDao.findAll();
	}
	public void saveOrUpdate(Seller dp) {
		if(dp.getId() == null) {
			sellerDao.insert(dp);
		}else {
			sellerDao.update(dp);
		}
	}
	public void remove(Seller dp) {
		sellerDao.deleteById(dp.getId());
	}
}
