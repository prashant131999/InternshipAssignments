package dictionaryimplementation;

import java.util.Scanner;

import java.util.HashMap;

import java.util.ArrayList;


public class Dictionary {


    public static void insert(HashMap<String,String>dict,String word,String description)
    {
     dict.put(word,description);

    }
    public static void search(HashMap<String,String>dict,String word)
    {
        if(dict.containsKey(word))
        {
            String meaning=dict.get(word);
            System.out.println("Meaning of searched word "+word+" "+"is"+" "+meaning+"\n.....");
        }
        else
        {
            System.out.println("Word is not present in dictionary\n......");
        }
    }
    public static ArrayList<String> autocomplete(HashMap<String,String>dict,String incompleteword)
    {
        String completeWord="No word is starting from these letter found in dictionary";
        ArrayList<String> listOfCorrectWords = new ArrayList<>();

        for(String word : dict.keySet())
        {

            int length=0;
            char [] wordArray=word.toCharArray();
            if(wordArray.length>incompleteword.length())
            {
                 length=incompleteword.length();
            }
            else
            {
                length=wordArray.length;
            }
            for(int i=0;i< length;i++)
            {
                if(wordArray[i]!=incompleteword.charAt(i))
                {
                    listOfCorrectWords.add(completeWord);
                    return listOfCorrectWords;
                }
                else if(i==length-1)
                {
                    listOfCorrectWords.add(word);


                }
            }
        }
        return listOfCorrectWords;

    }
    public static String autocorrect(HashMap<String,String>dict,String incorrectword)
    {
        String correct="Not a single word matches with given words";
        for(String word : dict.keySet())
        {

            int length=0;
            char [] wordarray=word.toCharArray();
            if(wordarray.length>incorrectword.length())
            {
                length=incorrectword.length();
            }
            else
            {
                length=wordarray.length;
            }
            for(int i=0;i< length;i++)
            {
                if(wordarray[i]!=incorrectword.charAt(i))
                {
                    if(i>0)
                    {
                        correct=word;
                    }
                    break;
                }

            }
        }
        return correct;



    }

    public static void main(String args[])
    {
         HashMap<String,String>dict= new HashMap<>();

        Scanner sc=new Scanner(System.in);

        boolean flag=true;
        while(flag) {
            System.out.println("Enter 1 to insert in Dictionary");
            System.out.println("Enter 2 to search in Dictionary");
            System.out.println("Enter 3 to autocomplete ");
            System.out.println("Enter 4 to autocorrect ");
            System.out.println("Enter 5 to exit the dictionary");
            int choice=sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("enter the word to insert in dictionary");
                    String word = sc.next();
                    sc.nextLine();
                    System.out.println("Enter the meaning of word");
                    String meaning = sc.nextLine();
                    insert(dict, word, meaning);
                    System.out.println("Word and meaning is inserted in dictionary\n.......");
                    break;
                case 2:
                    System.out.println("Enter the word for which we want meaning");
                    String strword = sc.next();
                    search(dict, strword);
                    break;
                case 3:
                    System.out.println("Enter the word to be auto completed");
                    String incompleteWord=sc.next();
                    System.out.println("Complete words " +
                            "  "+autocomplete(dict,incompleteWord));
                    System.out.println("\n");




                    break;
                case 4:
                    System.out.println("Enter the word to be autocorrected");
                    String incorrectWord=sc.next();
                    System.out.println("Autocorrected word "+autocorrect(dict,incorrectWord));

                    break;
                case 5:
                    flag=false;
                    break;


            }
        }


    }

}
