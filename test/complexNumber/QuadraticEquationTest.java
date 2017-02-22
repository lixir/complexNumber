package test;

import complexNumber.ComplexNumber;
import complexNumber.QuadraticEquation;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static java.lang.Math.sqrt;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by lixir on 16.02.17.
 */
class QuadraticEquationTest {

    @Test
    public void squareTest() {
        ArrayList<ComplexNumber> list = new ArrayList<>();
        list.add(new ComplexNumber(-0.5, 0.5));
        list.add(new ComplexNumber(-0.5, -0.5));
        assertEquals(list, new QuadraticEquation(4, 4, 2).square());
    }

    @Test
    public void biquadrticTest() {
        ArrayList<ComplexNumber> list = new ArrayList<>();
        list.add(new ComplexNumber(sqrt(3), -1));
        list.add(new ComplexNumber(-sqrt(3), 1));
        list.add(new ComplexNumber(sqrt(3), 1));
        list.add(new ComplexNumber(-sqrt(3), -1));
        assertEquals(list, new QuadraticEquation(1, -4, 16).biquadratic());
    }
}