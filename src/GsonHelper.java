import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;

/**
 * Helper class for reading and writing JSON using Gson library.
 */
public class GsonHelper {

    /**
     * Main method.
     */
    public static void main(String args[]) {

        GsonHelper tester = new GsonHelper();

    }

    /**
     * Writes a HashMap to a JSON file using Gson.
     *
     * @param quiztakerslist The HashMap to write to JSON
     * @throws IOException If there is an error writing the file
     */
    public void writeJSON(HashMap<String, Double> quiztakerslist) throws IOException {

        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();

        FileWriter writer = new FileWriter("usersscore.json");
        writer.write(gson.toJson(quiztakerslist));
        writer.close();
    }

    /**
     * Reads a HashMap from a JSON file using Gson.
     *
     * @return The HashMap read from the JSON file
     * @throws FileNotFoundException If the file is not found
     */
    public HashMap<String, Double> readJSON() throws FileNotFoundException {

        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();

        HashMap<String, Double> scoresFromFile;

        try (FileReader reader = new FileReader("usersscore.json")) {

            Type mapType = new TypeToken<HashMap<String, Double>>() {}.getType();
            scoresFromFile = gson.fromJson(reader, mapType);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        boolean b = scoresFromFile == null;
        if (b == true) {
            scoresFromFile = new HashMap<>();
        }

        return scoresFromFile;
    }
}
