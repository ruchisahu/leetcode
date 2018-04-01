import java.util.ArrayList;
import java.util.List;

class ladderLength
{
    public static int ladderLength1(String beginWord, String endWord, List<String> wordList)
    {
       int count=0;
       
     //   List<String> visited =new ArrayList<String>();
        ArrayList<String> dict=new ArrayList<String>();
        for (String word : wordList) 
            dict.add(word);
     //   visited.add(beginWord);
       // System.out.println(count);
        if(!dict.contains(endWord))
            return 0;
        
        Queue<String> q=new Queue<String>();
        q.enqueue(beginWord);
        char[] arr=beginWord.toCharArray();
        while(!q.isEmpty())
        {
            count++;
            for(int i=0;i<arr.length;i++)
            {
                
                for(char c='a';c<='z';c++)
                {
                    char temp=arr[i];
                    if(arr[i]!=c)
                    {
                        arr[i]=c;
                    }
                    String new_word=new String(arr);
                   // System.out.println(count);
                    if(new_word.equals(endWord))
                    {
                        return count+1;
                    }
                    if(!dict.contains(new_word))
                    {
                        continue;
                    }
                    dict.remove(new_word);
                    q.enqueue(new_word);
                
                    arr[i]=temp;
                }
            }
            
           
        }
       // System.out.println(count);
        return 0;
    }
    public static void main(String[] args)
    {
        String begin="hit";
        String end="cog";
        List<String> word=new ArrayList<String>() ;
        word.add("hot");
        word.add("dot");
        word.add("dog");
        word.add("lot");
        word.add("log");
        word.add("cog");
        System.out.println(ladderLength1(begin,end,word));
    }
}