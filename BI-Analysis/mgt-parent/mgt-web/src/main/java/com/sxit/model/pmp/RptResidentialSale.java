package com.sxit.model.pmp;


public class RptResidentialSale{

	private Integer recognition_subs_num;
	private Integer visit_subscribe_num;
	private Integer subs_contract_num;
	private Integer visit_contract_num;
	private Integer visit_reco_num;
	private String big_code;
	private String city_code;
	
	public String getBig_code() {
		return big_code;
	}
	public void setBig_code(String big_code) {
		this.big_code = big_code;
	}
	public String getCity_code() {
		return city_code;
	}
	public void setCity_code(String city_code) {
		this.city_code = city_code;
	}
	
	public Integer getRecognition_subs_num() {
		return recognition_subs_num;
	}
	public void setRecognition_subs_num(Integer recognition_subs_num) {
		this.recognition_subs_num = recognition_subs_num;
	}
	public Integer getVisit_subscribe_num() {
		return visit_subscribe_num;
	}
	public void setVisit_subscribe_num(Integer visit_subscribe_num) {
		this.visit_subscribe_num = visit_subscribe_num;
	}
	public Integer getSubs_contract_num() {
		return subs_contract_num;
	}
	public void setSubs_contract_num(Integer subs_contract_num) {
		this.subs_contract_num = subs_contract_num;
	}
	public Integer getVisit_contract_num() {
		return visit_contract_num;
	}
	public void setVisit_contract_num(Integer visit_contract_num) {
		this.visit_contract_num = visit_contract_num;
	}
	public Integer getVisit_reco_num() {
		return visit_reco_num;
	}
	public void setVisit_reco_num(Integer visit_reco_num) {
		this.visit_reco_num = visit_reco_num;
	}
	
}