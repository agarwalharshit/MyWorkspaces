package net.webservicex;

public class FindCountry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeoIPService gis= new GeoIPService();
		GeoIPServiceSoap giss=gis.getGeoIPServiceSoap();
		GeoIP gip=giss.getGeoIP("10.5.231.233");
		System.out.println(gip.countryName);

	}

}
