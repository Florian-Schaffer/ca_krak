package entities;

import com.sun.tools.javac.jvm.Gen;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, length = 6)
    private Long id;

    public String firstName;
    public String lastName;
    public String email;
    public Long phone;
    public Address address;
    public Hobby hobby;

    public Hobby getHobby() {
        return hobby;
    }


    public Person(){
    }

    public Person(String firstName, String lastName, String email, Long phone, Address address, Hobby hobby){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.hobby = hobby;
    }





    public Long getId(){return id;}

    public void setId(Long id) {this.id = id;}

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

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Hobby getHobbies() {
        return hobby;
    }

    public void setHobbies(Hobby hobby) {
        this.hobby = hobby;
    }



}
