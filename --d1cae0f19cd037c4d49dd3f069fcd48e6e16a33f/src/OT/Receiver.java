package OT;

import java.math.*;
import java.io.*;

public abstract class Receiver {
    protected BigInteger choices;
    protected int numOfChoices;
    protected ObjectInputStream ois;
    protected ObjectOutputStream oos;
    protected BigInteger[][] msgPairs;

    protected BigInteger[] data = null;

    public Receiver(int numOfChoices, ObjectInputStream in, ObjectOutputStream out) {
        this.numOfChoices = numOfChoices;
        ois = in;
        oos = out;
    }

    public void execProtocol(BigInteger choices) throws Exception {
        this.choices = choices;
    }

    public void openOT() throws Exception {

    };

    public BigInteger[] getData() {
        return data;
    }
}
