import java.util.*;
public class MiddleAge {
    public static void main(String[] args){
        Scanner find = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int a = find.nextInt();
        int[] arr = new int[a];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<a; i++){
            arr[i] = find.nextInt();
            if(arr[i] > 0){
                list.add(arr[i]);
            }
        }
        for(int i=0; i<list.size()-1; i++){
            int minindex = i;
            for(int j=i+1; j<list.size(); j++){
                if(list.get(j) < list.get(minindex)){
                    minindex = j;
                }
            }
            int temp = list.get(i);
            list.set(i, list.get(minindex));
            list.set(minindex, temp);
        }
        int len = list.size();
        if(len==0){
            System.out.println("No Positive elements found.");
        }
        else if(len%2==0){
            int mid1 = list.get(len/2-1);
            int mid2 = list.get(len/2);
            System.out.println(+((mid1+mid2)/2));
        }
        else{
            System.out.println(+list.get(len/2));
        }

    }
}