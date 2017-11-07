package fr.dunska.swapiclient;

import feign.Feign;
import feign.gson.GsonDecoder;
import feign.okhttp.OkHttpClient;
import fr.dunska.swapiclient.api.Swapi;
import fr.dunska.swapiclient.model.People;
import fr.dunska.swapiclient.service.SwapiService;

import java.util.List;

public class Main {


    public static void main(String[] args) {

        SwapiService service = initService();

        final List<People> people = service.peopleFromMovie("1");
        System.out.println("Il y a "+people.size()+" personnages dans ce film");
    }

    private static SwapiService initService()
    {
        Swapi swapi = Feign.builder()
                .client(new OkHttpClient())
                .decoder(new GsonDecoder())
                .target(Swapi.class, "https://swapi.co/api");

        return new SwapiService(swapi);
    }

}
