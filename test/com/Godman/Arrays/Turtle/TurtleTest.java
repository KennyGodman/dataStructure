package com.Godman.Arrays.Turtle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TurtleTest {
    private Turtle ijapa;

    @BeforeEach
    public void setUp(){
        ijapa = new Turtle();
    }
    @Test
    public void turtleHasPen(){
        assertNotNull(ijapa);
        assertNotNull(ijapa.getTurtlePen());

    }
    @Test
    public void turtlePenIsUp() {
        assertNotNull(ijapa);
        assertNotNull(ijapa.getTurtlePen().getPosition());
        assertEquals(PenPosition.UP, ijapa.getTurtlePen().getPosition());
//        assertEquals(PenPosition.UP, ijapa.getTurtlePen());
    }
    @Test
    public void moveForward(){
        turtlePenIsUp();
        ijapa.moveForward(9);
        assertEquals(0, ijapa.getyCoordinate());
        assertEquals(8, ijapa.getxCoordinate());


    }

}
