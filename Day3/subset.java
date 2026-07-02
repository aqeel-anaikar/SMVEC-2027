import java.util.*;

public class subset {
    public static void generate(int[]arr,int i,List<Integer>ans){
        if (i==arr.length) {
            System.out.println(ans);return;
        }
        ans.add(arr[i]);            generate(arr, i+1, ans);
        ans.remove(ans.size()-1);   generate(arr, i+1, ans);
    }

    public static void main(String[] args) {
        int arr[]= {1,2,3};
        int i =0;
        generate(arr,i,new ArrayList<>());
    }
}
