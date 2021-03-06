
/*
Java Annotation

PROVIDE :: code snippets or comments you definitely want to provide
  STUDENT-PROMPT :: a specifically-worded question you want to ask, or a general solicitation for input, etc
  MUST-ANSWER-Q :: a question that must be resolved, that a majority of your class must understand before moving on
  BIG IDEA :: an introduction of a new topic, a connection to prior lesson or discussion for application here in code, etc.
  BEEG REVEAL :: this is gonna blow yer minds...
  DELIBERATE-ERROR :: specific code snippet or a general approach that is a bad fit for the situation, is flat-out wrong, or will lead to a compile- or run-time error, etc.
  FIRSTDRAFT :: code that will work for now, but which you intend to replace later
  REVISION vX :: better versions of firstdraft code...
BIG IDEA: Methods and Functions
*/


//  FIRSTDRAFT : What else do we need in this code so we know the code works?

public int rollADie()  	

// MUST-ANSWER-Q…. Why no parameters or inputs in ()?
//what is the purpose of the rollADie()? What does this do?
{
   	// Step 1: Create a random object to generate a random number 
   	// from 1 - 6 to simulate a six sided die

Random r = new Random();    
// PROMPT :  should you use a more descriptive variable name  instead of “r”?

    int valueOfDie = r.nextInt(6)+1; 
// STUDENT-PROMPT.. What does the + 1 do. 

        return valueOfDie;
	// MUST-ANSWER-Q : why do we need to return?

}

//why are the parameters integers? What type of parameters are needed?
public int[] generateDiceRolls(int numberOfSimulations)
//what is the purpose of the rollADie()? What does this do?
{
    // what needs to be revised in the next line?
    int[] diceRolls = new int[simulations];
//STUDENT PROMPT: Why would we need an array to generate dice simulations?
    for (int i = 0; i < diceRolls.length; i++)  
// WHILE instead of for..while..loop
// how can this be rewritten as a while loop?
    {
	// how do you call the method that rolls a dice?
	// how would you store that value in each element of the array?
      diceRolls[i] = RollADie();
    }
    //what are we missing here?
}


public int computeDiceSum(int[] values)
//what is the purpose of the computeDiceSum()? What does this do?
{
    // STUDENT PROMPT: where do we store the sum?
    int diceSums = 0;

    // “traverse the array” to access every element of that array?
    // what does “traverse the array” mean? Is it “traverse or transverse”?
 
    for (int i = 0; i < values.length; i++)
	//why do we use < instead of <= here?
    {
      diceSums = diceSums + values[i];   
// will diceSums += values[i] work?
    }
    return diceSums;
}

//BIG REVEAL: using methods to reuse a code over and over again without having to write it out repetitively
