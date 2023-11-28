package school.mjc.stage0.loops.task5;

public class Triangle {

    public void printTriangle(int cathetusLength) {
        for (int x = 1; x < cathetusLength+1; x++) {

            for (int y = 0; y < cathetusLength+1; y++) {
                if(y<x){System.out.print(8);}
                else{
                    //System.out.print("\s");
                }
            }
            System.out.println();
        }

    }
}
