import java.util.Scanner;
public class vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string:");
        String a = sc.nextLine();
        a = a.toLowerCase();
        int count = 0;
        for(int i = 0;i < a.length(); i++){ 
            char ch = a.charAt(i); 
            if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){

                count++;
            }
           
        }
        System.out.println("no.of vowels present in string: "+count);
    }
}