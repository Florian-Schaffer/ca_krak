package entities;

import dtos.CityInfoDTO;

import javax.persistence.*;
import java.io.Serializable;


@Entity
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, length = 6)
    private Integer id;


    private CityInfoDTO cityInfo;
    private String streetName;
    private String houseNr;

    public Address(){}

    public Address(CityInfoDTO city, String streetName, String houseNr){
        this.cityInfo = city;
        this.streetName = streetName;
        this.houseNr = houseNr;
    }


    //city
    public CityInfoDTO getCityInfo() {
        return cityInfo;
    }

    public void setCityInfo(CityInfoDTO cityInfo) {
        this.cityInfo = cityInfo;
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

    //id
    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}



}


