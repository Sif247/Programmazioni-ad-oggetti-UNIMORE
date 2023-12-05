import java.util.Objects;

public class RationalNumber {
    final int numerator;
    final int denominator;


    public RationalNumber(int numerator, int denominator) {
        int gcm = greatestCommonDivisor(numerator, denominator);
        this.numerator = numerator / gcm;
        this.denominator = denominator / gcm;
    }
    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public RationalNumber add(RationalNumber o)
    {
        int lcm = leastCommonMultiple(denominator, o.getDenominator());
        int num = numerator * (lcm / denominator) + o.getNumerator() * (lcm / o.getDenominator());
        return new RationalNumber(num, lcm);
    }

    public RationalNumber multiply(RationalNumber o) {
        int num = numerator * o.getNumerator();
        int den = denominator * o.getDenominator();
        return new RationalNumber(num, den);
    }

    static int greatestCommonDivisor(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        int rest = max % min;
        if (max % min == 0) {
            return min;
        } else {
            return greatestCommonDivisor(min, rest);
        }
    }

    static int leastCommonMultiple(int a, int b) {
        return Math.abs(a * b) / greatestCommonDivisor(a, b);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        RationalNumber that = (RationalNumber) o;
        return numerator == that.numerator && denominator == that.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    @Override
    public String toString() {
        return "Rational{" + "numerator=" + numerator + ", denominator=" + denominator + '}';
    }

}