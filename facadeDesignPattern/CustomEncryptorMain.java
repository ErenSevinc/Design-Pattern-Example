package facadeDesignPattern;

public class CustomEncryptorMain {
	public static void main(String[] args) {

		String text = "Content";

	    AESEncryptor aesEncryptor = new AESEncryptor();
	    aesEncryptor.encrypt(text);

	    MD5Encryptor md5Encryptor = new MD5Encryptor();
	    md5Encryptor.encrypt(text, "KEY");

	    SHAEncryptor shaEncryptor = new SHAEncryptor();
	    shaEncryptor.encrypt(text, "KEY", true);
	    
	    System.out.println("********************");
	    
	    EncryptorFacade encryptorFacade = new EncryptorFacade();
	    encryptorFacade.encrypt(text, EncryptorType.AES);
	    
	    encryptorFacade.encrypt(text, EncryptorType.MD5);
	    
	    encryptorFacade.encrypt(text, EncryptorType.SHA);
	    
	    
	    

	}
}
