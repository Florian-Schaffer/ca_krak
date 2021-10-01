package dtos;

import entities.Phone;

public class PhoneDTO {
    private Integer id;
    private String number;
    private String description;



    public PhoneDTO (){}

    public PhoneDTO(Phone phone){
        if(phone.getId()!= null){
            this.description = phone.getDescription();
            this.number = phone.getNumber();
        }
    }

    //id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    //number
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    //description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
