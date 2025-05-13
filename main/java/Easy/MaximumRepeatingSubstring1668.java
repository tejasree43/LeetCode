package Easy;

 class MaximumRepeatingSubstring1668 {
    public int maxRepeating(String sequence, String word) {

        int wordRepeat=0;

        String add = word;
        while(sequence.contains(word)==true){

            wordRepeat++;
            word=word+add;
        }
        return wordRepeat;

        //brute force but corner cases can not be applied
        /*if(sequence.equals(word)){
            return 1;
        }*/
        /*int wordRepeat=0;
        int wordLength=word.length();
        int i=0;
        while( i<sequence.length()) {

            if (sequence.length() > wordLength){
                String subString = sequence.substring(i, wordLength);
                if (subString.equals(word)) {
                    wordRepeat++;
                }
            }
            i++;
            wordLength++;
        }

        return wordRepeat;*/
    }
 public static void main(String[] args){
   // String sequence = "ababc", word = "ab";
   //  String sequence = "ababc", word = "ba";
     String sequence = "aaabaaaabaaabaaaabaaaabaaaabaaaaba", word = "aaaba";

     MaximumRepeatingSubstring1668 maxRepeat=new MaximumRepeatingSubstring1668();
    int wordRepeat= maxRepeat.maxRepeating(sequence,word);
    System.out.println("wordRepeat"+wordRepeat);
}
}
