package Stepik;

public class AsciiCharSequence implements CharSequence {
    private byte[] bytes;

    public AsciiCharSequence(byte[] bytes) {
        this.bytes = bytes;
    }

    @Override
    public char charAt(int index) {
        return (char) bytes[index];
    }

    @Override
    public int length() {
        return bytes.length;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        byte[] subBytes = Arrays.copyOfRange(bytes, start, end);
        return new AsciiCharSequence(subBytes);
    }

    @Override
    public String toString() {
        return new String(bytes);
    }
    
}
