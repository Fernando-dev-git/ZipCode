package com.maverick.codigo.postal.model;

import java.io.Serializable;

public class SettlementsVO implements Serializable{
	
	private static final long serialVersionUID = 7996517695578970782L;
	
	private String name;
	private String zone_type;
	private String settlement_type;
	
	
	public SettlementsVO() {
	}
	
	
	public SettlementsVO(String name, String zone_type, String settlement_type) {
		this.name = name;
		this.zone_type = zone_type;
		this.settlement_type = settlement_type;
	}
	
	@Override
	public String toString() {
		return "SettlementsVO[name: "+name+", zone_type: "+zone_type+", settlement_type:"+settlement_type+"]";
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the zone_type
	 */
	public String getZone_type() {
		return zone_type;
	}


	/**
	 * @param zone_type the zone_type to set
	 */
	public void setZone_type(String zone_type) {
		this.zone_type = zone_type;
	}


	/**
	 * @return the settlement_type
	 */
	public String getSettlement_type() {
		return settlement_type;
	}


	/**
	 * @param settlement_type the settlement_type to set
	 */
	public void setSettlement_type(String settlement_type) {
		this.settlement_type = settlement_type;
	}
	
}
