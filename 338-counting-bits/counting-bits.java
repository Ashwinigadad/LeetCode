class Solution {
    public int[] countBits(int n) {
        int res[]=new int[n+1];
        res[0]=0;
        for(int i=1;i<=n;i++){
            String binary=Integer.toBinaryString(i);
            int ones=countOnes(binary);
            res[i]=ones;
        }
        return res;
        
    }
    public int countOnes(String num){
        int count=0;
        for(int i=0;i<num.length();i++){
            if(num.charAt(i)=='1')
                count++;
        }
        return count;
    }
}