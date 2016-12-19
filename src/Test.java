import java.util.Random;

/**
 * Percoliacia
 */
class Test {
    public static Random rand = new Random();
    public int num=50;
    public int[][] array = new int[num][num];
    public int n=1;
    public void gen(){
        int a,b,i=0,number,m;
        m=num;
        number=(int)((Math.pow(num-1,2)/100)*n) ;
        System.out.println(number);
        while(1>0){
            a=rand.nextInt(m);
            b=rand.nextInt(m);
            if(array[a][b]==1||a==0||b==0)
                continue;
            array[a][b]=1;
            i++;
            if(i==number)
                break;
        }

    }
    public void show(){
        for(int i=1;i<num;i++){
            for(int j=1;j<num;j++){
                System.out.format("%02d ",array[i][j]);
            }
            System.out.println();
        }
    }
    public void mark(){

        int klaster =1;
        for (int i = 0; i < num; i++){
            for (int j = 0; j < num; j++){
                if( array[i][j]==0){
                    continue;
                }
                if(array[i][j]==1){
                    if(array[i][j-1]==0 && array[i-1][j]==0) {
                        klaster++;
                        array[i][j] = klaster;
                    }
                    if(array[i][j-1]!=0 && array[i-1][j]==0) {

                        array[i][j] = array[i][j-1];
                    }
                    if(array[i][j-1]==0 && array[i-1][j]!=0) {

                        array[i][j] = array[i-1][j];
                    }
                    if(array[i][j-1]!=0 && array[i-1][j]!=0) {
                        int min = Math.min(array[i][j-1],array[i-1][j]);
                        array[i][j] = min;
                        int max = Math.max(array[i][j-1],array[i-1][j]);
                        for (int z = 0; z < num; z++){
                            for (int f = 0; f < num; f++){
                                if( array[z][f]==0 || array[z][f]==1){
                                    continue;
                                }
                                if(array[z][f]==max){
                                    array[z][f]=min;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    public void found(){
        for (int z = 0; z < num; z++) {
            for (int f = 0; f < num; f++) {
                if(array[1][z]==0||array[num-1][f]==0)
                    continue;
                if(array[1][z]==array[num-1][f]){
                    int one=0;
                    for (int i = 0; i < num; i++) {
                        for (int j = 0; j < num; j++) {
                            if(array[i][j]==array[1][z])
                                one++;
                        }
                    }
                    System.out.println( "Perkolyacia: " + n +
                            "% \nP=" + (one/(Math.pow(num-1,2))));
                    return;
                }
            }
        }
    }
    public void run(){
        gen();
        show();
        System.out.println();
        mark();
        show();
        found();
    }
    public static void main(String[] args) {
        Test m1 =new Test();
        m1.num = 46;
        m1.n  = 65;
        m1.run();

    }

}



