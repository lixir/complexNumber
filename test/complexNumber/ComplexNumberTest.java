package test;

import complexNumber.ComplexNumber;
import org.junit.jupiter.api.Test;

import static java.lang.Math.PI;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by lixir on 12.02.17.
 */
class ComplexNumberTest {

    @Test
    public void toStringTest(){
        assertEquals("2.0 + i4.0", (new ComplexNumber(2,4)).toString());
        assertEquals("2.0 - i4.0", (new ComplexNumber(2,-4)).toString());
        assertEquals("2.0", (new ComplexNumber(2)).toString());
    }

    @Test
    public void plusTest(){
        assertEquals("3.0 + i7.0", ((new ComplexNumber(2,4)).plus(new ComplexNumber(1,3)))
                .toString());
    }

    @Test
    public void minusTest(){
        assertEquals("1.0 + i1.0", ((new ComplexNumber(2,4)).minus(new ComplexNumber(1,3)))
                .toString());
    }

    @Test
    public void  dividedTest(){
        assertEquals("1.0 - i2.0", ((new ComplexNumber(7,-4)).divided(new ComplexNumber(3,2)))
                .toString());

    }

    @Test
    public void  multipliTest(){
        assertEquals("7.0 - i4.0", ((new ComplexNumber(1,-2)).multipli(new ComplexNumber(3,2)))
                .toString());
        assertEquals("14.0 - i8.0", ((new ComplexNumber(7,-4)).multipli(2)).toString());
    }

    @Test
    public void modulusTest(){
        assertEquals(10d, (new ComplexNumber(8,6)).modulus());
    }

    @Test
    public void argumentTest(){
        assertEquals(PI / 4, (new ComplexNumber(2,2)).argument());
        assertEquals( PI / 2, (new ComplexNumber(0,99)).argument());
    }

    @Test
    public void linkingTest(){
        assertEquals(new ComplexNumber(5, -8), (new ComplexNumber(5,8)).linking());
        assertEquals(new ComplexNumber(5, 8), (new ComplexNumber(5,-8)).linking());
    }

    @Test
    public void complexSqrtTest(){
        assertEquals(new ComplexNumber(2, 0), new ComplexNumber(4,0).complexSqrt());
        assertEquals(new ComplexNumber(0, 2), new ComplexNumber(-4,0).complexSqrt());
    }
}