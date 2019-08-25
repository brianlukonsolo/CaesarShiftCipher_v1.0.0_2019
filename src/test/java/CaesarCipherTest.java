import com.brianlukonsolo.CaesarCipher;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CaesarCipherTest {
    private CaesarCipher caesarCipher;

    @Before
    public void before(){
        caesarCipher = new CaesarCipher();

    }

    @Test
    public void itShouldHaveAMethodToEncryptAString(){
        String encryptedDate = caesarCipher.encrypt("", 2);

    }

    @Test
    public void itShouldHaveAMethodToDecryptAnEncryptedStringUsingASpecifiedInteger(){
        String decryptedString = caesarCipher.decrypt("", 2);

    }

    @Test
    public void itShouldEncryptAGivenStringWhenProvidedWithAShiftAmount(){
        String encryptedText = caesarCipher.encrypt("abcd", 1);
        System.out.println("Enc txt: " + encryptedText);
        String expectedEncryptedText = "bcde";

        assertThat("should encrypt successfully", encryptedText, is(equalTo(expectedEncryptedText)));

    }

    @Test
    public void itShouldDecryptAGivenStringWhenProvidedWithAShiftAmount(){
        String encryptedText = caesarCipher.encrypt("abcd", 1);
        System.out.println("Enc txt: " + encryptedText);
        String expectedPlainText = "abcd";
        String decryptedText = caesarCipher.decrypt(encryptedText, 1);

        assertThat("should decrypt successfully", decryptedText, is(equalTo(expectedPlainText)));

    }

}
