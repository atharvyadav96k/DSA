
public class CommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String commonPrefix = strs[0];
    
        for(int i=0;i<strs.length;i++){
            int j=0;
            String commonPart = "";
            
            while(j < Math.min(commonPrefix.length(), strs[j].length() ) && commonPrefix.charAt(j) == strs[j].charAt(j)){
                commonPart += strs[i].charAt(j);
                j++;
            }
            commonPrefix = commonPart;
        }
        System.out.print(commonPrefix);
    }
}
