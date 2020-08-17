import java.io.*;

public class TestCopyFileText {
    public static void main(String[] args) throws IOException {
        String line = "";
        File file = new File("src\\CoppyFileText.txt");
        InputStream inputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        File file1 = new File("src\\PageFileText.txt");
        FileOutputStream outputStream = new FileOutputStream(file1);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);


        while ((line = bufferedReader.readLine()) != null){

            outputStreamWriter.write(line + "\n");

        }
        bufferedReader.close();
        outputStreamWriter.close();
    }
}
