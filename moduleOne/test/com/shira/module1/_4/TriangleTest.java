package com.shira.module1._4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TriangleTest {
    
    /**
     * Test the getArea method of Triangle when it's created with sides
     */
    @Test
    public void testGetAreaWithSides(){
        Triangle t;
        try{
            t = new Triangle(3, 4, 5, Colour.BLUE);
            assertEquals(6, t.getArea(), 0);
        }
        catch (Exception e){
        }
    }

    /**
     * Test the getArea method of Triangle when it's created with width and height
     */
    @Test
    public void testGetAreaWithWidthHeight(){
        Triangle t;
        try{
            t = new Triangle(5,8,Colour.GREEN);
            assertEquals(20, t.getArea(), 0);

            t = new Triangle(8.0, 2.0, Colour.NONE);
            assertEquals(8, t.getArea(), 0);
        }
        catch (Exception e){
        }
    }

    /**
     * Test that two triangles with the same sides but provided in different order have the same area
     */ 
    @Test
    public void testGetAreaTrianglesWithReorderedSides(){
        Triangle t, t1;
        try{          
            t = new Triangle(12,20, 25.7, Colour.RED);
            t1 = new Triangle(25.7,20,12, Colour.BLUE);
            assertEquals(t.getArea(),t1.getArea(), 0);
        }
        catch (Exception e){
        }
    }

}
