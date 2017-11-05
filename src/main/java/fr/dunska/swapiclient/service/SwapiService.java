package fr.dunska.swapiclient.service;

import fr.dunska.swapiclient.api.Swapi;
import fr.dunska.swapiclient.model.ModelList;
import fr.dunska.swapiclient.model.People;

import java.util.List;

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



}
