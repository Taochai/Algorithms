public class TowerOfHanoi {

    public static void main(String[] args) {
        towerOfHanoiMethod(3,"src","des","tmp");
    }

    static void towerOfHanoiMethod(int n,String src, String des, String tmp){
            if(n==1){
                System.out.println("Move disk 1 from "+ src + " to " +des);
                return;
            }
            towerOfHanoiMethod(n-1,src,tmp,des);
            System.out.println("Move disk " + n + "  from "+ src + " to " +des);
            towerOfHanoiMethod(n-1,tmp,des,src);
    }
}
