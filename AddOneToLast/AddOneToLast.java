package AddOneToLast;

/**
 * Adds one to an integer array that represents a number.
 */

public class AddOneToLast {
    public int[] plusOne(int[] digits) {
        if (digits == null) {
            return null;
        }
        // Walk from the back so we can carry only when a digit overflows.
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = digits[i] + 1;

            if (digits[i] == 10) {
                digits[i] = digits[i] % 10;
                if (i == 0) {
                    int[] newArray = new int[digits.length + 1];
                    System.arraycopy(digits, 0, newArray, 1, digits.length);
                    newArray[0] = 1;
                    digits = newArray;
                }
                continue;
            }
            break;
        }
        return digits;
    }
}
