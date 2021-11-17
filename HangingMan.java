public class HangingMan {

    private int numWrongGuesses;
    String[] HangmanImage = {"+----+\n"+
            "|\n"+
            "|\n"+
            "|\n"+
            "/\\\n",

            "+----+\n"+
            "|    ^\n"+
            "|\n"+
            "|\n"+
            "/\\\n",

            "+----+\n"+
            "|    ^\n"+
            "|    |\n"+
            "|\n"+
            "/\\\n",

            "+----+\n"+
            "|    ^\n"+
            "|    |\n"+
            "|    |\n" +
            "/\\\n",

            "+----+\n"+
            "|    ^\n"+
            "|    |\n"+
            "|    |\n" +
            "/\\  M=M\n",
        };
    public HangingMan(){
        numWrongGuesses = 0;
    }
        
    public void dieSomeMore(){
        numWrongGuesses++;   
    }
    
    public boolean isntDead(){
        return numWrongGuesses<5;
    }
    
    public void show(){
        System.out.println(HangmanImage[numWrongGuesses]);
    }
}
