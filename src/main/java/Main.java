import java.util.Scanner;

public class Main {
// почему при повторном вызове Main.menu(); из пунктов, выходит ошибка 23 строки(сканер)
//почему при шифровании большого файла он режется?
// В классе CesarFile в методе saveFile не работает 27 строка (вызов потока ввода)
    public static void main(String[] args) {
       menu();
    }


    public static void menu() {
        System.out.println("Программа для шифрования/расшифрования текста по методу Цезаря");
        System.out.println();

        System.out.println("Выберите пункт меню");
        System.out.println("1. Шифрование текста через консоль");
        System.out.println("2. Расшифрование текста через консоль");
        System.out.println("3. Шифрование текста через файл");
        System.out.println("4. Расшифрование текста через файл");
        System.out.println("9. Выход");

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
        int number =  scanner.nextInt();

            switch (number) {
                case 1:
                    Cesar.cesarCrypt();
                    flag = false;
                    break;
                case 2:
                    Cesar.cesarDecrypt();
                    flag = false;
                    break;
                case 3:
                    CesarFile.cesarCryptFile();
                    flag = false;
                    break;
                case 4:
                    CesarFile.cesarDecryptFile();
                    flag = false;
                    break;
                case 9:
                    flag = false;
                    break;
                default:
                    break;
            }

        }
    }


}
