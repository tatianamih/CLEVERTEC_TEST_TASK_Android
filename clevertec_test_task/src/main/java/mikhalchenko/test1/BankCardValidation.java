package mikhalchenko.test1;

/*Задание:
На любом, известном Вам языке программирования,
 реализуйте функцию валидации номера банковской карты.
Другими словами, функция должна проверить, может ли,
переданный в качестве параметра номер, быть номером реальной карты.
Входной параметр: Строка с номером карты
Возвращаемый результат: Значение логического типа
Алгоритм:
1. Цифры проверяемого номера рассматриваются справа налево.
2. Цифры, оказавшиеся на нечётных местах, остаются без изменений.
3. Цифры, стоящие на чётных местах, умножаются на 2.
4. Если в результате такого умножения возникает число больше 9,
 оно заменяется суммой цифр получившегося произведения — однозначным числом, то есть цифрой.
5. Все полученные в результате преобразования цифры складываются.
 Если сумма кратна 10, то номер карты валиден.
 */
public class BankCardValidation {
//function for checking the validity of a real bank card number
    public boolean isValid(String cardNumber) {
        boolean isValid = false;

        String withoutSpaces = "";
        for (int i = 0; i < cardNumber.length(); i++) { // deleting a space
            if (cardNumber.charAt(i) != ' ') {
                withoutSpaces += cardNumber.charAt(i);
            }
        }
        char[] charArray = withoutSpaces.toCharArray();
        int[] arrInt = new int[charArray.length];
        int sum = 0;
        for (int i = charArray.length - 1; i >= 0 && charArray.length == 16; i--) {// charArray.length == 16
            // since the standard card number consists of 16 digits
            if (withoutSpaces.matches("[0-9]+")) {// checking that there are only numbers in the card number
                arrInt[i] = Character.getNumericValue(charArray[i]);
                if (i % 2 == 0) { //the numbers standing in even places are multiplied by 2
                    arrInt[i] *= 2;
                    if (arrInt[i] > 9) {// if the number is greater than 9,
                        // then it is replaced by the sum of the digits of the resulting product
                        arrInt[i] = arrInt[i] / 10 + arrInt[i] % 10;
                    }

                }

                sum += arrInt[i];// all the received figures are added together
                if (sum % 10 == 0) { // checking the received amount for a multiple of 10, checking for validity
                    isValid = true;
                }
            }
        }
        return isValid;
    }

    public static void main(String[] args) {
        BankCardValidation validation = new  BankCardValidation();
        System.out.println(validation.isValid("0000 0000 0001 4381"));

    }
}
