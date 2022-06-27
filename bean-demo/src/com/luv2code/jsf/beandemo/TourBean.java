package com.luv2code.jsf.beandemo;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class TourBean {
	
	private String kindOfTuor;
	
	public TourBean() {}

	public String getKindOfTuor() {
		return kindOfTuor;
	}

	public void setKindOfTuor(String kindOfTuor) {
		this.kindOfTuor = kindOfTuor;
	}
	
	public String startTheTour() {
		if (kindOfTuor != null && kindOfTuor.equals("city")) {
			return "city_tour";
		} else {
			return "country_tour";
		}
	}
}
