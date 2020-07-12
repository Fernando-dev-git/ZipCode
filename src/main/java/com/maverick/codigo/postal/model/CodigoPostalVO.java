package com.maverick.codigo.postal.model;

import java.io.Serializable;
import java.util.List;

public class CodigoPostalVO implements Serializable{
	
	private static final long serialVersionUID = 7996517695578970782L;

	private String zip_code;
	private String locality;
	private String federal_entity;
	private List<SettlementsVO> settlements;
	private String municipality;
	
	
	@Override
	public String toString() {
		return "CodigoPostalVO[zip_code: "+zip_code+", locality: "+locality+", federal_entity:"+federal_entity+",settlements:"+settlements.toString()+", municipality: "+municipality+" ]";
	}
	
	/**
	 * @return the zip_code
	 */
	public String getZip_code() {
		return zip_code;
	}
	/**
	 * @param zip_code the zip_code to set
	 */
	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}
	/**
	 * @return the locality
	 */
	public String getLocality() {
		return locality;
	}
	/**
	 * @param locality the locality to set
	 */
	public void setLocality(String locality) {
		this.locality = locality;
	}
	/**
	 * @return the federal_entity
	 */
	public String getFederal_entity() {
		return federal_entity;
	}
	/**
	 * @param federal_entity the federal_entity to set
	 */
	public void setFederal_entity(String federal_entity) {
		this.federal_entity = federal_entity;
	}
	/**
	 * @return the settlements
	 */
	public List<SettlementsVO> getSettlements() {
		return settlements;
	}
	/**
	 * @param settlements the settlements to set
	 */
	public void setSettlements(List<SettlementsVO> settlements) {
		this.settlements = settlements;
	}
	/**
	 * @return the municipality
	 */
	public String getMunicipality() {
		return municipality;
	}
	/**
	 * @param municipality the municipality to set
	 */
	public void setMunicipality(String municipality) {
		this.municipality = municipality;
	}

}
