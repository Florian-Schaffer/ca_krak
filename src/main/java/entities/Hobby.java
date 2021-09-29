package entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Hobby implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(length = 50)
    private String name;

    private Long id;
    private String wikiLink;
    private String category;
    private String type;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWikiLink() {
        return wikiLink;
    }

    public void setWikiLink(String wikiLink) {
        this.wikiLink = wikiLink;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getId() { return id; }

    public void setId(Long id) {
        this.id = id;
    }








}
