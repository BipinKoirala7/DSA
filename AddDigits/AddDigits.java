package AddDigits;

/**
 * Repeatedly adds the digits of a number until a single digit remains.
 */
public class AddDigits {
  public int addDigits(int num) {
    int sum = 0;
    // Keep collecting digit sums until the value collapses to one digit.
    while (num > 0) {
      int remainder = num % 10;
      sum = sum + remainder;
      num = num / 10;
      if (num == 0) {
        if (sum < 10)
          break;
        num = sum;
        sum = 0;
      }
    }
    return sum;
  }

  public int addDigits1(int num) {
    if (num < 10)
      return num;
    int sum = 0;
    // Reuse the partial sum as the next number whenever it still has multiple
    // digits.
    while (num >= 10) {
      int remainder = num % 10;
      sum = sum + remainder;
      num = num / 10;
      if (num < 10) {
        sum += num;
        num = sum;
        if (num < 10)
          continue;
        sum = 0;
      }
    }
    return sum;
  }
}
