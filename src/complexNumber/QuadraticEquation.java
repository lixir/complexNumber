package complexNumber;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

/**
 * Created by lixir on 09.02.17.
 */
public class QuadraticEquation {
    private double a,b,c;

    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public List<ComplexNumber> square(){
        List<ComplexNumber> result = new ArrayList<>();
        double discriminant = b * b - (4 * a *c);
        ComplexNumber x1 = new ComplexNumber (-b / (2 * a), sqrt(abs(discriminant)) / (2 * a));
        ComplexNumber x2 = new ComplexNumber (-b / (2 * a), -sqrt(abs(discriminant)) / (2 * a));
        result.add(x1);
        result.add(x2);
        return result;
    }

    public List<ComplexNumber> biquadratic(){
        List<ComplexNumber> list = this.square();
        List<ComplexNumber> result = new ArrayList<>();
        result.add(list.get(0).complexSqrt());
        result.add(list.get(0).complexSqrt().multipli(-1));
        result.add(list.get(1).complexSqrt());
        result.add(list.get(1).complexSqrt().multipli(-1));
        return result;
    }
}