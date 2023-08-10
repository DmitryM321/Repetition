

public final class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
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
    if (this == o) 
    return true;
    if (getClass() != o.getClass()) 
    return false;
    if (o == null || getClass() != o.getClass()) 
    return false;
   Man man = (Man) o;
   return dnaCode == man.dnaCode;
}
@Override
public int hashCode() {
    int result = model == null ? 0 : model.hashCode();
    result = 31 * result + manufactureYear;
    result = 31 * result + dollarPrice;
    return result;
}
}