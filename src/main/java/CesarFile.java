import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class CesarFile {
    private static String path;
    private static int key;
    private static Path pathSaveFile ;

    private static void fileStart() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Введите путь до файла:");
            path = reader.readLine();
            System.out.println();
            System.out.println("Введите ключ:");
            key = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
        }

    }

    private static void saveFile() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите путь для сохранения в файл:");

            pathSaveFile = Path.of(reader.readLine());  // почему не работает?

            if (Files.notExists(pathSaveFile)) {
                Files.createFile(pathSaveFile);
            } else {
                System.out.println("По данному пути уже существует файл, перезаписать?");
                String answer = reader.readLine();
                if (answer.equalsIgnoreCase("Да")) {
                    Files.delete(pathSaveFile);
                    Files.createFile(pathSaveFile);
                } else {
                    saveFile();
                }
            }
        } catch (Exception e) {
        }
    }


    public static void cesarCryptFile() {
        System.out.println("Шифрование файла");
        System.out.println();
        fileStart();

        try (BufferedReader text = new BufferedReader(new FileReader(path))) {
            StringBuilder builder = new StringBuilder();
            while (text.ready()) {
                String line = text.readLine();
                String strings = Cesar.crypt(line, key);
                builder = builder.append(strings + System.lineSeparator());
            }
            saveFile();
            BufferedWriter writer = new BufferedWriter(new FileWriter(pathSaveFile.toString()));
            writer.write(builder.toString());

            System.out.println("Шифрование файла завершено, результат сохранен в папку " + pathSaveFile.toString());
        } catch (IOException e) {
        }
        //      Main.menu();

    }


    public static void cesarDecryptFile() {
        System.out.println("Расшифрование файла");
        System.out.println();
        fileStart();

        try (BufferedReader text = new BufferedReader(new FileReader(path))) {
            StringBuilder builder = new StringBuilder();
            while (text.ready()) {
                String line = text.readLine();
                String strings = Cesar.crypt(line, -key);
                builder = builder.append(strings + System.lineSeparator());
            }
            saveFile();
            BufferedWriter writer = new BufferedWriter(new FileWriter(pathSaveFile.toString()));
            writer.write(builder.toString());

            System.out.println("Расшифрование файла завершено, результат сохранен в папку " + pathSaveFile.toString());
        } catch (IOException e) {

        }
        //  Main.menu();
    }

}
