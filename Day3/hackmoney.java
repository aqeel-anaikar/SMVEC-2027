public class hackmoney {
    public static boolean hack(int n, int target){
        if (n == target) return true;
        if (n>target) return false;
        else{
            if (hack(n*10, target)) return true;
            if (hack(n*20, target)) return true;
        }return false;
    }
    
    public static void main(String[] args) {
        int ac = 1;
        int N = 9000;
        System.out.println(hack(ac,N)?"Yes":"No");
    }
}
