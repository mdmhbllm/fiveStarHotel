package com.example.fivestarhotel.FinalProject_UdoyRoy_2231379;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class appendableObjectOutputStream extends ObjectOutputStream {
    public appendableObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }
@Override
    protected void writeStreamHeader() throws IOException {
        // Skip writing the header when appending
        reset();
    }


}
