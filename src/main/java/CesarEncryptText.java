
public class CesarEncryptText {


    public  static void encryptedText() {
        System.out.println("Шифрование текста");

        CesarHelper.textStart();

        System.out.print("Ваш зашифрованный текст: ");
        System.out.println(Cesar.crypt(CesarHelper.string, CesarHelper.key));

        System.out.println();
        System.out.println("Шифрование завершено, спасибо что воспользовались нашей программой");
        System.out.println();

    }

}
