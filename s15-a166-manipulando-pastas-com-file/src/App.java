import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a folder path:");
        String folderPath = scanner.nextLine();
        File folder = new File(folderPath);

        File[] folders = folder.listFiles(File::isDirectory);
        System.out.println("FOLDERS:");
        for (File f : folders) {
            System.out.println(" - " + f.getName());
        }

        File[] files = folder.listFiles(File::isFile);
        System.out.println("FILES:");
        for (File f : files) {
            System.out.println(" - " + f.getName());
        }

        boolean success = new File(folderPath + "\\subdir").mkdir();
        if (success) {
            System.out.println("Subdirectory created successfully.");
        }
        else {
            System.out.println("Failed to create subdirectory.");
        }


        scanner.close();

    }
}
