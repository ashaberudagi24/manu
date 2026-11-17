import javax.Crypto.Cipher;
import javax.Crypto.Secretkey;
import javax.Crypto.KeyGenerator;

public class DESExample{
  public static void main(String[]args)throws Exception{

String text="HELLO";

KeyGenerator kg=KeyGenerator.getInsatnce("DES");
SecretKey key=kg.generateKey();

Cipher encCipher=Cipher.getInsatnce("DES"_;
encCipher.init(Cipher.ENCRYPT_MODE,key);
byte[]encrypted=enCipher.doFinal(text.getBytes());
System.out.println(Arrays.toString(encrypted));

Cipher decCipher=Cipher.getInstance("DES");
decCipher.init(Cipher.DECRYPT_MODE,key);
byte[]decrypted=decCipher.doFinal(encrypted);

System.out.println("Decrypted Text:"+new String(decrypted));
 }
}