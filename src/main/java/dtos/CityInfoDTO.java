package dtos;

import entities.CityInfo;

import java.util.ArrayList;
import java.util.List;


public class CityInfoDTO {
    private Integer zipCode;
    private String city;


    public static List<CityInfoDTO> getCityDtos(List<CityInfo> CI){
        List<CityInfoDTO> CIdtos = new ArrayList();
        CI.forEach(cityI->CIdtos.add(new CityInfoDTO(cityI)));
        return CIdtos;
    }

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
