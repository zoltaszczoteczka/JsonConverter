import java.util.LinkedList;
import java.util.List;

public class StringPrinter {
    public List<String> generateInserts(List<Model> models){
        List<String> inserts = new LinkedList<>();
        int size = models.size();
        for (Model model : models) {
            String firstInsert = "INSERT INTO loc(COORDINATE1, COORDINATE2) VALUES ("
                    + model.getLocValue1() + "," + model.getLocValue2() + ");";
            String secondInsert = "INSERT INTO state(name) VALUES (" + model.getState() + ");";
            String thirdInsert = "INSERT INTO city(name, pop, loc_id, state_id) VALUES (" + model.getCity()
                    + "," + model.getPop() + "," + model.getX() + "," + model.getY() + ");";
            inserts.add(firstInsert);
            inserts.add(thirdInsert);
            inserts.add(secondInsert);
        }
        return inserts;
    }
}
