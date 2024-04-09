package simula.compiler;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.PushbackInputStream;
import java.io.UTFDataFormatException;
import java.util.Objects;

public class SAVED_AttrInput {
	ObjectInputStream in;
	
    /**
     * Creates a DataInputStream that uses the specified
     * underlying InputStream.
     *
     * @param  in   the specified input stream
     */
    public SAVED_AttrInput(ObjectInputStream in) {
        this.in = in;
    }

    /**
     * working arrays initialized on demand by readUTF
     */
    private byte bytearr[] = new byte[80];
    private char chararr[] = new char[80];

    /**
     * Reads some number of bytes from the contained input stream and
     * stores them into the buffer array {@code b}. The number of
     * bytes actually read is returned as an integer. This method blocks
     * until input data is available, end of file is detected, or an
     * exception is thrown.
     *
     * <p>If {@code b} is null, a {@code NullPointerException} is
     * thrown. If the length of {@code b} is zero, then no bytes are
     * read and {@code 0} is returned; otherwise, there is an attempt
     * to read at least one byte. If no byte is available because the
     * stream is at end of file, the value {@code -1} is returned;
     * otherwise, at least one byte is read and stored into {@code b}.
     *
     * <p>The first byte read is stored into element {@code b[0]}, the
     * next one into {@code b[1]}, and so on. The number of bytes read
     * is, at most, equal to the length of {@code b}. Let {@code k}
     * be the number of bytes actually read; these bytes will be stored in
     * elements {@code b[0]} through {@code b[k-1]}, leaving
     * elements {@code b[k]} through {@code b[b.length-1]}
     * unaffected.
     *
     * <p>The {@code read(b)} method has the same effect as:
     * <blockquote><pre>
     * read(b, 0, b.length)
     * </pre></blockquote>
     *
     * @param      b   the buffer into which the data is read.
     * @return     the total number of bytes read into the buffer, or
     *             {@code -1} if there is no more data because the end
     *             of the stream has been reached.
     * @throws     IOException if the first byte cannot be read for any reason
     *             other than end of file, the stream has been closed and the underlying
     *             input stream does not support reading after close, or another I/O
     *             error occurs.
     * @see        java.io.FilterInputStream#in
     * @see        java.io.InputStream#read(byte[], int, int)
     */
    public final int read(byte b[]) throws IOException {
        return in.read(b, 0, b.length);
    }

    /**
     * Reads up to {@code len} bytes of data from the contained
     * input stream into an array of bytes.  An attempt is made to read
     * as many as {@code len} bytes, but a smaller number may be read,
     * possibly zero. The number of bytes actually read is returned as an
     * integer.
     *
     * <p> This method blocks until input data is available, end of file is
     * detected, or an exception is thrown.
     *
     * <p> If {@code len} is zero, then no bytes are read and
     * {@code 0} is returned; otherwise, there is an attempt to read at
     * least one byte. If no byte is available because the stream is at end of
     * file, the value {@code -1} is returned; otherwise, at least one
     * byte is read and stored into {@code b}.
     *
     * <p> The first byte read is stored into element {@code b[off]}, the
     * next one into {@code b[off+1]}, and so on. The number of bytes read
     * is, at most, equal to {@code len}. Let <i>k</i> be the number of
     * bytes actually read; these bytes will be stored in elements
     * {@code b[off]} through {@code b[off+}<i>k</i>{@code -1]},
     * leaving elements {@code b[off+}<i>k</i>{@code ]} through
     * {@code b[off+len-1]} unaffected.
     *
     * <p> In every case, elements {@code b[0]} through
     * {@code b[off]} and elements {@code b[off+len]} through
     * {@code b[b.length-1]} are unaffected.
     *
     * @param      b     the buffer into which the data is read.
     * @param      off the start offset in the destination array {@code b}
     * @param      len   the maximum number of bytes read.
     * @return     the total number of bytes read into the buffer, or
     *             {@code -1} if there is no more data because the end
     *             of the stream has been reached.
     * @throws     NullPointerException If {@code b} is {@code null}.
     * @throws     IndexOutOfBoundsException If {@code off} is negative,
     *             {@code len} is negative, or {@code len} is greater than
     *             {@code b.length - off}
     * @throws     IOException if the first byte cannot be read for any reason
     *             other than end of file, the stream has been closed and the underlying
     *             input stream does not support reading after close, or another I/O
     *             error occurs.
     * @see        java.io.FilterInputStream#in
     * @see        java.io.InputStream#read(byte[], int, int)
     */
    public final int read(byte b[], int off, int len) throws IOException {
        return in.read(b, off, len);
    }

