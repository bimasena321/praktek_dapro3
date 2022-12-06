import java.util.Scanner;
public class praktek_daspro3 {
    public void Lu_persegi(int a,int b){
        int hasil = a * b;
        System.out.printf("\nLuas persegi panjang: %d",hasil);         
    }
    public void kel_persegi(int a,int b,int c){
        int hasil = a * b * c;
        System.out.printf("\nKeliling persegi panjang: %d",hasil);
    }
    public void lu_segitiga(int a, int b){
        int hasil = 1 * a * b / 2;
        System.out.printf("\nLuas segitiga: %d",hasil);
    }
    public void kel_segitiga(int a, int b,int c)
    {
        int hasil = a + b + c;
        System.out.printf("\nKeliling segitiga: %d",hasil);
    }
    public void lu_trapesium(int a,int ab,int ac){
        int hasil = 1/2 * a (ab + ac);
        System.out.printf("\nLuas trapesium: %d",hasil);
    }
    public void kel_trapesium(int ab,int bc,int da){
        int hasil = ab + bc + da;
        System.out.printf("\nKeliling trapesium: %d",hasil);
    }
    public void lu_lingkaran(int a){
        int hasil = (int) (Math.PI * Math.pow(a, 2));
        System.out.printf("\nLuas lingkaran: %d",hasil);
    }
    public void kel_lingkaran(int a){
        int hasil = (int) (2 * Math.PI * a);
        System.out.printf("\nKeliling lingkaran: %d",hasil);
    }
    public static void clear(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    private int a(int i) {
        return 0;
    }
    public static void main(String[] args) {
        int panjang,p,lebar,lebar1,panjang1,tinggi,alas,tinggi1,sisia,sisib,sisic,sisiAB,sisiAC,sisiBC,sisiDA,alas1;
        Scanner v = new Scanner(System.in);
        praktek_daspro3 vv = new praktek_daspro3();
        clear();
        System.out.println("[1] persegi panjang"+"\n[2] segitiga siku siku"+"\n[3] trapesium"+"\n[4] lingkaran");
        System.out.print("->");
        p = v.nextInt();
        String b = "y";
        while (b.equals("y")){
            switch (p){
                case 1:
                    System.out.println("==============<Luas persegi panjang>============");
                    System.out.print("\npanjang: ");
                    panjang = v.nextInt();
                    System.out.print("\nlebar: ");
                    lebar = v.nextInt();
                    vv.Lu_persegi(panjang, lebar);
                    System.out.println("\n==============<Keliling persegi panjang>============");
                    System.out.print("\npanjang: ");
                    panjang1 = v.nextInt();
                    System.out.print("\nlebar:");
                    lebar1 = v.nextInt();
                    System.out.print("\nTinggi:");
                    tinggi = v.nextInt();
                    vv.kel_persegi(panjang1, lebar1, tinggi);
                    break;
                case 2:
                    System.out.println("==============<Luas segitiga siku siku>============");
                    System.out.print("\nalas: ");
                    alas = v.nextInt();
                    System.out.print("\ntinggi: ");
                    tinggi = v.nextInt();
                    vv.lu_segitiga(alas, tinggi);
                    System.out.println("\n==============<Keliling segitiga siku siku>============");
                    System.out.print("\nsisi a: ");
                    sisia = v.nextInt();
                    System.out.print("\nsisi b: ");
                    sisib = v.nextInt();
                    System.out.print("\nsisi c: ");
                    sisic = v.nextInt();
                    vv.kel_segitiga(sisia, sisib, sisic);
                    break;
                case 3:
                    System.out.println("==============<Luas trapesium>============");               
                    System.out.print("\nsisi AB: ");
                    sisiAB = v.nextInt();
                    System.out.print("\nsisi AC: ");
                    sisiAC = v.nextInt();
                    System.out.print("\ntinggi: ");
                    tinggi1 = v.nextInt();
                    vv.lu_trapesium(tinggi1,sisiAB, sisiAC);
                    System.out.println("\n==============<Keliling trapesium>============");
                    System.out.print("\nsisi AB:");
                    sisiAB = v.nextInt();
                    System.out.print("\nsisi BC: ");
                    sisiBC = v.nextInt();
                    System.out.print("\nsisi DA: ");
                    sisiDA = v.nextInt();
                    vv.kel_trapesium(sisiAB, sisiBC, sisiDA);
                    break; 
                case 4: 
                    System.out.println("==============<Luas lingkaran>============");
                    System.out.print("\njari-jari: ");
                    alas = v.nextInt();
                    vv.lu_lingkaran(alas);
                    System.out.println("\n==============<Keliling lingkaran>============");          
                    System.out.print("\njari-jari");
                    alas = v.nextInt();  
                    vv.kel_lingkaran(alas);   
                    break;
            
                }
            System.out.print("\ningi mengulang program? [y/n]: ");
            b = v.next();
            clear();
            System.out.print("\nprogram ditutup");
            }  
        }
    }














