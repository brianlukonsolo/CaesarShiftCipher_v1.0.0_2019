import com.brianlukonsolo.CaesarCipher;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        show("============================================================================");
        show("----------------------------------------------------------------------------");
        show("                                                                     .d     ");
        show("        C A E S A R    S H I F T    C I P H E R                      00     ");
        show(" .adPPY1a. 01.dPPY1a.   .adPPY1a. 01.dPPY1a. 01       d0 01.dPPY1a. MM00MMM ");
        show("0PP0000000 00       00 01         00          .01   d0.  00       d0  00    ");
        show(".0Y11d00. 00       00  .0Y11d00. 00             Y00.    00.Y11dP0.   0Y000  ");
        show("                                                d0.     00                  ");
        show("                                               d0.      00                  ");
        show("[01010101010101010101010101010101010101010101010101010101010101010101010101]");
        show("[                                                                          ]");
        show("[                               [ Version 1.0 ]                            ]");
        show("[                          [ Completed: 25/08/2019 ]                       ]");
        show("[                         [ Author: Brian Lukonsolo ]                      ]");
        show("[                                                                          ]");
        show("[01010101010101010101010101010101010101010101010101010101010101010101010101]\n");
        show(">> Welcome to Brian Lukonsolo's implementation of the Caesar Shift Cipher <<\n");
        show(" ");
        show(" ");

        CaesarCipher caesarCipher = new CaesarCipher();

        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {
                show(">>> Please select a mode: ");
                show("     -> Press [1] then Enter for - Encryption mode");
                show("     -> Press [2] then Enter for - Decryption mode");
                show("    Press Enter or type exit to quit ...");
                String selectedOption = scanner.nextLine();
                if (!selectedOption.equals("1") && !selectedOption.equals("2")){
                    show("Process complete. Exiting program ...");
                    break;
                }

                show(">>> Press Enter or type exit to quit ...");
                show(">>> Please type the message/text then press Enter ...");
                String message = scanner.nextLine();
                if (message.toLowerCase().equals("q") || message.toLowerCase().equals("exit") || message.toLowerCase().equals("")){
                    show("Process complete. Exiting program ...");
                    break;
                }
                show(">>> Please type the shift amount in integer form then press Enter ...");
                int shiftAmount = Integer.parseInt(scanner.nextLine());

                if (selectedOption.equals("2")){
                    show(">>> Encrypting message...");
                    String encryptedText = caesarCipher.encrypt(message, shiftAmount);
                    show("Encryption complete.\n");
                    show(">>> Plain text was: " + message);
                    show(">>> Shift amount was: " + shiftAmount);
                    show(">>> Encrypted text is: " + encryptedText + "\n");
                }else{
                    show(">>> Decrypting message...");
                    String decryptedText = caesarCipher.decrypt(message, shiftAmount);
                    show("Decryption complete.\n");
                    show(">>> Decrypted text was: " + message);
                    show(">>> Shift amount was: " + shiftAmount);
                    show(">>> Decrypted text is: " + decryptedText + "\n");
                }

                show("[01010101010101010101010101010101010101010101010101010101010101010101010101]\n");
            }
        } catch(Exception e) {
            show("Error: " + e.getMessage());
        }

    }

    private static void show(String displayMessage){
        System.out.println(displayMessage);

    }

}
