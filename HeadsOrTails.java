import java.util.*;

class HeadsOrTails{
    HeadsOrTails(){
	Scanner sc = new Scanner(System.in);

	System.out.println("Who are you?");
	System.out.print("> ");
	String name = sc.nextLine();
	System.out.println("Hello, " + name + "!");
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
    }
}
