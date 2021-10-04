package dtos;

import entities.Address;
import entities.CityInfo;
import entities.Hobby;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class AddressDTO {

    private Integer id;
    private CityInfoDTO cityInfoDTO;
    private String streetName;

    public static List<AddressDTO> getAddressDtos(List<Address> adds){
        List<AddressDTO> addressdtos = new ArrayList();
        adds.forEach(add->addressdtos.add(new AddressDTO(add)));
        return addressdtos;
    }

    public AddressDTO(){}

    public AddressDTO(Address address){
        if(address.getId() != null) {
            this.id = address.getId();
            this.cityInfoDTO = new CityInfoDTO(address.getCityInfo());
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
    public CityInfoDTO getCityInfo() {
        return cityInfoDTO;
    }

    public void setCityInfo(CityInfoDTO cityInfo) {
        this.cityInfoDTO = cityInfo;
    }

    //streetname
    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }



}
