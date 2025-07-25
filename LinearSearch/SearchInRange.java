package LinearSearch;

public class SearchInRange {
    public static void main(String []a){
    int [] arr={2,4,6,7,8,9};
    int target=6;
    System.out.println(LinearSearch(arr,target,1,3));
}
    static int LinearSearch(int[] arr, int target, int start, int end){
        if (arr.length==0){
            return -1;
        }
        for(int index=0;index< arr.length;index++){
            int element=arr[index];
            if(element==target){
                return index;
            }

        }
        return -1;

    }

}