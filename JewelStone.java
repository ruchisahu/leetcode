class JewelStone {
    public static int numJewelsInStones(String J, String S) 
    {
        if(J==null)return 0;
        int count=0;
        for(int i=0;i<S.length();i++)
        {
            
            if(J.indexOf(S.charAt(i))>=0)
                count++;
        }
        return count;
    }
    public static void main(String[] arg)
    {
        String J = "aA";
        String S = "aAAbbbb";
        System.out.println(numJewelsInStones(J,S)); 
    }
}