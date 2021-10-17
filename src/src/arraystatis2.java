public class arraystatis2 {
    public static void main(String[] args) {
        //mendeklarasikan tipe data array
        int [] month;
        //menentukan jumlah elemen array(identik dengan array statis)
        month = new int[12];
        //menisi nilai dari setiap elemen array
        month[0] = 31;
        month[1] = 28;
        month[2] = 31;
        month[3] = 30;
        month[4] = 31;
        month[5] = 30;
        month[6] = 31;
        month[7] = 31;
        month[8] = 30;
        month[9] = 31;
        month[10]= 30;
        month[11]= 31;
        //menampilkan output
        for (int i = 0; i < month.length; i++){
            System.out.println("Bulan " + (i + 1) + " memiliki " + month[i] + " hari." );
        }
    }
}
