public class Mahasiswa <A, B> {
    A name;
    A alamat;
    B phoneNumber;

    public Mahasiswa(A name, A alamat, B phoneNumber) {
        this.name = name;
        this.alamat = alamat;
        this.phoneNumber = phoneNumber;
    }
    
    public void getInfo() {
        System.out.println("Nama: " + name);
        System.out.println("ALamat: " + alamat);
        System.out.println("Number Telepon: " + phoneNumber);
    }
}
