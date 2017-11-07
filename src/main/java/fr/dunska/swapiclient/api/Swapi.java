package fr.dunska.swapiclient.api;

import feign.Param;
import feign.RequestLine;
import fr.dunska.swapiclient.model.Film;
import fr.dunska.swapiclient.model.ModelList;
import fr.dunska.swapiclient.model.People;

import java.util.List;

public interface Swapi {

    @RequestLine("GET /people/")
    ModelList<People> peoples();

    @RequestLine("GET /people/{id}/")
    People people(@Param("id") String id);

    @RequestLine("GET /films/{id}/")
    Film film(@Param("id") String id);
}
