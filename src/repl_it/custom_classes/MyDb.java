package repl_it.custom_classes;

public class MyDb {
    public static void main(String[] args) {

        Db db = new Db();
        db.setData("abc");
        db.setYint(555);

        System.out.println("db.getData() = " + db.getData());
        System.out.println("db.getYint() = " + db.getYint());

        System.out.println(db);


    }
}
