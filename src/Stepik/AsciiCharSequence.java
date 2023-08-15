package Stepik;

public class AsciiCharSequence implements CharSequence{
    private int[] bytes;

    public AsciiCharSequence(int[] bytes) {
        this.bytes = bytes;
    }

    @Override
    public char charAt(int arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'charAt'");
    }

    @Override
    public int length() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'length'");
    }

    @Override
    public CharSequence subSequence(int arg0, int arg1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'subSequence'");
    }

    @Override
    public String toString() {
        return "AsciiCharSequence []";
    }
    
}
