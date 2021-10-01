package dtos;

import entities.Address;
import entities.CityInfo;
import entities.Hobby;

import java.util.List;
import java.util.stream.Collectors;


public class AddressDTO {

    private Integer id;
    private CityInfo cityInfo;
    private String streetName;



    public AddressDTO(){}

    public AddressDTO(Address address){
        if(address.getId() != null) {
            this.id = address.getId();
            this.cityInfo = address.getCityInfo();
            this.streetName = address.getStreetName();

        }
    }

/*
    public static AddressDTO getFromList(Address address){
        return address.stream();
                .map(address -> new AddressDTO(address))
                .collect(Collectors.toList());
    }
    */


    //id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    //city
    public CityInfo getCityInfo() {
        return cityInfo;
    }

    public void setCityInfo(CityInfo cityInfo) {
        this.cityInfo = cityInfo;
    }

    //streetname
    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }



}
