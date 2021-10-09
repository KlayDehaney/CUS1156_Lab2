import java.util.ArrayList;

/* Project:  Lab2
 *  Class:CUS 1156
 * Author: Klay Dehaney
 *  Date:  Oct 8, 2021
 * This lab prints the number of unique elements in a ArrayList*/ 

public class UniqueWords
{
   /**
		counts the number of unique strings in a list
		@param list ArrayList of strings to be examined
		@return number of unique strings in the list
   */
   public static int countUnique(ArrayList<String> list)
   {
	  int count = 0;
	  
      for (int i = 0; i < list.size(); i++)
      {		 for (int j = 0; j < list.size(); j++)
		 {
			
		 }
      }
	  return count;
   }

   public static void main(String[] args)
   {
      ArrayList <String> words = new ArrayList<>();
      words.add("apple");
	  words.add("orange");
	  words.add("blackboard");
	  words.add("apple");
	  words.add("orange");
	  words.add("sun");
	  words.add("moon");
	 // ----------------------------------------------------------------------------------------
	  long unique1 = words.stream()//use stream collection because it doesn't allow duplicates
              .distinct()
              .count();
   
	  int unique = countUnique(words);
      System.out.println(words + " has " + unique1 + " unique words");
   }
}
