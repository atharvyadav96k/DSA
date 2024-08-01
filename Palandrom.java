public class Palandrom {
    static boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        StringBuffer s = new StringBuffer(Integer.toString(x));
        System.out.println(s);
        StringBuffer r = s.reverse();
        System.out.println(r);
        return s.toString().equals(r.toString()); 
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
    }
}
