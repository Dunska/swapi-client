package fr.dunska.swapiclient.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class People implements Serializable {

    private String name;

    private String gender;

    @SerializedName("homeworld")
    private String homeWorldUrl;

    @SerializedName("birth_year")
    private String birthYear;

    private String height;

    private String mass;

    @SerializedName("species")
    private List<String> speciesUrls;

    @SerializedName("eye_color")
    private String eyeColor;

    @SerializedName("hair_color")
    private String hairColor;

    @SerializedName("skin_color")
    private String skinColor;

    @SerializedName("films")
    private List<String> filmsUrls;

    @SerializedName("starships")
    private List<String> starshipsUrls;

    @SerializedName("vehicles")
    private List<String> vehiclesUrls;

    private String created;

    private String edited;

    private String url;

    public People()
    {
    }

    public People(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHomeWorldUrl() {
        return homeWorldUrl;
    }

    public void setHomeWorldUrl(String homeWorldUrl) {
        this.homeWorldUrl = homeWorldUrl;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public List<String> getSpeciesUrls() {
        return speciesUrls;
    }

    public void setSpeciesUrls(List<String> speciesUrls) {
        this.speciesUrls = speciesUrls;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public List<String> getFilmsUrls() {
        return filmsUrls;
    }

    public void setFilmsUrls(List<String> filmsUrls) {
        this.filmsUrls = filmsUrls;
    }

    public List<String> getStarshipsUrls() {
        return starshipsUrls;
    }

    public void setStarshipsUrls(List<String> starshipsUrls) {
        this.starshipsUrls = starshipsUrls;
    }

    public List<String> getVehiclesUrls() {
        return vehiclesUrls;
    }

    public void setVehiclesUrls(List<String> vehiclesUrls) {
        this.vehiclesUrls = vehiclesUrls;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getEdited() {
        return edited;
    }

    public void setEdited(String edited) {
        this.edited = edited;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
