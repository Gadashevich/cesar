import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class CesarHelper {
    static int key;
    static String string;
    static Path pathSaveFile;


    public static void textStart() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите источник для шифрования:");
        string = scanner.nextLine();
        System.out.println("Введите ключ");
        key = Integer.parseInt(scanner.nextLine());

    }

    public static void saveFile() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь для сохранения в файл:");

        pathSaveFile = Path.of(scanner.nextLine());

        if (Files.notExists(pathSaveFile)) {
            Files.createFile(pathSaveFile);
        } else {
            System.out.println("По данному пути уже существует файл, перезаписать?");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("Да")) {
                Files.delete(pathSaveFile);
                Files.createFile(pathSaveFile);
            } else {
                saveFile();
            }
        }


    }
}
