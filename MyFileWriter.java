
import java.io.*;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;

public class MyFileWriter {
    public static void main(String[] args) throws IOException {
        // createHiddenFile("/Users/skystubbeman/Documents/HTCS_Projects/FileWriterActivity/", ".secretstuff.txt",
        //         "pw: password");

        // createHiddenFolderAndFile("/Users/skystubbeman/Documents/HTCS_Projects/FileWriterActivity/",
        //         ".hiddenFolder.txt",
        //         "secretsecretfile.txt", "this is really hidden!");
        // printFileSize("/Users/skystubbeman/Documents/HTCS_Projects/Activity1/example5.txt");
    }

    public static void createHiddenFile(String path, String name, String content) throws IOException {

        File hiddenFile = new File(path, name);
        FileWriter fw = new FileWriter(hiddenFile);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(content);
        bw.close();
    }

    public static void createHiddenFolderAndFile(String path, String folderName, String fileName, String content)
            throws IOException {
        File hiddenFolder = new File(path, folderName);

        hiddenFolder.mkdirs();

        File file = new File(path + folderName,
                fileName);

        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(content);
        bw.close();
    }

    //printFileSize - prints the length of the contents of the file.
    public static void printFileSize(String filename){
        File file = new File (filename);
        long fileSize = file.length();
        System.out.println("The length of the file is: " + fileSize);
    }
}
//hello!
