import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;


public class JsonReader {
    public List<Model> readFile(){
        List<Model> models = new LinkedList<Model>();
        JSONParser jsonParser = new JSONParser();
        try{
            FileReader reader = new FileReader("data");
            Object object = jsonParser.parse(reader);
            JSONArray jsonModels = (JSONArray) object;
            for (int i = 0; i < jsonModels.size(); i++) {
                Object jsonModel = jsonModels.get(i);
                models.add(parseModel((JSONObject) jsonModel, i));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return models;
    }

    private Model parseModel(JSONObject object, int index){
        Model model = new Model();
        model.set_id((String) object.get("_id"));
        model.setCity((String) object.get("city"));
        model.setLoc((JSONArray) object.get("loc"));
        model.setLocValue1((double) model.getLoc().get(0));
        model.setLocValue2((double) model.getLoc().get(1));
        model.setPop((long) object.get("pop"));
        model.setState((String) object.get("state"));
        model.setX(index);
        model.setY(index);
        return model;
    }
}
