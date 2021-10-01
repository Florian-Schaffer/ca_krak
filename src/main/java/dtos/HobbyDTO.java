package dtos;

import entities.Hobby;

import java.util.List;
import java.util.stream.Collectors;

public class HobbyDTO {
    private Integer id;
    private String name;
    private String wikiLink;
    private String category;
    private String type;

    public static List<HobbyDTO> getFromList(List<Hobby> hobbies){
        return hobbies.stream()
                .map(hobby -> new HobbyDTO(hobby))
                .collect(Collectors.toList());
    }

    public HobbyDTO(){}

    public HobbyDTO(String name, String wikiLink, String category, String type){
        this.name = name;
        this.wikiLink = wikiLink;
        this.category = category;
        this.type = type;
    }

    public HobbyDTO(Hobby hobby){
        if(hobby.getName() != null)
            this.id = hobby.getId();
            this.name = hobby.getName();
            this.wikiLink = hobby.getWikiLink();
            this.category = hobby.getCategory();
            this.type = hobby.getType();
    }

    //id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
