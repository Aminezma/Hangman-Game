
package hangman_game;

/**
 *
 * @author mabdirizak
 */
public class Guess {
    
    String Entered_Word;
    int attempts = 3;
    int score;
    Word word;
    
    
public String Inputted_Word(){


    for (int i = 0; i < 3; i++) {
        
   
    System.out.println("You have entered :-"+Entered_Word);
    
    if(Entered_Word != word.Correct_Word)
   
    {
    
    
        System.out.println("Sorry! Your Guess is WRONG");
        
        System.out.println(" TRY AGAIN!!!!!!!");
         
        attempts -= 1;
        
        score = 0;
    
        System.out.println(" You have "+attempts+"left...");
    
    }
    
    
    
     }
    
    
    

    
    return Entered_Word;

}



}