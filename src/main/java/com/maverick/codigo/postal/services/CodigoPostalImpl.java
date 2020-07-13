package com.maverick.codigo.postal.services;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maverick.codigo.postal.exception.NotFoundException;
import com.maverick.codigo.postal.model.CodigoPostalVO;
import com.maverick.codigo.postal.model.SettlementsVO;

@Service
public class CodigoPostalImpl implements CodigoPostal {

	@Autowired
	private ServletContext context;

	@Override
	public CodigoPostalVO getCodigoPostal(String zipCode) throws IOException, NotFoundException {
		File resource = new File(context.getRealPath("/WEB-INF/CPMexico.txt"));
		List<String> multilineas = null;
		
		try {
			multilineas = Files.readAllLines(resource.toPath());
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (multilineas != null) {
			List<String> cp_coincide = new ArrayList<>();
			
			multilineas.forEach(linea -> {
				if(compararCodigo(linea, zipCode)) {
					cp_coincide.add(linea);
				};
			});
			
			if(!cp_coincide.isEmpty()) {
			   return getFormatoCodigoPostalVO(cp_coincide);
			}
		}
		throw new NotFoundException("No se encontraron registros con este código postal.");
	}

	@Override
	public Boolean compararCodigo(String linea, String zipCode) {
		String[] cabeceras = linea.split(Pattern.quote("|"));
		if (cabeceras[0].equals(zipCode)) {
			return true;
		}
		return false;
	}

	@Override
	public CodigoPostalVO getFormatoCodigoPostalVO(List<String> lista) {
		String[] zipCodefound = lista.get(0).split(Pattern.quote("|"));
		CodigoPostalVO codigopostalVO = new CodigoPostalVO();
		
		codigopostalVO.setZip_code(zipCodefound[0]);
		codigopostalVO.setLocality(zipCodefound[5]);
		codigopostalVO.setFederal_entity(zipCodefound[4]);
		codigopostalVO.setMunicipality(zipCodefound[3]);

		List<SettlementsVO> settlements = new ArrayList<>();
		lista.forEach(settlement ->{
			String[] cabeceras = settlement.split(Pattern.quote("|"));
			settlements.add(new SettlementsVO(cabeceras[1], cabeceras[13], cabeceras[2]));
		});
		
		codigopostalVO.setSettlements(settlements);
		return codigopostalVO;
	}

}
