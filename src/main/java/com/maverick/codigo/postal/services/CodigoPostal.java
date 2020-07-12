package com.maverick.codigo.postal.services;

import java.io.IOException;
import java.util.List;

import com.maverick.codigo.postal.exception.NotFoundException;
import com.maverick.codigo.postal.model.CodigoPostalVO;

public interface CodigoPostal {
	
	/**
	 * Descripción: Método para leear y reestructuras los archivos
	 * 
	 * @author Fernando
	 * @return CodigoPostalVO
	 * @throws NotFoundException 
	 */
	public CodigoPostalVO getCodigoPostal(String zipCode) throws IOException, NotFoundException;

	/**
	 * Descripción: Método para obtener todos los CP iguales
	 * 
	 * @author Fernando Octavio
	 * @return Boolean
	 */
	public Boolean compararCodigo(String linea, String zipCode);
	
	/**
	 * Descripción: Método que retorna el codigo postal 
	 * 
	 * @author Fernando Octavio
	 * @return CodigoPostalVO
	 */
	public CodigoPostalVO getFormatoCodigoPostalVO(List<String> lista);

}
