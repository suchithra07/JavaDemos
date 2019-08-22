import java.util.*;
import java.util.List;

public class StringarrayReverse {
    public static void main(String args[]){

                Scanner sc = new Scanner(System.in);
                System.out.println("Enter No.of strings");
                int len = sc.nextInt();
                System.out.println("Enter "+len+ "  strings");

                List StrList=new ArrayList();
                List RevList=new ArrayList();
                StrList.add(sc.next());
                //StringBuilder sbrev=new StringBuilder();

                 for (int i = 0; i < StrList.size(); i++) {
                     for(int j=0    ;j<i;j++) {
                         StringBuilder sbrev = new StringBuilder(String.valueOf(StrList.get(i))).reverse();
                         RevList.add(sbrev);
                     }
                 }
        System.out.println("Given Strings are " + StrList );
        System.out.println("Reverse Strings are " + RevList );
            }
        }


