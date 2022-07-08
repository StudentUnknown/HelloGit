import java.util.Random;

class HeadsOrTails{
    HeadsOrTails(){
	System.out.println("Tossing a coin...");
    }
    
    boolean toss(){
	Random r = new Random();
	
	return r.nextBoolean();
    }
    
    public static void main(String[] args){
	HeadsOrTails obj = new HeadsOrTails();
	int heads = 0;
	int tails = 0;

	for(int i = 1; i <= 3; i++){
	    System.out.print("Round " + i + ": ");
	    
	    if(obj.toss()){
		System.out.println("Heads");
		heads++;
	    }
	    
	    else{
		System.out.println("Tails");
		tails++;
	    }
	}

	System.out.println("Heads: " + heads + ", Tails: " + tails);
	System.out.println(heads > tails ? "You won!" : "You lost.");
    }
}
