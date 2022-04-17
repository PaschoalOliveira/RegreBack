package com.main.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.app.model.Imovel;

public interface ImovelDAO extends JpaRepository<Imovel, Integer>{

}
