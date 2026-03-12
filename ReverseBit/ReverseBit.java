package ReverseBit;

public class ReverseBit {
  public int reverseBits(int n) {
    StringBuilder sb = new StringBuilder();
    String binaryString = getBinaryString(n);
    System.out.println("Binary String: " + binaryString);

    for(int i = 0; i < binaryString.length(); i++ ){
      sb.insert(0, binaryString.charAt(i));
    }
    return Integer.parseInt(sb.toString(), 2);
  }

  private String getBinaryString(int n){
    StringBuilder sb = new StringBuilder();
    int j = n;
    for(int i = 0; i < 32; i++){
      sb.insert(0, j % 2);
      j = j / 2;
    }
    return sb.toString();
  }

  //--------- 2nd solution ------------
  public int reverseBits2(int n) {
    StringBuilder sb = new StringBuilder();
    String binaryString = String.format("%32s", Integer.toBinaryString(n)).replace(" ", "0");
    System.out.println("Binary String: " + binaryString);

    for(int i = 0; i < binaryString.length(); i++ ){
      sb.insert(0, binaryString.charAt(i));
    }
    return Integer.parseInt(sb.toString(), 2);
  }
}
