package archivos;
import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.*;

public class LeerArchivo {
  public static void main(String[] args) {
    Path path = Paths.get("file.txt");
    try {
      BufferedReader reader = new BufferedReader(path);
      List<String> response = new ArrayList<>();
      while (true) {
        String line = reader.readLine();
        if (line == null) break;
        response.add(line);
      }
    } catch (Exception e) {

    }
  }
}
