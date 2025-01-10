class Solution {
    public String defangIPaddr(String address) {
        String ans = address.replaceAll("\\.","[.]");
        return ans;
    }
}