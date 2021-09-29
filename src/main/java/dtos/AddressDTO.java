package dtos;

import entities.Address;

public class AddressDTO {
    private Integer id;

    private CityInfoDTO cityInfoDTO;
    private String streetName;
    private String houseNr;

    public AddressDTO(){}

    public AddressDTO(Address address){
        if(address.getId() != null) {
            this.id = address.getId();
            this.cityInfoDTO = address.getCityInfo();
            this.streetName = address.getStreetName();
            this.houseNr = address.getHouseNr();
        }
    }


    //id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    //city
    public CityInfoDTO getCityInfoDTO() {
        return cityInfoDTO;
    }

    public void setCityInfoDTO(CityInfoDTO cityInfoDTO) {
        this.cityInfoDTO = cityInfoDTO;
    }

    //streetname
    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    //house nr
    public String getHouseNr() {
        return houseNr;
    }

    public void setHouseNr(String houseNr) {
        this.houseNr = houseNr;
    }


}
