import com.brianlukonsolo.CaesarCipher;
import org.junit.Before;
import org.junit.Test;

public class CaesarCipherTests {
    private CaesarCipher caesarCipher;

    @Before
    public void before(){
        caesarCipher = new CaesarCipher();
    }

    @Test
    public void itShouldHaveAMethodToEncryptAString(){
        String encryptedDate = caesarCipher.encrypt("");
    }

    @Test
    public void itShouldHaveAMethodToDecryptAnEncryptedStringUsingASpecifiedInteger(){
        String decryptedString = caesarCipher.decrypt("", 2);
    }

}
