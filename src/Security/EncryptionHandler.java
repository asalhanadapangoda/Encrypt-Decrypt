package Security;

import Config.SecretKeyManager;

public class EncryptionHandler extends SecretKeyManager {

    private  EncryptedDecrypted encryptedDecrypted;

    public EncryptionHandler(int key) {
        super(key);
        this.encryptedDecrypted = new EncryptedDecrypted();
    }

    public String encryptText(String text){
        return encryptedDecrypted.encryptModifier(text,this.getSecretKey());
    }

    public String decryptText(String decryptText){
        return encryptedDecrypted.decryptModifier(decryptText,this.getSecretKey());
    }
}
