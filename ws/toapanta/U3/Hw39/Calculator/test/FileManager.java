
import com.google.gson.JsonObject;

/**
 *
 * @author David Toapanta, Pacstore, DCCO-ESPE
 */
public class FileManager {
    
    JsonObject testCase = new JsonObject();

  public static boolean add(JsonObject testCase) {
    int num1 = testCase.get("num1").getAsInt();
    int num2 = testCase.get("num2").getAsInt();
    int expectedOutput = testCase.get("expectedOutput").getAsInt();
    
    int actualOutput = num1 + num2;
    
    return actualOutput == expectedOutput;
  }
}
