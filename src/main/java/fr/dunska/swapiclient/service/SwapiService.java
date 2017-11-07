package fr.dunska.swapiclient.service;

import fr.dunska.swapiclient.api.Swapi;
import fr.dunska.swapiclient.model.ModelList;
import fr.dunska.swapiclient.model.People;

import java.util.List;
import java.util.stream.Collectors;

public class SwapiService {

    Swapi api;

    public SwapiService(Swapi api) {
        this.api = api;
    }

    public People getPeopleById(String id){
        return api.people(id);
    }

    public int countAllPeople(){
        return api.peoples().count;
    }

    public List<People> peopleFromMovie(String id){
        return api.film(id).charactersUrls.stream().map((url) -> {
            String[] vals = url.split("/");
            return api.people(vals[vals.length -1]);
        }).collect(Collectors.toList());
    }



}
