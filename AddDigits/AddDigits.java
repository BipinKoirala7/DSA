package AddDigits;

public class AddDigits {
  public int addDigits(int num) {
    int sum = 0;
    while(num > 0){
      int remainder = num % 10;
      sum = sum + remainder;
      num = num / 10;
      if(num == 0) {
        if(sum < 10) break;
        num = sum;
        sum = 0;
      }
    }
    return sum;
  }

  public int addDigits1(int num) {
    if(num < 10) return num;
    int sum = 0;
    while(num >= 10){
      int remainder = num % 10;
      sum = sum + remainder;
      num = num / 10;
      if(num < 10) {
        sum += num;
        num = sum;
        if(num < 10) continue;
        sum = 0;
      }
    }
    return sum;
  }
}
