import org.json.simple.JSONArray;

public class Model {
    private String _id;
    private String city;
    private JSONArray loc;
    private double locValue1;
    private double locValue2;
    private long pop;
    private String state;
    private int x;
    private int y;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public JSONArray getLoc() {
        return loc;
    }

    public void setLoc(JSONArray loc) {
        this.loc = loc;
    }

    public long getPop() {
        return pop;
    }

    public void setPop(long pop) {
        this.pop = pop;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getLocValue1() {
        return locValue1;
    }

    public void setLocValue1(double locValue1) {
        this.locValue1 = locValue1;
    }

    public double getLocValue2() {
        return locValue2;
    }

    public void setLocValue2(double locValue2) {
        this.locValue2 = locValue2;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Model{" +
                "_id='" + _id + '\'' +
                ", city='" + city + '\'' +
                ", loc=" + loc +
                ", locValue1=" + locValue1 +
                ", locValue2=" + locValue2 +
                ", pop=" + pop +
                ", state='" + state + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
