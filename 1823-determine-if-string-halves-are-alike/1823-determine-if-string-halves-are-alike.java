class Solution {
    public boolean halvesAreAlike(String s) {
        Set<Character> vow = new HashSet<>();
        vow.add('a'); vow.add('e'); vow.add('i'); vow.add('o'); vow.add('u'); vow.add('A');vow.add('E'); vow.add('I');vow.add('O'); vow.add('U');

        int vc = 0;
        int midIdx = s.length()/2;
        for(int i = 0; i<midIdx ; i++)
        {
            char CA = s.charAt(i);
            char CB = s.charAt(midIdx+i);
            if(vow.contains(CA)) vc++;
            if(vow.contains(CB)) vc--;
        }
        return vc == 0;
    }
}