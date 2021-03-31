package address;

public class address {
private  String country;
private  String province;
private  String city;
private  String street;
private  String postcode;

public address() {
	country="china";
	province="湖北";
	city="武汉";
	street="阳光大道";
	postcode="435660";

}
public address(String country,String province,String city,String street,String postcode) {
	this.country=country;
	this.province=province;
	this.city=city;
	this.street=street;
	this.postcode=postcode;
}

public void setCountry(String country) {
	this.country=country;
}
public String getCountry() {
	return this.country;
}
public void setProvince(String province) {
	this.province=province;
}
public String getProvince() {
	return this.province;
}
public void setCity(String city) {
	this.city=city;
}
public String getCity() {
	return this.city;
}
public void setSstreet(String street) {
	this.street=street;
	
}
public String getStreet() {
	return this.street;
}
public void setPostcode(String postcode) {
	this.postcode=postcode;
}
public String getPostcode() {
	return this.postcode;
}

public void displayaddress() {
	String msg;
	msg="country:"+this.country;
	msg+="province:"+this.province;
	msg+="city:"+this.city;
	msg+="street:"+this.street;
	msg+="postcode:"+this.postcode;
	System.out.println(msg);
}
}






