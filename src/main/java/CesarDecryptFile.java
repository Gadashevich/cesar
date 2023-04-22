import java.io.*;

public class CesarDecryptFile {

    public static void cesarDecryptFile() {
        System.out.println("Расшифрование файла");
        System.out.println();

        CesarHelper.textStart();

        try (BufferedReader text = new BufferedReader(new FileReader(CesarHelper.string))) {
            StringBuilder builder = new StringBuilder();

            while (text.ready()) {
                String line = text.readLine();
                String strings = Cesar.crypt(line, -CesarHelper.key);
                builder = builder.append(strings + System.lineSeparator());
            }

            CesarHelper.saveFile();

            BufferedWriter writer = new BufferedWriter(new FileWriter(CesarHelper.pathSaveFile.toString()));
            writer.write(builder.toString());

            System.out.println("Расшифрование файла завершено, результат сохранен в папку " + CesarHelper.pathSaveFile.toString());
        } catch (IOException e) {

        }

    }

}
