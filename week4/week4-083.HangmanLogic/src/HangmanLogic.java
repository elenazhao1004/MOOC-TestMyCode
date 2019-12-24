
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        if(!this.guessedLetters.contains(letter)){ //letter not guessed before
            if(this.word.contains(letter)){
                this.guessedLetters += letter;// the letter is added among the already guessed letters
            }else{ // it the word does not contains the guessed letter, number of faults increase
                this.numberOfFaults ++; 
                this.guessedLetters += letter;// the letter is added among the already guessed letters
            }
        }// if the letter has already been guessed, nothing happens
    }
    
    public String hiddenWord() {

        // create the hidden word by interating through this.word letter by letter
        // if the letter in turn is within the guessed words, put it in to the hidden word
        // if the letter is not among guessed, replace it with _ in the hidden word 
        String buffer = "";
        
        for(int i=0; i < this.word.length(); i++){
            char letter = this.word.charAt(i);
            
            if(this.guessedLetters.contains(""+letter)){
                buffer += letter;
            }else{
                buffer += "_";
            }
        }
        // return the hidden word at the end
        return buffer;
    }
}
