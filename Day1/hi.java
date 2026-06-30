public class hi {
    static boolean isPrime(int n){
        for(int j=2;j*j<=n;j++){
            if(n%j==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 12;
        int i = n;
        int j = n;
        while (true) {
            if (isPrime(--j)) {
                System.out.println(j);break;
            }else if(isPrime(++i)){
                System.out.println(i);break;
            }
        }
        
        









        // int l=4;
        // int h=30;
        // int count=0;
        // for(int i=l;i<=h-6;i++){
        //     if(isPrime(i)&& isPrime(i+6)){
        //         count++;
        //     }
        // }
        // if(count==0){
        //     System.out.println("no pairs");
        // }
        // else{
        //     System.out.println(count);
        // }

        //     int low = 109,hig = 123,count=0;
        // for(int i=low;i<=hig;i++){
            //     if(isUniuqe(i)) count++;
            // }
            // System.out.println(count);
            
            // public static boolean isUniuqe(int n){
            //     int arr[] = new int[10];
        //     while (n!=0) {
        //         arr[n%10]++;
        //         n/=10;
        //     }
        //     for (int i : arr) {
        //         if (i>1) return false;
        //     }return true;
        // }
        // int arr[] = {1,2,3,4,5};
        // int sum = 0;
        // for (int i : arr) {
        //     sum+=i;
        // }System.out.println(sum);
        // int x = 550;
        // int sum = 0;
        // while (x!=0) {
        //     sum += x%10;
        //     x/=10;            
        // }System.out.println(sum);
    }
}
