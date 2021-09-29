package entities;

import com.sun.tools.javac.jvm.Gen;
import dtos.AddressDTO;
import dtos.HobbyDTO;
import dtos.HobbyListDTO;

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
    public HobbyListDTO hobbyListDTO;


    public Person(){
    }

    public Person(String firstName, String lastName, String email, Integer phone, Integer age, AddressDTO address, HobbyListDTO hobby){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.addressDTO = address;
        this.hobbyListDTO = hobby;
    }


    //age
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    //id
    public Integer getId(){return id;}

    public void setId(Integer id) {this.id = id;}

    //first name
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) { this.firstName = firstName; }

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
        return addressDTO;
    }

    public void setAddress(AddressDTO address) {
        this.addressDTO = addressDTO;
    }

    //hobby list
    public HobbyListDTO getHobbyListDTO(){return hobbyListDTO;}

    public void setHobbyListDTO(HobbyListDTO hobbyList){this.hobbyListDTO = hobbyList;}



}
