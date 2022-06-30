package Assignments;

public class EvenArrayAssignment5 {
    public static int main(String[] args) {

        int[] arr = new int[]{3,2,8,1,4,7};
        int count = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i]%2==0){
                count=count+i;
            }

        }
        return count;


    }
}
