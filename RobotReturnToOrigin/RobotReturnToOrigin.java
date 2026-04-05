package RobotReturnToOrigin;

import java.util.HashMap;

public class RobotReturnToOrigin {
  public boolean judgeCircle(String moves) {
    int Up = 0;
    int sideways = 0;
    char[] movesCharArray = moves.toCharArray();
    for (char c : movesCharArray) {
      switch (String.valueOf(c)) {
        case "U" -> Up++;
        case "L" -> sideways++;
        case "R" -> sideways--;
        default -> Up--;
      }
    }
    return Up == 0 && sideways == 0;
  }

  public boolean judgeCircle1(String moves) {
    int[] coordinates = new int[]{0, 0};
    char[] movesCharArray = moves.toCharArray();
    for (char c : movesCharArray) {
      switch (String.valueOf(c)) {
        case "U" -> coordinates[0] = coordinates[0] + 1;
        case "L" -> coordinates[1] = coordinates[1] + 1;
        case "R" -> coordinates[1] = coordinates[1] - 1;
        default -> coordinates[0] = coordinates[0] - 1;
      }
    }
    return coordinates[0] == 0 && coordinates[1] == 0;
  }

  public boolean judgeCircle2(String moves) {
    HashMap<String, Integer> directionMap = new HashMap<>();
    directionMap.put("U", 0);
    directionMap.put("D", 0);
    directionMap.put("L", 0);
    directionMap.put("R", 0);

    char[] movesCharArray = moves.toCharArray();
    for (char c : movesCharArray) {
      directionMap.put(String.valueOf(c), directionMap.get(String.valueOf(c)) + 1);
    }
    System.out.println(directionMap);
    return directionMap.get("U").equals(directionMap.get("D")) &&
        directionMap.get("L").equals(directionMap.get("R"));
  }
}
