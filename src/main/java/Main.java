import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Программа для шифрования/расшифрования текста по методу Цезаря");

        while (true) {
            System.out.println();
            System.out.println("Выберите пункт меню");
            System.out.println("1. Шифрование текста через консоль");
            System.out.println("2. Расшифрование текста через консоль");
            System.out.println("3. Шифрование текста через файл");
            System.out.println("4. Расшифрование текста через файл");
            System.out.println("9. Выход");

            switch (scanner.nextLine()) {

                case "1":
                    CesarEncryptText.encryptedText();
                    break;
                case "2":
                    CesarDecryptText.decryptedText();
                    break;
                case "3":
                    CesarEncryptFile.cesarCryptFile();
                    break;
                case "4":
                    CesarDecryptFile.cesarDecryptFile();
                    return;
                case "9":
                    break;
                default:
                    return;
            }
        }

    }


}