    /**
     * See the general contract of the {@code readFully}
     * method of {@code DataInput}.
     * <p>
     * Bytes
     * for this operation are read from the contained
     * input stream.
     *
     * @param   b   the buffer into which the data is read.
     * @throws  NullPointerException if {@code b} is {@code null}.
     * @throws  EOFException  if this input stream reaches the end before
     *          reading all the bytes.
     * @throws  IOException   the stream has been closed and the contained
     *          input stream does not support reading after close, or
     *          another I/O error occurs.
     * @see     java.io.FilterInputStream#in
     */
    public final void readFully(byte b[]) throws IOException {
        readFully(b, 0, b.length);
    }

    /**
     * See the general contract of the {@code readFully}
     * method of {@code DataInput}.
     * <p>
     * Bytes
     * for this operation are read from the contained
     * input stream.
     *
     * @param      b     the buffer into which the data is read.
     * @param      off   the start offset in the data array {@code b}.
     * @param      len   the number of bytes to read.
     * @throws     NullPointerException if {@code b} is {@code null}.
     * @throws     IndexOutOfBoundsException if {@code off} is negative,
     *             {@code len} is negative, or {@code len} is greater than
     *             {@code b.length - off}.
     * @throws     EOFException  if this input stream reaches the end before
     *             reading all the bytes.
     * @throws     IOException   the stream has been closed and the contained
     *             input stream does not support reading after close, or
     *             another I/O error occurs.
     * @see        java.io.FilterInputStream#in
     */
    public final void readFully(byte b[], int off, int len) throws IOException {
        Objects.checkFromIndexSize(off, len, b.length);
        int n = 0;
        while (n < len) {
            int count = in.read(b, off + n, len - n);
            if (count < 0)
                throw new EOFException();
            n += count;
        }
    }

    /**
     * See the general contract of the {@code skipBytes}
     * method of {@code DataInput}.
     * <p>
     * Bytes for this operation are read from the contained
     * input stream.
     *
     * @param      n   the number of bytes to be skipped.
     * @return     the actual number of bytes skipped.
     * @throws     IOException  if the contained input stream does not support
     *             seek, or the stream has been closed and
     *             the contained input stream does not support
     *             reading after close, or another I/O error occurs.
     */
    public final int skipBytes(int n) throws IOException {
        int total = 0;
        int cur = 0;

        while ((total<n) && ((cur = (int) in.skip(n-total)) > 0)) {
            total += cur;
        }

        return total;
    }

    /**
     * See the general contract of the {@code readBoolean}
     * method of {@code DataInput}.
     * <p>
     * Bytes for this operation are read from the contained
     * input stream.
     *
     * @return     the {@code boolean} value read.
     * @throws     EOFException  if this input stream has reached the end.
     * @throws     IOException   the stream has been closed and the contained
     *             input stream does not support reading after close, or
     *             another I/O error occurs.
     * @see        java.io.FilterInputStream#in
     */
    public final boolean readBoolean() throws IOException {
        int ch = in.read();
        if (ch < 0)
            throw new EOFException();
        return (ch != 0);
    }

    /**
     * See the general contract of the {@code readByte}
     * method of {@code DataInput}.
     * <p>
     * Bytes
     * for this operation are read from the contained
     * input stream.
     *
     * @return     the next byte of this input stream as a signed 8-bit
     *             {@code byte}.
     * @throws     EOFException  if this input stream has reached the end.
     * @throws     IOException   the stream has been closed and the contained
     *             input stream does not support reading after close, or
     *             another I/O error occurs.
     * @see        java.io.FilterInputStream#in
     */
    public final byte readByte() throws IOException {
        int ch = in.read();
        if (ch < 0)
            throw new EOFException();
        return (byte)(ch);
    }

    /**
     * See the general contract of the {@code readUnsignedByte}
     * method of {@code DataInput}.
     * <p>
     * Bytes
     * for this operation are read from the contained
     * input stream.
     *
     * @return     the next byte of this input stream, interpreted as an
     *             unsigned 8-bit number.
     * @throws     EOFException  if this input stream has reached the end.
     * @throws     IOException   the stream has been closed and the contained
     *             input stream does not support reading after close, or
     *             another I/O error occurs.
     * @see         java.io.FilterInputStream#in
     */
    public final int readUnsignedByte() throws IOException {
        int ch = in.read();
        if (ch < 0)
            throw new EOFException();
        return ch;
    }

    /**
     * See the general contract of the {@code readShort}
     * method of {@code DataInput}.
     * <p>
     * Bytes
     * for this operation are read from the contained
     * input stream.
     *
     * @return     the next two bytes of this input stream, interpreted as a
     *             signed 16-bit number.
     * @throws     EOFException  if this input stream reaches the end before
     *               reading two bytes.
     * @throws     IOException   the stream has been closed and the contained
     *             input stream does not support reading after close, or
     *             another I/O error occurs.
     * @see        java.io.FilterInputStream#in
     */
    public final short readShort() throws IOException {
        int ch1 = in.read();
        int ch2 = in.read();
        if ((ch1 | ch2) < 0)
            throw new EOFException();
        return (short)((ch1 << 8) + (ch2 << 0));
    }

