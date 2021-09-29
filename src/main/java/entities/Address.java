package entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, length = 6)
    private Long id;

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public Integer zipCode;
    public CityInfo cityInfo;
    public String streetName;
    public String houseNr;

    public Address(){}

    public Address(Integer zipCode, CityInfo city, String streetName, String houseNr){
        this.zipCode = zipCode;
        this.cityInfo = city;
        this.streetName = streetName;
        this.houseNr = houseNr;
    }


    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public CityInfo getCityInfo() {
        return cityInfo;
    }

    public void setCityInfo(CityInfo cityInfo) {
        this.cityInfo = cityInfo;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getHouseNr() {
        return houseNr;
    }

    public void setHouseNr(String houseNr) {
        this.houseNr = houseNr;
    }
}


