package teoria.ficherosJSON;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

public class Ejemplo1 {
    public static void main(String[] args) {
        Gson gson = new Gson();
        try (Reader reader = Files.newBufferedReader(Paths.get("INPUT_FILES/user.json"))) {
            /*Map<?, ?> map = gson.fromJson(reader, Map.class);
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                System.out.println(entry.getKey() + "=" + entry.getValue());
            }*/
            User user = gson.fromJson(reader,User.class);
            System.out.println(user);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
