public class arraystatis {
    public static void main (String[] args) {
        String mahasiswa [] = new String [5];
        //menginput elemen pada data mahasiswa
        mahasiswa[0] = "Ahmad Hadrian";
        mahasiswa[1] = "Anggun Tri Utami";
        mahasiswa[2] = "Erni Julita";
        mahasiswa[3] = "Bagas";
        mahasiswa[4] = "Tasya";

        //membuat output
        for (int i = 0; i < mahasiswa.length; i++){
            System.out.println("Urutan Nama Mahasiswa ke-" + (i + 1) + " adalah " + mahasiswa[i] );
        }
    }
}