    /**
     * See the general contract of the {@code readUnsignedShort}
     * method of {@code DataInput}.
     * <p>
     * Bytes
     * for this operation are read from the contained
     * input stream.
     *
     * @return     the next two bytes of this input stream, interpreted as an
     *             unsigned 16-bit integer.
     * @throws     EOFException  if this input stream reaches the end before
     *             reading two bytes.
     * @throws     IOException   the stream has been closed and the contained
     *             input stream does not support reading after close, or
     *             another I/O error occurs.
     * @see        java.io.FilterInputStream#in
     */
    public final int readUnsignedShort() throws IOException {
        int ch1 = in.read();
        int ch2 = in.read();
        if ((ch1 | ch2) < 0)
            throw new EOFException();
        return (ch1 << 8) + (ch2 << 0);
    }

    /**
     * See the general contract of the {@code readChar}
     * method of {@code DataInput}.
     * <p>
     * Bytes
     * for this operation are read from the contained
     * input stream.
     *
     * @return     the next two bytes of this input stream, interpreted as a
     *             {@code char}.
     * @throws     EOFException  if this input stream reaches the end before
     *               reading two bytes.
     * @throws     IOException   the stream has been closed and the contained
     *             input stream does not support reading after close, or
     *             another I/O error occurs.
     * @see        java.io.FilterInputStream#in
     */
    public final char readChar() throws IOException {
        int ch1 = in.read();
        int ch2 = in.read();
        if ((ch1 | ch2) < 0)
            throw new EOFException();
        return (char)((ch1 << 8) + (ch2 << 0));
    }

    /**
     * See the general contract of the {@code readInt}
     * method of {@code DataInput}.
     * <p>
     * Bytes
     * for this operation are read from the contained
     * input stream.
     *
     * @return     the next four bytes of this input stream, interpreted as an
     *             {@code int}.
     * @throws     EOFException  if this input stream reaches the end before
     *               reading four bytes.
     * @throws     IOException   the stream has been closed and the contained
     *             input stream does not support reading after close, or
     *             another I/O error occurs.
     * @see        java.io.FilterInputStream#in
     */
    public final int readInt() throws IOException {
        int ch1 = in.read();
        int ch2 = in.read();
        int ch3 = in.read();
        int ch4 = in.read();
        if ((ch1 | ch2 | ch3 | ch4) < 0)
            throw new EOFException();
        return ((ch1 << 24) + (ch2 << 16) + (ch3 << 8) + (ch4 << 0));
    }

    private byte readBuffer[] = new byte[8];

    /**
     * See the general contract of the {@code readLong}
     * method of {@code DataInput}.
     * <p>
     * Bytes
     * for this operation are read from the contained
     * input stream.
     *
     * @return     the next eight bytes of this input stream, interpreted as a
     *             {@code long}.
     * @throws     EOFException  if this input stream reaches the end before
     *               reading eight bytes.
     * @throws     IOException   the stream has been closed and the contained
     *             input stream does not support reading after close, or
     *             another I/O error occurs.
     * @see        java.io.FilterInputStream#in
     */
    public final long readLong() throws IOException {
        readFully(readBuffer, 0, 8);
        return (((long)readBuffer[0] << 56) +
                ((long)(readBuffer[1] & 255) << 48) +
                ((long)(readBuffer[2] & 255) << 40) +
                ((long)(readBuffer[3] & 255) << 32) +
                ((long)(readBuffer[4] & 255) << 24) +
                ((readBuffer[5] & 255) << 16) +
                ((readBuffer[6] & 255) <<  8) +
                ((readBuffer[7] & 255) <<  0));
    }

    /**
     * See the general contract of the {@code readFloat}
     * method of {@code DataInput}.
     * <p>
     * Bytes
     * for this operation are read from the contained
     * input stream.
     *
     * @return     the next four bytes of this input stream, interpreted as a
     *             {@code float}.
     * @throws     EOFException  if this input stream reaches the end before
     *               reading four bytes.
     * @throws     IOException   the stream has been closed and the contained
     *             input stream does not support reading after close, or
     *             another I/O error occurs.
     * @see        java.io.DataInputStream#readInt()
     * @see        java.lang.Float#intBitsToFloat(int)
     */
    public final float readFloat() throws IOException {
        return Float.intBitsToFloat(readInt());
    }

