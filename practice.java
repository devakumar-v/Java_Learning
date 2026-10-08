import java.util.*;
class practice{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number array elements:");
        int n=scan.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=scan.nextInt();
        for(int j=0;j<n;j++){
            System.out.println(array[i]);
        }}
        System.out.println();
    }
}