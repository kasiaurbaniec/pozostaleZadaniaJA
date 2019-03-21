package zad_3_2;

public class VatiableScopes {

    int var = 10;
    public VatiableScopes(int var) {
        this.var = var;
    }
    public void method() {
        int localVar = 20;
        System.out.println(localVar);
        {
            int blockVar = 30;
            localVar = blockVar;
            System.out.println("wewnatrz");
            System.out.println(localVar);
            System.out.println(blockVar);
        }
        System.out.println("na zewnatrz");
        System.out.println(localVar);
//        System.out.println(blockVar);
        localVar=10; /* blad kompilacji - zmienna niedostepna */
    }


}
