public class AntrianKRS12 {
    MahasiswaKRS12[] data;
    int front;
    int rear;
    int size;
    int max;
    int totalProsesKRS = 0;
    
    public AntrianKRS12(int max){
        this.max = max;
        this.data = new MahasiswaKRS12[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }
    public boolean isEmpty(){
        if(size == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isFull(){
        if(size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahAntrian(MahasiswaKRS12 mhs){
        if (isFull()){
            System.out.println("Antrian sudah penuh, tidak dapat menambah mahasiswa");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian");
    }

    public void prosesKRS() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2, belum bisa memproses KRS.");
            return;
        }
        System.out.println("Memproses 2 mahasiswa:");
        for (int i = 0; i < 2; i++) {
            MahasiswaKRS12 mhs = data[front];
            mhs.tampilkanData();
            front = (front + 1) % max;
            size--;
            totalProsesKRS++;
        }
    } 
    public void tampilkanSemua(){
        if (isEmpty()){
            System.out.println("Antrian kosong");
            return;
    }
    System.out.println("Daftar Mahasiswa dalam Antrian: ");
    System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++){
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }
    public void lihatTerdepan(){
        if (isEmpty()){
         System.out.println("Antrian kosong");
    }else {
            System.out.println(" 2 Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
            int kedua = (front + 1) % max;
            data[kedua].tampilkanData();
        }
    }
        public void lihatAkhir(){
        if (isEmpty()){
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Mahasiswa paling belakang:");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }

    public void cetakJumlahAntrian(){
        System.out.println("Jumlah mahasiswa dalam antrian: " + size);
    }
    public void cetakTotalProsesKRS(){
        System.out.println("Jumlah mahasiswa yang sudah proses KRS: " + totalProsesKRS);
    }
    public void cetakJumlahBelumDiproses(){
        int belumDiproses = 30 - totalProsesKRS;
        System.out.println("Jumlah mahasiswa yang belum proses KRS: " + belumDiproses);
        
    }
    public void cekAntrianKosong(){
        if (isEmpty()){
            System.out.println("Antrian Kosong");
        } else {
            System.out.println("Antrian tidak kosong");
        }
    }
    public void cekAntrianPenuh(){
        if(isFull()){
            System.out.println("Antrian Penuh");
        }else {
            System.out.println("Antrian tidak penuh");
        }
    }
    public void clear(){
        if(!isEmpty()){
            front = rear = -1;
            size=0;
            System.out.println("Antrian berhasil dikosongkan");
        }
    }
}