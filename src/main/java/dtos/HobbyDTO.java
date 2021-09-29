package dtos;

import entities.Hobby;

public class HobbyDTO {
    private Integer id;
    private String name;
    private String wikiLink;
    private String category;
    private String type;

    public HobbyDTO(){}

    public HobbyDTO(Hobby hobby){
        if(hobby.getName() != null)
            this.id = hobby.getId();
            this.name = hobby.getName();
            this.wikiLink = hobby.getWikiLink();
            this.category = hobby.getCategory();
            this.type = hobby.getType();
    }

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


}
