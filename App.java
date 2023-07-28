//abstract
abstract class Peminjaman {
    void denda() {
    }

    void pengembalian() {
    }
}

class Perpustakaan extends Peminjaman {
    @Override
    void denda() {

    }

    @Override
    void pengembalian() {
    }
}

// inheritance
// encapsulation
class Parent {
    public int x;

    // overloading
    void print(String tipeAnggota, int Nim) {
        System.out.println("Nama : " + tipeAnggota + "\nNim : " + Nim);
    }

    void println(String tipeAnggota) {
        System.out.print("Nama : " + tipeAnggota);
    }

    void print() {
        System.out.println("kosong");
    }
}

// override
class A extends Parent {
    @Override
    void print() {
        System.out.println("tidak ada");
    }

    void test() {
        print();
        x = 5;
    }
}

class B extends A {
    void test2() {
        print();
    }
}

public class App extends Parent {
    void print2() {
        System.out.println(x);
    }

    public static void main(String[] args) throws Exception {
        Parent parent = new Parent();
        parent.print();
        parent.print("Aldevan", 100);
        parent.println("Mahasiswa");

        A a = new A();
        a.print();

        // Peminjaman peminjaman = new Peminjaman();
    }

}