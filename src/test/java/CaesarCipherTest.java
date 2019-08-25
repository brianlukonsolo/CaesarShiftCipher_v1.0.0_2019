import com.brianlukonsolo.CaesarCipher;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CaesarCipherTest {
    private CaesarCipher caesarCipher;

    @Before
    public void before(){
        caesarCipher = new CaesarCipher();

    }

    @Test
    public void itShouldEncryptAGivenStringWhenProvidedWithAShiftAmount(){
        String encryptedText = caesarCipher.encrypt("abcd", 1);
        String expectedEncryptedText = "bcde";

        assertThat("should encrypt successfully", encryptedText, is(equalTo(expectedEncryptedText)));

    }

    @Test
    public void itShouldDecryptAGivenStringWhenProvidedWithAShiftAmount(){
        String encryptedText = caesarCipher.encrypt("abcd", 1);
        String expectedPlainText = "abcd";
        String decryptedText = caesarCipher.decrypt(encryptedText, 1);

        assertThat("should decrypt successfully", decryptedText, is(equalTo(expectedPlainText)));

    }

    @Test
    public void itShouldNotModifyCharactersThatAreNotLetters(){
        String encryptedText = caesarCipher.encrypt("abcd-abcd", 1);
        String expectedEncryptedText = "bcde-bcde";

        assertThat("should encrypt successfully", encryptedText, is(equalTo(expectedEncryptedText)));

    }

}
