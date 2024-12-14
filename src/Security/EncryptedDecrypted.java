package Security;

class EncryptedDecrypted {
    String encryptModifier(String text, int key) {
        StringBuilder encryptedText = new StringBuilder();

        for (char character : text.toCharArray()) {
            if (Character.isLetter(character)) {
                char shiftedChar = (char) ((character + -'A') % 26 + 'A');
                encryptedText.append(shiftedChar);
            } else {
                encryptedText.append(character);
            }
        }
        return encryptedText.toString();
    }

    String decryptModifier(String text, int key) {
        StringBuilder decryptedText = new StringBuilder();
        for (char character : text.toCharArray()) {
            if (Character.isLetter(character)) {
                char shiftedChar = (char) ((character + -'A' + 26) % 26 + 'A');
                decryptedText.append(shiftedChar);
            } else {
                decryptedText.append(character);
            }
        }
        return decryptedText.toString();
    }
}

