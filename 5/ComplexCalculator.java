class Complex {
    Double real;
    Double imag;

    void print() {
        System.out.printf("%5.2f + %5.2f i", this.real, this.imag);
    }

    void println() {
        this.print();
        System.out.println();
    }

    public String toString() {
        return String.format("%5.2f + %5.2f i", this.real, this.imag);
    }

    Double absolute() {
        return Math.sqrt(this.real * this.real + this.imag * this.imag);
    }

    Complex conjugate() {
        Complex complex = new Complex();
        complex.real = this.real;
        complex.imag = this.imag * -1;
        return complex;
    }

    // 以下が四則演算
    public Complex add(Complex value) {
        Complex c = new Complex();
        c.real = this.real + value.real;
        c.imag = this.imag + value.imag;
        return c;
    }

    public Complex subtract(Complex value) {
        Complex c = new Complex();
        c.real = this.real - value.real;
        c.imag = this.imag - value.imag;
        return c;

    }

    public Complex multiply(Complex value) {
        Complex c = new Complex();
        c.real = this.real * value.real - this.imag * value.imag;
        c.imag = this.real * value.imag + this.imag * value.real;
        return c;
    }

    public Complex divide(Complex value) {
        Complex c = new Complex();
        Double x = value.real * value.real + value.imag * value.imag;
        c.real = (this.real * value.real + this.imag * value.imag) / x;
        c.imag = (this.imag * value.real - this.real * value.imag) / x;
        return c;

    }
}

public class ComplexCalculator {
    public Complex createComplex(Double real, Double imag) {
        Complex c = new Complex();
        c.real = real;
        c.imag = imag;
        return c;
    }

    public void run() {
        Complex c1 = this.createComplex(5.0, -6.0);
        Complex c2 = this.createComplex(3.0, 2.0);

        System.out.printf("absolute(%s) = %f%n", c1, c1.absolute());
        System.out.printf("conjugate(%s) = %s%n", c1, c1.conjugate());

        System.out.printf("%s + %s = %s%n", c1, c2, c1.add(c2));
        System.out.printf("%s - %s = %s%n", c1, c2, c1.subtract(c2));
        System.out.printf("%s * %s = %s%n", c1, c2, c1.multiply(c2));
        System.out.printf("%s / %s = %s%n", c1, c2, c1.divide(c2));
    }

    public static void main(String[] args) {
        new ComplexCalculator().run();
    }
}
