package dtos;

import entities.CityInfo;


public class CityInfoDTO {
    private Integer zipCode;
    private String city;

    public CityInfoDTO(){ }

    public CityInfoDTO(CityInfo cityInfo){
        if(cityInfo.getZipCode() != null){
        this.city=cityInfo.getCity();
        this.zipCode=cityInfo.getZipCode();
        }
    }


    //zipcode
    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    //city
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
