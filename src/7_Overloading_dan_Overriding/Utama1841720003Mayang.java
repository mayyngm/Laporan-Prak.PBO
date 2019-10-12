package overloadingride;
public class Utama1841720003Mayang {
    public static void main(String[] args) {
        System.out.println("Program Testing Class Manager & Staff");
        Manager1841720003Mayang man[] = new Manager1841720003Mayang[2];
        Staff1841720003Mayang staff1[] = new Staff1841720003Mayang[2];
        Staff1841720003Mayang staff2[] = new Staff1841720003Mayang[3];
        
        //pembuatan manager
        man[0]=new Manager1841720003Mayang();
        man[0].setmNamaMayang("Tedjo");
        man[0].setmNipMayang("101");
        man[0].setmGolonganMayang("1");
        man[0].setmTunjanganMayang(5000000);
        man[0].setmBagianMayang("Administrasi");
        
        man[1]=new Manager1841720003Mayang();
        man[1].setmNamaMayang("Atika");
        man[1].setmNipMayang("102");
        man[1].setmGolonganMayang("1");
        man[1].setmTunjanganMayang(2500000);
        man[1].setmBagianMayang("Pemasaran");
        
        staff1[0] = new Staff1841720003Mayang();
        staff1[0].setmNamaMayang("Usman");
        staff1[0].setmNipMayang("0003");
        staff1[0].setmGolonganMayang("2");
        staff1[0].setmLemburMayang(10);
        staff1[0].setmGajiLemburMayang(10000);
        
        staff1[1] = new Staff1841720003Mayang();
        staff1[1].setmNamaMayang("Anugrah");
        staff1[1].setmNipMayang("0005");
        staff1[1].setmGolonganMayang("2");
        staff1[1].setmLemburMayang(10);
        staff1[1].setmGajiLemburMayang(55000);
        man[0].setStMayang(staff1);
        
        staff2[0] = new Staff1841720003Mayang();
        staff2[0].setmNamaMayang("Hendra");
        staff2[0].setmNipMayang("0004");
        staff2[0].setmGolonganMayang("3");
        staff2[0].setmLemburMayang(15);
        staff2[0].setmGajiLemburMayang(5500);
        
        staff2[1] = new Staff1841720003Mayang();
        staff2[1].setmNamaMayang("Arie");
        staff2[1].setmNipMayang("0006");
        staff2[1].setmGolonganMayang("4");
        staff2[1].setmLemburMayang(5);
        staff2[1].setmGajiLemburMayang(1000000);
        
        staff2[2] = new Staff1841720003Mayang();
        staff2[2].setmNamaMayang("Mentari");
        staff2[2].setmNipMayang("0007");
        staff2[2].setmGolonganMayang("3");
        staff2[2].setmLemburMayang(6);
        staff2[2].setmGajiLemburMayang(20000);
        man[1].setStMayang(staff2);
        
        //cetak informasi dari manager + staffnya
        man[0].viewStaffMayang();
        man[1].viewStaffMayang();
    }
}