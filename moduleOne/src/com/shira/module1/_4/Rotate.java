package com.shira.module1._4;

/** An interface representing a rotation.
 * @author Shira Rubin
 * @version 4
*/
public interface Rotate {

    /**
     * Invoke a rotation of 90 degrees
     */
    void rotate90();

    /**
     * Invoke a rotation of 180 degrees
     */
    void rotate180();

    /**
     * Invoke a rotation with the given number of degrees
     * 
     * @param angle The angle of rotation, measured in degrees.
     */
    void rotate(double angle);
}
