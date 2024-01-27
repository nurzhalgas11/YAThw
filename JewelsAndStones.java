package string;

public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        char[] jewel = jewels.toCharArray();
        char[] stone = stones.toCharArray();
        for(char x: jewel){
            for(char y: stone){
                if(x == y) count++;
            }
        }
        return count;
    }
}
