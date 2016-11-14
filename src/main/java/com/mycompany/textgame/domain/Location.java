package com.mycompany.textgame.domain;

public class Location {
    
    private String longDescription;
    private String shortDescription;

    public Location(String longDescription, String shortDescription) {
        this.longDescription = longDescription;
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getDescription() {
       return this.longDescription+ "\n"+this.shortDescription;
    }
    
    
}
