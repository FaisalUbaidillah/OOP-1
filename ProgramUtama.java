package jam;
public class ProgramUtama {

   public static void main(String[] args){
       Jam waktu = new Jam();
    Jam waktu1 = new Jam(5,1,59);
    System.out.println(waktu1.convertJamtoMenit(1));
    System.out.println(waktu.convertJamtoDetik(1));
   }
}
