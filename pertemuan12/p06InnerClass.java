package pertemuan12;

class Outer {
    int a = 100;

    public void show() {
        System.out.println("in show");
    }

    class Inner {
        public void display() {
            System.out.println("in display");
            System.out.println("Akses a dari outer: " + a);
        }
    }
}

public class p06InnerClass {
    public static void main(String args[]) {
        Outer obj = new Outer();
        obj.show();

        Outer.Inner obj1 = obj.new Inner();
        obj1.display();
    }
}

/*Nama: Urai Salwa Kirania Nadia
Nim: D1041241074
Tanggal: Jumat, 13 Maret 2026
*/