package com.main.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.app.model.Imovel;
import com.main.app.service.ImovelService;

@RestController
@RequestMapping(("/imoveis"))
@CrossOrigin
public class ImovelController {

	@Autowired
	ImovelService imovelService;
	
	@GetMapping()
	public List<Imovel>findAll() {
		
		return imovelService.findAll();
	}
}
