package adapterDesignPattern;

public class CryptB implements Crypt{

	@Override
	public void encrypt(String text) {
		System.out.println(text + "CryptB encrypted...");
	}

	@Override
	public void decrypt(String text) {
		System.out.println(text + "CryptB decrypted...");
	}

}
