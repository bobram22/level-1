
public class runner {
String name;
int speed;
int bibnumber;
static String raceLocation = "China";
static String startTime = "730 hours";
static int numRunners;
runner(String name, int speed){
	this.name = name;
	this.speed = speed;
	numRunners++;
	this.bibnumber = numRunners;
}
public String toString(){
	String BUB =  ("Runner " + name + " is " + speed + " mph fast at " + raceLocation );
return BUB;
}
  

public static void main(String[] args) {
	
	runner bub = new runner("bob",9001); 
	runner jeff = new runner("john", 100);
	System.out.println(bub);
	System.out.println(jeff);
	bub.speed=5;
	bub.raceLocation="Italy";
	System.out.println(bub);
	System.out.println(jeff);
}

}

