class Solution {
    public int numOfWays(int n) {
        long mod=1000000007;
        long same=6;    // 6 ways(ABA)
        long diff=6;    // 6 ways (ABC)
        for(int i=2;i<=n;i++){
            long newSame=(2*same+2*diff)% mod;
            long newDiff=(2*same+3*diff)% mod;
            same=newSame;
            diff=newDiff;
        }
        return(int) ((same+diff)%mod);
    }
}
