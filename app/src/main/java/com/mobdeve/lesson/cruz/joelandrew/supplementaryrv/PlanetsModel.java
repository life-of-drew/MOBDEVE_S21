package com.mobdeve.lesson.cruz.joelandrew.supplementaryrv;


/*  This is our simple data class that contains the ID of the image resource and the name of
    the planet and number of moons. We set the variables to have private setters.
* */
public class PlanetsModel {
    String planetName;
    String noMoons;
    int image;

    public PlanetsModel(String planetName, String noMoons, int image) {
        this.planetName = planetName;
        this.noMoons = noMoons;
        this.image = image;
    }

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public String getNoMoons() {
        return noMoons;
    }

    public void setNoMoons(String noMoons) {
        this.noMoons = noMoons;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}


