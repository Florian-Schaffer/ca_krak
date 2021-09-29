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
    public HobbyListDTO hobby;

    public PersonDTO(){}

    public PersonDTO(Person person){
        if(person.getId()!=null)
            this.id=person.getId();
        this.firstName= person.getFirstName();
        this.lastName = person.getLastName();
        this.email = person.getEmail();
        this.phone = person.getPhone();
        this.address = person.getAddress();
        this.hobby = person.getHobbyListDTO();
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
    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    //address
    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
    }

    //hobby
    public HobbyListDTO getHobby() {
        return hobby;
    }

    public void setHobby(HobbyListDTO hobby) {
        this.hobby = hobby;
    }
}



