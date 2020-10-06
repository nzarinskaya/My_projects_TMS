package hw_07_10_2020;

import java.util.Scanner;

public class BankCardValidator {

    public static void validateBankCardData(String bankCardNumber, String varied, String owner, String validity
            , int CVV) {
        class BankCardData {
            private String bankCardNumber;
            private String varied;
            private String owner;
            private String validity;
            private int CVV;

            public BankCardData(String bankCardNumber, String varied, String owner, String validity, int CVV) {
                this.bankCardNumber = bankCardNumber;
                this.varied = varied;
                this.owner = owner;
                this.validity = validity;
                this.CVV = CVV;
            }

            public BankCardData() {

            }
            public void validateData() {
                if (bankCardNumber.length() == 16 && varied == "Visa" && owner != "" && CVV >= 100) {
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

        /*BankCardValidator.validateBankCardData(bankCardData);

         */
    }
}




