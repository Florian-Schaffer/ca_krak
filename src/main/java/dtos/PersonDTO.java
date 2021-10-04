package dtos;

import entities.*;

import java.util.ArrayList;
import java.util.List;

public class PersonDTO {

    public Integer id;
    public String firstName;
    public String lastName;
    public String email;
    public List<Phone> phones;
    public Integer age;
    public AddressDTO addressDTO;
    public List<HobbyDTO> hobbyListDTO;

    public static List<PersonDTO> getPersonDtos(List<Person> person){
        List<PersonDTO> personDTO = new ArrayList();
        person.forEach(ps->personDTO.add(new PersonDTO(ps)));
        return personDTO;
    }

    public PersonDTO(){}

    public PersonDTO(Person person){
        if(person.getId()!=null)
            this.id=person.getId();
        this.firstName= person.getFirstName();
        this.lastName = person.getLastName();
        this.email = person.getEmail();
        this.phones = person.getPhones();
        this.addressDTO = new AddressDTO(person.getAddress());
        this.hobbyListDTO = HobbyDTO.getHobbyDtos(person.getHobbyList());
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
    public AddressDTO getAddress() {
        return addressDTO;
    }

    public void setAddress(AddressDTO address) {
        this.addressDTO = address;
    }

    //hobby
    public List<HobbyDTO> getHobby() {
        return hobbyListDTO;
    }

    public void setHobby(List<HobbyDTO> hobby) {
        this.hobbyListDTO = hobby;
    }
}



