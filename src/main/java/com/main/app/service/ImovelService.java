package com.main.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.app.dao.ImovelDAO;
import com.main.app.model.Imovel;

@Service
public class ImovelService {

	@Autowired
	ImovelDAO imovelDao;
	
	public List<Imovel> findAll(){
		
		return imovelDao.findAll();
	}
}
