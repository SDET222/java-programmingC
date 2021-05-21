package repl_it.custom_classes;

public class Db {

    private String data;
    private int yint;


    public void setData(String data) {
        this.data=data;

    }
    public void setYint(int yint) {
        this.yint=yint;

    }
    public String getData(){
        return data;
    }

    public int getYint(){
        return yint;
    }

    @Override
    public String toString() {
        return "Db{" +
                "data='" + data + '\'' +
                ", yint=" + yint +
                '}';
    }
}
