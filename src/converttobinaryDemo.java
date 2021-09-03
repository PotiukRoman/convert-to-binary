class Kata {
    public static int toBinary(int n) {
        String s="";
        int binary_digit;
        while(n>1){
            binary_digit=n%2;
            s=s+binary_digit;
            n=n/2;
        }
        s=s+(n%2);

        String result = "";
        for (int i = 0; i < s.length(); i++) {
            result = s.charAt(i) + result;
        }

        int i=Integer.parseInt(result);
        return i;
    }
}


public class converttobinaryDemo {
    public static void main(String[] args) {
        // Testing
        System.out.println("Digit 1 -> Binary="+Kata.toBinary(1));
        System.out.println("Digit 2 -> Binary="+Kata.toBinary(2));
        System.out.println("Digit 3 -> Binary="+Kata.toBinary(3));
        System.out.println("Digit 5 -> Binary="+Kata.toBinary(5));
    }
}
