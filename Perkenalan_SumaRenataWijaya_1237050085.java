public class Perkenalan_SumaRenataWijaya_1237050085 
 {
   public static void main(String args[])
   { 
    System.out.println("====DATA NILAI MAHASISWA====");
    String NAMA = "Suma Renata Wijaya";
    int NIM = 1237050085;
    int Nilai_Tugas =  100;
    int Nilai_UTS = 99;
    int Nilai_UAS = 98;
    
    float Nilai_Akhir = (Nilai_Tugas*30f/100f)+(Nilai_UTS*30f/100f)+(Nilai_UAS*40f/100f);
    System.out.println("NAMA: "+ NAMA);
    System.out.println("NIM: "+ NIM);
    System.out.println("Nilai Tugas: "+ Nilai_Tugas);
    System.out.println("Nilai UTS: "+ Nilai_UTS);
    System.out.println("Nilai UAS: "+ Nilai_UAS);
    System.out.println("Nilai Akhir: "+ Nilai_Akhir);
   }
 }
