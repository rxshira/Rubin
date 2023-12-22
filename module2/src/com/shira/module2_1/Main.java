package com.shira.module2_1;

public class Main {
    public static void main(String[] args){
        Planet earth = new Planet("Earth", PlanetType.EARTH_LIKE);
        Planet saturn = new Planet("Saturn", PlanetType.GAS_GIANT);
        Planet jupiter = new Planet("Jupiter", PlanetType.GAS_GIANT);
        Planet earth2 = new Planet("Earth", PlanetType.EARTH_LIKE);
        System.out.println("Earth is equals to Eaeth2: " + earth.equals(earth2));
        System.out.println("Saturn is equal to Jupiyer: " + saturn.equals(jupiter));
        System.out.println("Eaeth is: "+earth.toString());
    }
}
