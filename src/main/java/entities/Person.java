package entities;

import com.sun.tools.javac.jvm.Gen;
import dtos.AddressDTO;
import dtos.HobbyDTO;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, length = 6)
    private Integer id;

    public String firstName;
    public String lastName;
    public String email;
    public Integer phone;
    public Integer age;
    public AddressDTO addressDTO;
    public HobbyDTO hobbyDTO;

    public HobbyDTO getHobby() {
        return hobbyDTO;
    }


    public Person(){
    }

    public Person(String firstName, String lastName, String email, Integer phone, Integer age, AddressDTO address, HobbyDTO hobby){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.addressDTO = address;
        this.hobbyDTO = hobby;
    }



    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId(){return id;}

    public void setId(Integer id) {this.id = id;}

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
        return addressDTO;
    }

    public void setAddress(AddressDTO address) {
        this.addressDTO = addressDTO;
    }

    public HobbyDTO getHobbies() {
        return hobbyDTO;
    }

    public void setHobbies(HobbyDTO hobby) {
        this.hobbyDTO = hobbyDTO;
    }



}
