package com.maverick.codigo.postal.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maverick.codigo.postal.exception.NotFoundException;
import com.maverick.codigo.postal.model.CodigoPostalVO;
import com.maverick.codigo.postal.services.CodigoPostal;

@RestController
@RequestMapping("/zip-codes")
public class CodigoPostalController {
	
	
	@Autowired
	private CodigoPostal codigoPostalService;
	
	@GetMapping("/{zipcode}")
	public CodigoPostalVO getCodigoPostal(@PathVariable String zipcode) throws IOException,NotFoundException {
		CodigoPostalVO codigoVO = codigoPostalService.getCodigoPostal(zipcode);
		return codigoVO; 
	}
	

}
