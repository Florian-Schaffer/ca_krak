package dtos;

import entities.Address;
import entities.Hobby;
import entities.Person;
import entities.Phone;
import java.util.ArrayList;
import java.util.List;

public class PersonDTO {

    public Integer id;
    public String firstName;
    public String lastName;
    public String email;
    public List<Phone> phones;
    public Integer age;
    public Address address;
    public List<Hobby> hobbyList;

    public PersonDTO(){}

    public PersonDTO(Person person){
        if(person.getId()!=null)
            this.id=person.getId();
        this.firstName= person.getFirstName();
        this.lastName = person.getLastName();
        this.email = person.getEmail();
        this.phones = person.getPhones();
        this.address = person.getAddress();
        this.hobbyList = person.getHobbyList();
    }

    //age
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    //id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    //first name
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //last name
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //phone
    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    //address
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    //hobby
    public List<Hobby> getHobby() {
        return hobbyList;
    }

    public void setHobby(List<Hobby> hobby) {
        this.hobbyList = hobby;
    }
}



