package dtos;

import entities.Address;
import entities.Hobby;
import entities.Person;

public class PersonDTO {

    public Integer id;
    public String firstName;
    public String lastName;
    public String email;
    public Integer phone;
    public Integer age;
    public AddressDTO address;
    public HobbyDTO hobby;



    public PersonDTO(Person person){
        if(person.getId()!=null)
            this.id=person.getId();
        this.firstName= person.getFirstName();
        this.lastName = person.getLastName();
        this.email = person.getEmail();
        this.phone = person.getPhone();
        this.address = person.getAddress();
        this.hobby = person.getHobby();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
    }

    public HobbyDTO getHobby() {
        return hobby;
    }

    public void setHobby(HobbyDTO hobby) {
        this.hobby = hobby;
    }
}



