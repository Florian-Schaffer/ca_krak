package dtos;

import entities.Hobby;

import java.util.ArrayList;
import java.util.List;

public class HobbyListDTO {
    List<HobbyDTO> all = new ArrayList<>();

    public HobbyListDTO(List<Hobby> hobbiesEntities){
        hobbiesEntities.forEach((h)->{all.add(new HobbyDTO(h));});
    }



}
