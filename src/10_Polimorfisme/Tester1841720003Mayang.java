package polimorfisme1841720003mayang;

public class Tester1841720003Mayang {
    public static void main(String[] args) {
        WalkingZombie1841720003Mayang wz = new WalkingZombie1841720003Mayang(100,1);
        JumpingZombie1841720003Mayang jz = new JumpingZombie1841720003Mayang(100,2);
        Barrier1841720003Mayang b = new Barrier1841720003Mayang(100);
        Plant1841720003Mayang p = new Plant1841720003Mayang();
        
        System.out.println(""+ wz.getZombieInfoMayang());
        System.out.println(""+ jz.getZombieInfoMayang());
        System.out.println(""+ b.getBarrierInfoMayang());
        System.out.println("-------------------------");
        
        for(int i = 0; i < 4; i++){
            p.doDestroyMayang(wz);
            p.doDestroyMayang(jz);
            p.doDestroyMayang(b);
        }
         
        System.out.println(""+ wz.getZombieInfoMayang());
        System.out.println(""+ jz.getZombieInfoMayang());
        System.out.println(""+ b.getBarrierInfoMayang());
    }
}
