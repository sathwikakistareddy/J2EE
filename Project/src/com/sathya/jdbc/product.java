package com.sathya.jdbc;

public class product {
private  String proId;
private String proName;
private Double proPrice;
public String getProId() {
	return proId;
}
public void setProId(String proId) {
	this.proId = proId;
}
public String getProName() {
	return proName;
}
public void setProName(String proName) {
	this.proName = proName;
}
public Double getProPrice() {
	return proPrice;
}
public void setProPrice(Double proPrice) {
	this.proPrice = proPrice;
}
@Override
public String toString() {
	return "product [proId=" + proId + ", proName=" + proName + ", proPrice=" + proPrice + "]";
}

}

