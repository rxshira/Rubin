package com.shira.module1._4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class CircleTest {
    
    /**
     * Test getArea method of Circle - simple circle creation
     */
    @Test
    public void testGetAreaSimple() {
        Circle c;
        try {
            c = new Circle(3, Colour.RED);
            assertEquals(9 * Circle.PI, c.getArea(), 0);
        } 
        catch (Exception e) {
        }
    }

    /**
     * Test getArea method of Circle - two Circles with the same radius should have the same area
     */
    @Test
    public void testGetAreaTwoCirclesWithSameRadius() {
        Circle c, c1;
        try {
            c = new Circle(5, Colour.RED);
            c1 =  new Circle(5, Colour.GREEN);
            assertEquals(c.getArea(), c1.getArea(), 0);
        } 
        catch (Exception e) {
        }
    }


    /**
     * Test getArea method of Circle - two Circles with different radius don't have the same radius even
     * if we allow some delta, but with large enough delta their area is considered equals
     */    
    @Test
    public void testGetAreaTwoCirclesWithDifferentRadius() {
        Circle c, c1;
        try {
            c = new Circle(5, Colour.RED);
            c1 =  new Circle(8, Colour.GREEN);
            assertNotEquals(c.getArea(), c1.getArea(), 38 * Circle.PI);
            assertEquals(c.getArea(), c1.getArea(), 39 * Circle.PI);
        } 
        catch (Exception e) {
        }
    }

}
