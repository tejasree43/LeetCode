package Easy;

import java.util.HashSet;
import java.util.Hashtable;

public class UniqueEmailAddresses929 {

    public int numUniqueEmails(String[] emails) {

      //  Time complexity: O(n)
      //  Space complexity: O(n)

        HashSet<String> hs=new HashSet<>();
        for(String email:emails) {

            String firstFinePart = email.substring(0, email.indexOf('@'));
            firstFinePart = firstFinePart.replace(".", "");

            if (firstFinePart.indexOf('+')>=0) {
                firstFinePart = firstFinePart.substring(0,firstFinePart.indexOf('+'));
            }
            hs.add(firstFinePart+email.substring(email.indexOf('@')));

        }

        System.out.println(hs);
        return hs.size();
    }

    public static void main(String[] args){

    String[] emails={"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};

   // String[] emails={"linqmafia@leet+code.com","linqmafia@code.com"};
       // String[] emails={"testemail@leetcode.com", "testemail@lee.tcode.com"};
    UniqueEmailAddresses929 uniqueEmails=new UniqueEmailAddresses929();
    uniqueEmails.numUniqueEmails(emails);

    }
}
