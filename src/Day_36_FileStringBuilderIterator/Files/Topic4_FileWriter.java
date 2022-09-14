package Day_36_FileStringBuilderIterator.Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Topic4_FileWriter {
    public static void main(String[] args) throws IOException {

        /*

- Java FileWriter and FileReader classes are used to write and read data from text files
- FileWriter is meant for writing streams of characters.
- FileWriter creates the output file if it is not present already.
- FileWriter(File file) -- > will write to created or exiting class
- FileWriter (String fileName)

Methods:
write (int c) -- it takes integer as ASCII code and write corresponding character
write(char c) - write single character
write(String s) - Writes the whole string,
flush() -- Flushes the Stream
close() -- Flushes the stream first and then close it.
System.getProperty( "line.separator" )

         */

        File tx = new File("FileofTest.txt");
        //tx.createNewFile();
        FileWriter writer = new FileWriter(tx);
        writer.write("This is my first Line of String");
        writer.write(90);
        writer.write(' ');
        writer.write('R');
        writer.write(System.getProperty("line.separator"));
        writer.write("This is the second line");
        writer.close();

    }
}
