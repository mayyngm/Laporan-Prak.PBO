package jobsheet2;
class TestLingkaran1841720003{
    public static void main(String[] args){
        Lingkaran1841720003Mayang o1 = new Lingkaran1841720003Mayang();
        o1.phiMayang = 3.14;
        o1.rMayang = 5;
        double luasMayang = o1.hitungLuasMayang();
        double kellMayang = o1.hitungKelilingMayang();
        System.out.println("Luas: "+luasMayang);
        System.out.println("keliling: "+kellMayang);
    }
}