package facadeDesignPattern;

public class EncryptorFacade {
	AESEncryptor aesEncryptor = new AESEncryptor();
    MD5Encryptor md5Encryptor = new MD5Encryptor();
    SHAEncryptor shaEncryptor = new SHAEncryptor();
    
    public void encrypt(String text, EncryptorType type) {
    	switch (type) {
    	case AES: 
    		aesEncryptor.encrypt(text);
    		break;
    	case MD5:
    		md5Encryptor.encrypt(text, "KEY");
    		break;
    	case SHA:
    		shaEncryptor.encrypt(text, "KEY", true);
    		break;
    	default:
    		throw new IllegalArgumentException(type.toString());
    	}
   }


}
