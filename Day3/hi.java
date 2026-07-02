public class hi {
    static int fobi(int n){
        if(n==1 || n==0){
            return n;
        }
        return fobi(n-1)+fobi(n-2);
    }
    
    public static void main(String[] args) {
        System.out.println(fobi(6));        
    }
}
