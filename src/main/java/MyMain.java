public class MyMain {

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
        double smurky=0;
        double murk=0;
        for (int i=0; i<10000; i++){
            for (int j=0; j<6; j++){
                if (((Math.random()*6)+1)==6){
                    smurky++;
                }
                else{
                    smurky+=0;
                }
            }
            murk++;
        }
        return ((smurky/murk)*100);
    }

    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        // REPLACE WITH YOUR CODE HERE
        return -1.0;
    }

    // Calculate the probability of rolling at least three 6's when rolling 
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
        // REPLACE WITH YOUR CODE HERE
        return -1.0;
    }


    public static void main(String[] args) {
        // YOUR CODE HERE
    }
}
