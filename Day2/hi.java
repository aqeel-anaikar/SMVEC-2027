public class hi {
    public static void main(String[] args) {
        int[] arr = {4,2,3,4};
        int i = 0, j = arr.length-1;
        int count = 0;
        while (i<j) {
            if (arr[i]<arr[j]){
                arr[i+1] = arr[i]+arr[i+1];i++;
                count++;
            }
            else if(arr[j]<arr[i]){
                arr[j-1] = arr[j]+arr[j-1];j--;
                count++;
            }else{
                i++;j--;
            }
        }System.out.println(count);
    }
}
