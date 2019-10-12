package overloadingride;
public class Segitiga1841720003Mayang {
       public int sudut;
    
    public int totalSudutMayang(int sudutA){
        System.out.println("Total Sudut : "+(sudut = 180-sudutA));
        return sudut;
    }
    
    public int totalSudutMayang(int sudutA, int sudutB){
        System.out.println("Total Sudut : "+(sudut = 180-(sudutA-sudutB)));
        return sudut;
    }
    
    public int kelilingMayang(int sisiA, int sisiB, int sisiC){
        int keliling;
        System.out.println("Keliling : "+(keliling = sisiA + sisiB + sisiC));
        return keliling;
    }
    
    public double kelilingMayang(int sisiA, int sisiB){
        double c;
        System.out.println("Keliling : "+(c = Math.sqrt(sisiA*sisiA)+ Math.sqrt(sisiB*sisiB)));
        return c;
    }
}