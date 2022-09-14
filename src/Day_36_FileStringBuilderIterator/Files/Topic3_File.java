package Day_36_FileStringBuilderIterator.Files;

import java.io.File;
import java.io.IOException;

public class Topic3_File {
    public static void main(String[] args) throws IOException {    // path = locator , location of the file

        /*

The File class is Java’s representation of a file or directory pathname.
File file = new File(String Path)

Paths:
         //Mac OS X: /Users/username/Desktop/foldername..../File
        //Windows: C:/Users/username/Desktop/foldername..../File
        //Linux: /home/username/Desktop/foldername..../File

Methods:

createNewFile() -- Creates a new file on the path
canRead() -- Whether the application can read the file in the path
canWrite() -- Whether the application can write the file in the path
delete() --- > Deletes the file on the path,
exists() -- Test whether the File exists on the path.
length() ---> File size in Bytes

         */

        File file = new File("Test.txt");

       // System.out.println(file.exists());
        file.createNewFile();
        System.out.println(file.exists());
        // canRead()
        System.out.println("Can your application read the file : "+file.canRead());
        System.out.println("Can your application write to the file : "+file.canWrite());
        file.setReadOnly(); // this file read only now
        System.out.println("Can your application write to the file : "+file.canWrite());
        System.out.println("The size of the file : "+file.length());
        // file.deleteOnExit(); // and it deletes the files

    }
}
