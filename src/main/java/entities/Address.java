package entities;

import dtos.CityInfoDTO;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Entity
@NamedQuery(name = "Address.deleteAllRows", query = "DELETE from Address")
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    private String streetName;

    @ManyToOne
    private CityInfo cityInfo;

    @OneToMany(mappedBy = "address")
    private List<Person> persons;

    public Address(){}

    public Address(CityInfo cityInfo, String streetName){
        this.cityInfo = cityInfo;
        this.streetName = streetName;
        persons = new ArrayList<>();
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

    //id
    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    //persons
    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    public void addPerson(Person person){
        this.persons.add(person);
        if(person != null){
            person.setAddress(this);
        }
    }
}