    /**
     * See the general contract of the {@code readDouble}
     * method of {@code DataInput}.
     * <p>
     * Bytes
     * for this operation are read from the contained
     * input stream.
     *
     * @return     the next eight bytes of this input stream, interpreted as a
     *             {@code double}.
     * @throws     EOFException  if this input stream reaches the end before
     *               reading eight bytes.
     * @throws     IOException   the stream has been closed and the contained
     *             input stream does not support reading after close, or
     *             another I/O error occurs.
     * @see        java.io.DataInputStream#readLong()
     * @see        java.lang.Double#longBitsToDouble(long)
     */
    public final double readDouble() throws IOException {
        return Double.longBitsToDouble(readLong());
    }

    /**
     * See the general contract of the {@code readUTF}
     * method of {@code DataInput}.
     * <p>
     * Bytes
     * for this operation are read from the contained
     * input stream.
     *
     * @return     a Unicode string.
     * @throws     EOFException  if this input stream reaches the end before
     *               reading all the bytes.
     * @throws     IOException   the stream has been closed and the contained
     *             input stream does not support reading after close, or
     *             another I/O error occurs.
     * @throws     UTFDataFormatException if the bytes do not represent a valid
     *             modified UTF-8 encoding of a string.
     * @see        java.io.DataInputStream#readString(java.io.DataInput)
     */
    public final String readString() throws IOException {
        return readString(this);
    }

    /**
     * Reads from the
     * stream {@code in} a representation
     * of a Unicode  character string encoded in
     * <a href="DataInput.html#modified-utf-8">modified UTF-8</a> format;
     * this string of characters is then returned as a {@code String}.
     * The details of the modified UTF-8 representation
     * are  exactly the same as for the {@code readUTF}
     * method of {@code DataInput}.
     *
     * @param      in   a data input stream.
     * @return     a Unicode string.
     * @throws     EOFException            if the input stream reaches the end
     *               before all the bytes.
     * @throws     IOException   the stream has been closed and the contained
     *             input stream does not support reading after close, or
     *             another I/O error occurs.
     * @throws     UTFDataFormatException  if the bytes do not represent a
     *               valid modified UTF-8 encoding of a Unicode string.
     * @see        java.io.DataInputStream#readUnsignedShort()
     */
    public static final String readString(SAVED_AttrInput in) throws IOException {
        int utflen = in.readUnsignedShort();
        byte[] bytearr = null;
        char[] chararr = null;
        if (in instanceof SAVED_AttrInput dis) {
            if (dis.bytearr.length < utflen){
                dis.bytearr = new byte[utflen*2];
                dis.chararr = new char[utflen*2];
            }
            chararr = dis.chararr;
            bytearr = dis.bytearr;
        } else {
            bytearr = new byte[utflen];
            chararr = new char[utflen];
        }

        int c, char2, char3;
        int count = 0;
        int chararr_count=0;

        in.readFully(bytearr, 0, utflen);

        while (count < utflen) {
            c = (int) bytearr[count] & 0xff;
            if (c > 127) break;
            count++;
            chararr[chararr_count++]=(char)c;
        }

        while (count < utflen) {
            c = (int) bytearr[count] & 0xff;
            switch (c >> 4) {
                case 0, 1, 2, 3, 4, 5, 6, 7 -> {
                    /* 0xxxxxxx*/
                    count++;
                    chararr[chararr_count++]=(char)c;
                }
                case 12, 13 -> {
                    /* 110x xxxx   10xx xxxx*/
                    count += 2;
                    if (count > utflen)
                        throw new UTFDataFormatException(
                            "malformed input: partial character at end");
                    char2 = (int) bytearr[count-1];
                    if ((char2 & 0xC0) != 0x80)
                        throw new UTFDataFormatException(
                            "malformed input around byte " + count);
                    chararr[chararr_count++]=(char)(((c & 0x1F) << 6) |
                                                    (char2 & 0x3F));
                }
                case 14 -> {
                    /* 1110 xxxx  10xx xxxx  10xx xxxx */
                    count += 3;
                    if (count > utflen)
                        throw new UTFDataFormatException(
                            "malformed input: partial character at end");
                    char2 = (int) bytearr[count-2];
                    char3 = (int) bytearr[count-1];
                    if (((char2 & 0xC0) != 0x80) || ((char3 & 0xC0) != 0x80))
                        throw new UTFDataFormatException(
                            "malformed input around byte " + (count-1));
                    chararr[chararr_count++]=(char)(((c     & 0x0F) << 12) |
                                                    ((char2 & 0x3F) << 6)  |
                                                    ((char3 & 0x3F) << 0));
                }
                default ->
                    /* 10xx xxxx,  1111 xxxx */
                    throw new UTFDataFormatException(
                        "malformed input around byte " + count);
            }
        }
        // The number of chars produced may be less than utflen
        return new String(chararr, 0, chararr_count);
    }

}
