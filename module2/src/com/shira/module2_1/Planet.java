package com.shira.module2_1;

import java.util.Objects;

/**
 * A class that represents a planet.
 * 
 * @author Shira Rubin
 * @version 1
 */

public class Planet { 

    private String designation; 
    private double massKg; 
    private double orbitEarthYears; 
    private PlanetType type; 

    public Planet(String designation, PlanetType type){ 
        this.designation = designation; 
        this.type = type; 
    } 

    public Planet(String designation, double massKg, double orbitEarthYears, PlanetType type) { 
        this.designation = designation; 
        this.massKg = massKg; 
        this.orbitEarthYears = orbitEarthYears; 
        this.type = type; 
    } 

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()){
            return false;
        }

        if(this == obj){
            return true;
        }
        Planet otherPlanet = (Planet) obj;
        return Objects.equals(this.designation, otherPlanet.designation);
    }

    @Override
    public int hashCode() {
        // concatinating to an empty string means that even if the designation is null, it will
        // be replaced by the string "null" and not throw an exception
        return (""+ this.designation).hashCode();
    }

    @Override
    public String toString() {
        return "Planet: \n"+
               "\tDesignation: "+designation+"\n" +
               "\tType: "+type;
    }
} 