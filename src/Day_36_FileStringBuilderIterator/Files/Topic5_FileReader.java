package Day_36_FileStringBuilderIterator.Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Topic5_FileReader {
    public static void main(String[] args) throws IOException {

        /*
        FileReader:

- FileReader is useful to read data in the form of characters from a ‘text’ file.
- FileReader(File file)
- FileReader(String FileName)

Methods:

-read() reads a single characters
-read(char[ ] c) reads chars to array
-close()  --  closes the Reader
read() = -1 means it is at the end of file
         */

        FileReader reader = new FileReader("FileofTest.txt");
        //System.out.println("the fiest char: "+((char)reader.read()));
        //reader.read();

        int c;
        while((c=reader.read())!=-1){

            System.out.print((char)c);


        }
        BufferedReader breader = new BufferedReader(reader);


        reader.close();

    }

    /*
    BufferedWriter
It extends the FileReader functionality,
Makes more efficient writing.
Methods:

just like the FileWriter and it also has the newLine() where it writes to a new line
BufferedReader:

It reads Text from the Character-input Stream, It is more efficient than FileReader, It extends FileReader functionality,

Methods:
mark() -- it marks the current position of the Stream
reset() -- Reset the Stream to most recent mark()
skip(long l ) -- skips characters
readLine() -- reads line of the file
     */

    }


