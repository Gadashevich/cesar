import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cesar {
    private static int key;
    private static String string;

    private static void textStart() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите текст для шифрования:");
            string = reader.readLine();
            System.out.println("Введите ключ");
            key = Integer.parseInt(reader.readLine());
        } catch (IOException e) {

        }

    }

    public static void cesarCrypt()  {
        System.out.println("Шифрование текста");

        textStart();
        System.out.println(crypt(string, key));

        System.out.println();
        System.out.println("Шифрование завершено, спасибо что воспользовались нашей программой");
        System.out.println();

    }

    public static void cesarDecrypt()  {
        System.out.println("Расшифрование текста");

        System.out.println();textStart();
        System.out.println(crypt(string, -key));

        System.out.println();
        System.out.println("Расшифрование завершено, спасибо что воспользовались нашей программой");
        System.out.println();
        Main.menu();
    }

    public static String crypt(String text, int key) {
        final String ALPHABET = " /,;:?!@#$%^&*()-_+=абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder stringBuilder = new StringBuilder();
        for (char aChar : text.toCharArray()) {
            int indexALPHABET = ALPHABET.indexOf(aChar);
            if (indexALPHABET >= 0) {
                int newIndex = (indexALPHABET + key) % ALPHABET.length();
                char charAt = newIndex < 0 ? ALPHABET.charAt(ALPHABET.length() + newIndex) : ALPHABET.charAt(newIndex);
                stringBuilder.append(charAt);
            }
        }
        return stringBuilder.toString();
    }

}