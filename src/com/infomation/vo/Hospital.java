package com.infomation.vo;

public class Hospital {
	//병원정보를 저장하는 클래스
	private String category;//종별
	private String hospitalName;//요양기관명
	private String stateCode;//시도코드명
	private String cityCode;//시군구코드명
	private String address;//주소
	private String phone;//전화번호
	private String site;//홈페이지주소
	private String openDate;//개설일
	private int doctorCount;//총의사수
	
	public Hospital() {
	}

	public Hospital(String category, String hospitalName, String stateCode, String cityCode, String address,
			String phone, String site, String openDate, int doctorCount) {
		super();
		this.category = category;
		this.hospitalName = hospitalName;
		this.stateCode = stateCode;
		this.cityCode = cityCode;
		this.address = address;
		this.phone = phone;
		this.site = site;
		this.openDate = openDate;
		this.doctorCount = doctorCount;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getOpenDate() {
		return openDate;
	}
	public void setOpenDate(String openDate) {
		this.openDate = openDate;
	}
	public int getDoctorCount() {
		return doctorCount;
	}
	public void setDoctorCount(int doctorCount) {
		this.doctorCount = doctorCount;
	}

	@Override
	public String toString() {
		return "Hospital [category=" + category + ", hospitalName=" + hospitalName + ", stateCode=" + stateCode
				+ ", cityCode=" + cityCode + ", address=" + address + ", phone=" + phone + ", site=" + site
				+ ", openDate=" + openDate + ", doctorCount=" + doctorCount + ", getCategory()=" + getCategory()
				+ ", getHospitalName()=" + getHospitalName() + ", getStateCode()=" + getStateCode() + ", getCityCode()="
				+ getCityCode() + ", getAddress()=" + getAddress() + ", getPhone()=" + getPhone() + ", getSite()="
				+ getSite() + ", getOpenDate()=" + getOpenDate() + ", getDoctorCount()=" + getDoctorCount()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
