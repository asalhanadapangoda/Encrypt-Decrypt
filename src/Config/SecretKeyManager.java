package Config;

public class SecretKeyManager {
    private int secretKey;

    public SecretKeyManager(int key){
        this.secretKey=key;
    }

    protected int getSecretKey(){
        return this.secretKey;
    }
}
