public class CesarDecryptText {

    public static void decryptedText() {
        System.out.println("Расшифрование текста");
        System.out.println();

        CesarHelper.textStart();
        System.out.println(Cesar.crypt(CesarHelper.string, -CesarHelper.key));

        System.out.println();
        System.out.println("Расшифрование завершено, спасибо что воспользовались нашей программой");
        System.out.println();

    }
}
