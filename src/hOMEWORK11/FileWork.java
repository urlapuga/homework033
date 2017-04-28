package hOMEWORK11;

import java.io.Closeable;
import java.io.File;

/**
 * Created by Андрей on 28.04.2017.
 */

public class FileWork implements Closeable {

   static void run(File file) {
        throw new RuntimeException("Hi-hi-hi!");
    }

    @Override
    public void close() {
    }
}