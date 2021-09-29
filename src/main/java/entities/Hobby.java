package entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Hobby implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(length = 50)
    private String name;

    private Integer id;
    private String wikiLink;
    private String category;
    private String type;


    //name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //wikilink
    public String getWikiLink() {
        return wikiLink;
    }

    public void setWikiLink(String wikiLink) {
        this.wikiLink = wikiLink;
    }

    //category
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    //type
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //id
    public Integer getId() { return id; }

    public void setId(Integer id) {
        this.id = id;
    }








}
