package Easy;

public class CountingWordsWithaGivenPrefix2185 {

    public int prefixCount(String[] words, String pref) {

        int prefixCount = 0;

        for(String word : words)
        {
            if (word.startsWith(pref))
            {
                prefixCount++;
            }
        }

        return prefixCount;
    }

    public static void main(String[] args)
    {
      String[]  words = {"pay","attention","practice","attend"};
      String pref = "at";
      CountingWordsWithaGivenPrefix2185  count = new CountingWordsWithaGivenPrefix2185();
      int output = count.prefixCount(words,pref);
      System.out.println(output);
    }
}
