package com.mycompany.textgame.domain;


public class Player {
    private String name;
    private Location currentLocation;

    public Player(String name) {
        this.name = name;
    }

    public void setCurrentLocation(Location location) {
        this.currentLocation = location;
    }

    public String getCurrentLocationDescription() {
        return this.currentLocation.getDescription();
    }
    
}
