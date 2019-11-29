
import java.util.List;

public class JsonConverter {
    public static void main(String[] args) {
        StringPrinter stringPrinter = new StringPrinter();
        JsonReader jsonReader = new JsonReader();
        System.out.println(jsonReader.readFile().toString());
        List<String> inserts = stringPrinter.generateInserts(jsonReader.readFile());
        int size = inserts.size();
        for (int i = 0; i < size; i++) {
            System.out.println(inserts.get(i));
        }
    }
}
