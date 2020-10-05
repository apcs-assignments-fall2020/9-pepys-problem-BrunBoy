public class MyMain {

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
        double mimmy=0;
        for (int i=0; i<10000; i++){
            for (int j=0; j<6; j++){
                if (((int) ((Math.random()*6)+1)) ==6){
                    mimmy++;
                    break;
                }
            }
        }
        return mimmy/100;
    }

    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        double mimmy=0;
        double scarick=0;
        for (int i=0; i<10000; i++){
            for (int j=0; j<12; j++){
                if (((int) ((Math.random()*6)+1)) ==6){
                    mimmy++;
                }
            }
            if (mimmy>=2){
                scarick++;
            }
            mimmy=0;
        }
        return scarick/100;
    }

    // Calculate the probability of rolling at least three 6's when rolling 
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
        double mimmy=0;
        double scarick=0;
        for (int i=0; i<10000; i++){
            for (int j=0; j<18; j++){
                if (((int) ((Math.random()*6)+1)) ==6){
                    mimmy++;
                }
            }
            if (mimmy>=3){
                scarick++;
            }
            mimmy=0;
        }
        return scarick/100;
    }


    public static void main(String[] args) {
        // YOUR CODE HERE
    }
}
