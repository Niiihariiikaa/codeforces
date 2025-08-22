import java.util.Scanner;

public class homework {
    public static String hw(String a, String b, String c){
        StringBuilder res = new StringBuilder(a);
        for(int i=0; i<b.length(); i++) {
            

            if(c.charAt(i) == 'D') {
                res.append(b.charAt(i));

                
            } else if(c.charAt(i)=='V'){
                res.insert(0,b.charAt(i));
            }
            //res.append(a.charAt(i));
        }
        return res.toString();
    }
    // This is a placeholder for the homework class

    public static void main(String[] args) {
        /*String a = "ot";
        String b = "ad";
        String c = "DV";

        String result = hw(a, b, c);
        System.out.println(result);  */
         Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();  
                int n = sc.nextInt(); 
                String a = sc.next();
                int m = sc.nextInt(); 
                String b = sc.next();
                String c = sc.next();

                String result = hw(a, b, c);
                System.out.println(result);
            }
            sc.close();
        }
    
}