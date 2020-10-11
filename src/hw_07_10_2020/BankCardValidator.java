package hw_07_10_2020;

import java.time.LocalDate;
import java.util.Scanner;


public class BankCardValidator {

    public static void validateBankCardData(String bankCardNumber, String bankCardVaried,
                                            String bankCardOwner, int bankCardCVV, String bankCardPeriod) {
        class BankCardData {
            private String bankCardData;
            private String varied;
            private String owner;
            private int CVV;
            private String period;

            public BankCardData() {
                this.bankCardData = bankCardNumber;
                this.varied = bankCardVaried;
                this.owner = bankCardOwner;
                this.CVV = bankCardCVV;
                this.period = bankCardPeriod;
            }

            public void validateData() {
                if (bankCardNumber.length() == 16 & bankCardVaried.length() != 0 & bankCardOwner.length() != 0 & bankCardCVV >= 100 & bankCardPeriod.length() != 0) {
                    System.out.println("Bank card data is correct");
                } else {
                    System.out.println("Bank card data is incorrect");
                }
            }
        }
        BankCardData bankCardData = new BankCardData();
        bankCardData.validateData();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bankCardData = scanner.nextLine();

        Scanner in = new Scanner(System.in);
        String varied = in.nextLine();

        Scanner scan = new Scanner(System.in);
        String owner = scan.nextLine();

        Scanner s = new Scanner(System.in);
        int CVV = Integer.parseInt(s.nextLine());

        Scanner last = new Scanner(System.in);
        String period = last.nextLine();

        BankCardValidator.validateBankCardData(bankCardData, varied, owner, CVV, period);
    }
}






