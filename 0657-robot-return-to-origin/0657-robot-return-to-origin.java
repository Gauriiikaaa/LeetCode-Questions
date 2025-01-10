class Solution {
    public boolean judgeCircle(String move) {
        int lr=0; int ud = 0;
        for(int i =0 ; i<move.length();i++)
        {
            if(move.charAt(i)=='U')
            ud+=1;
            else if(move.charAt(i)=='D')
            ud -= 1;
            else if(move.charAt(i)=='R')
            lr+=1;
            else
            lr-=1;
        }
        return (lr==0 && ud==0);
    }
}