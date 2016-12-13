package Stepik_3;

/**
 * Created by qurub on 13.12.2016.
 */
public class Hash_Code_Equals {
    private final double re;
    private final double im;

    public Hash_Code_Equals(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hash_Code_Equals that = (Hash_Code_Equals) o;

        if (Double.compare(that.re, re) != 0) return false;
        return Double.compare(that.im, im) == 0;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(re);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(im);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
