package LinearSearch;

public class min {
    public static void main(String[] args) {
        int [] arr={3,4,5,6,77,8,9,0};
        System.out.println(mini(arr));
    }
    static int mini(int[] arr){
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;

    }
    
}
