package com.maverick.codigo.postal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

	@GetMapping("/")
	public String urlDefault() {
		return "Servicio para consultar Codigos Postales ";
	}
}
