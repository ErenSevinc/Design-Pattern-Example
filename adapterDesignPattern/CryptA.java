package adapterDesignPattern;

public class CryptA implements Crypt{

	@Override
	public void encrypt(String text) {
		System.out.println(text + "CryptA encrypted...");
	}

	@Override
	public void decrypt(String text) {
		System.out.println(text + "CryptA decrypted...");
	}

}
