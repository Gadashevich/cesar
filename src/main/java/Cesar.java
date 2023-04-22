
public class Cesar {

    public static String crypt(String text, int key) {
        final String ALPHABET = " /,;:?!@#$%^&*()-_+=абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
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