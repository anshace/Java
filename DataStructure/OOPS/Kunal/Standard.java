
public class Standard {
    public static void main(String[] args) {
        Student ansh = new Student(20329, "Ansh Roshan", 7.1f);
        Student pk = new Student(14018, "Pankaj Kumari");
        System.out.println(pk);
        System.out.println(pk.mark);
        pk = new Student(21029, "Ansh Ace");
        System.out.println(pk);
        System.out.println(pk.mark);
        System.out.println(ansh);
        System.out.println(ansh.name);
        Integer a = 10;
        System.out.println(a);
        a = 8;
        System.out.println(a);
        for (int i = 0; i < 999999; i++) {
            pk = new Student(i, "null");
        }
    }
}

class Student {
    int roll;
    String name;
    float mark;

    Student(int rol, String name) {
        // Constructor call must be the first statement in a constructor
        this(rol, name, 40.0f);
    }

    Student(int rol, String name, float mark) {
        this.roll = rol;
        this.name = name;
        this.mark = mark;
    }

    // @Override
    // protected void finalize() throws Throwable {
    // // TO-DO Auto-generated method stub
    // System.out.println("Object is destoyed");
    // // super.finalize();
    // }

}
