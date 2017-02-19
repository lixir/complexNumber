package complexNumber;

import static java.lang.Double.compare;
import static java.lang.Math.abs;
import static java.lang.Math.atan;
import static java.lang.Math.sqrt;

/**
 * Created by lixir on 09.02.17.
 */
public final class ComplexNumber {
    private double x; //действительная часть valid
    private double y; //мнимая часть imaginary

    public ComplexNumber ( double x, double y) {
        this.x = x;
        this.y = y;
    }

    public ComplexNumber ( int x, int y){
        this.x = x;
        this.y = y;
    }

    public ComplexNumber (double x) {
        this.x = x;
        this.y = 0;
    }

    @Override
    public String toString() {
        if (y == 0) return x + "";
        if (y > 0) return x + " + i" + y;
            else return x + " - i" + abs(y);
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj instanceof ComplexNumber){
            ComplexNumber other = (ComplexNumber) obj;
            if (this.x >= other.x - 1e-10 && this.x <= other.x + 1e-10
                    && this.y >= other.y - 1e-10 && this.y <= other.y + 1e-10) return true;
        }
        return false;
    }

    @Override
    public int hashCode(){
        return (int) (this.x * 30 + this.y);
    }

    public ComplexNumber plus(ComplexNumber other) {
        return new ComplexNumber(this.x + other.x, this.y + other.y);
    }

    public ComplexNumber minus(ComplexNumber other) {
        return new ComplexNumber(this.x - other.x, this.y - other.y);
    }

    public ComplexNumber multipli(ComplexNumber other) {
        return new ComplexNumber(this.x * other.x - this.y * other.y, this.x * other.y + other.x * this.y);
    }

    public ComplexNumber divided(ComplexNumber other) {
        return new ComplexNumber((
                this.x * other.x + this.y * other.y)/(other.x * other.x + other.y * other.y),
                (other.x * this.y - other.y * this.x)/(other.x * other.x + other.y * other.y));
    }

    public ComplexNumber multipli(int k) {
        return new ComplexNumber(this.x * k, this.y * k);
    }

    public double modulus() {
        return sqrt(this.x * this.x + this.y * this.y);
    }

    public double argument() {
        return atan( this.y / this.x);
    }

    public ComplexNumber linking(){
        return new ComplexNumber(this.x, - this.y);
    }

    public ComplexNumber complexSqrt(){
        double x = sqrt((this.modulus() + this.x)/2);
        double y = sqrt((this.modulus() - this.x)/2);
        double temp = 0.0;
        if (this.y != 0) y *= compare(0, this.y);
        return new ComplexNumber(x, y);
    }
}
