import java.util.Scanner;
public class marks{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int mark=scan.nextInt();
        System.out.println("MARK  ="+" "+mark);
        if(mark <=0){
            System.out.println("Invalid mark");
            System.out.print("Explanation:\n "+mark+"> 100 --> Invalid mark");
        }
        else if(mark >100){
            System.out.println("Invalid mark");
            System.out.print("Explanation:\n "+mark+"< 100 --> Invalid mark");
        }
        if(mark>=90 && mark<=100){
            System.out.println("GRADE A");
            System.out.print("Explanation:\n "+mark+">75 falls between 90-100 --> Grade A.");
            System.out.println(mark+" % 5 == 0 --> Lucky Mark added.");
        }
        if(mark>=80 && mark<=89){
            System.out.println("GRADE B");
            System.out.print("Explanation:\n "+mark+">75 falls between 80-89 --> Grade B.");
            System.out.println(mark+" % 5 == 0 --> Lucky Mark added.");
        }
        if(mark >=70 && mark<=79){
            System.out.println("GRADE C");
            System.out.print("Explanation:\n "+mark+">falls between 70-79 --> Grade C.");
            System.out.println(mark+" % 5 == 0 --> PASS.");
        }
        if(mark >=50 && mark<=69){
            System.out.println("GRADE D");
            System.out.print("Explanation:\n "+mark+" falls between 60-69 --> Grade D.");
            System.out.println(mark+" % 5 == 0 --> PASS.");
        }
        else{
            if(mark<50){
            System.out.println(mark+"Grade = Fail. Needs Improvement");
            System.out.print("Below 50 --> Fail");
            }
        }
    }
}
