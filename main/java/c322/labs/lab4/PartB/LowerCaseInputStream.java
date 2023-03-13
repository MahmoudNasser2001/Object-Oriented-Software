package c322.labs.lab4.PartB;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
class partb{
    public static void main(String[] args) {
        class LowerCaseInputStream extends FilterInputStream {
            public LowerCaseInputStream(InputStream in) {
                super(in);
            }
            public int read() throws IOException {
                int x = super.read();
                return (x == -1 ? x : Character.toLowerCase((char) x));
            }
            public int read(byte[] y, int offset, int len) throws IOException {
                int result = super.read(y, offset, len);
                int i = 0;
                for (i = offset; i < offset + result; i++) {
                    y[i] = (byte) Character.toLowerCase((char) y[i]);
                }
                return result;
            }
        }
    }
}
