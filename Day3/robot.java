public class robot {
    
    public static int move(int cr,int cc,int r,int c){
        if (cr>r || cc>c) return 0;
        if (cc == c && cr == r) return 1;
        return move(cr+1, cc, r, c)+move(cr, cc+1, r, c);
    }
    
    public static void main(String[] args) {
        int m=5,n=5; 
        System.out.println(move(0,0,m-1,n-1));
    }
}
