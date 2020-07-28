package copyfiletext;

import java.io.*;

public class CopyFileText {
    public static void main(String[] args) throws IOException {
        InputStream inStream = null;
        OutputStream outStream = null;

        File checkFile = new File( "file1.txt");
        if (!checkFile.exists()) {
            checkFile.createNewFile();

        }
        try {
            inStream = new FileInputStream(new File("file1.txt"));
            outStream = new FileOutputStream("file2.txt");

            int length;
            byte[] buffer = new byte[1024];

            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);
            }
            System.out.println("File is copied successful!");
        } catch (IOException e) {
            System.err.println("File not modifer");;
        } finally {
            inStream.close();
            outStream.close();
        }
    }
}
