package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {

        for (int x = 0; x < height; x++) {
            if(x<height/2){
                for (int y = 0; y < height; y++) {

                    if((x==0||x==height-1||(y>=x))){

                        if(height-x<=y){
                            System.out.print(" ");
                            continue;
                        }
                        System.out.print(8);}
                                else{
                        System.out.print(" ");
                    }
                }
            }
            else{
                for (int y = 0; y < height; y++) {

                    if((x==0||x==height-1||(y<x+1))){

                        if(height-x>y+1){
                            System.out.print(" ");
                            continue;
                        }
                        System.out.print(8);}
                    else{
                        System.out.print(" ");
                    }
                }
            }
        System.out.println();
    }

    }
}
