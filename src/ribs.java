public class ribs {
private int numOfRibs;
private String BorP;
public ribs(int numOfRibs,String BorP){
	this.numOfRibs=numOfRibs;
	this.BorP=BorP;
}
public int getnumOfRibs(){
	return this.numOfRibs;
}
public void setnumOfRibs(int numOfRibs){
	if(numOfRibs<9){
		this.numOfRibs=numOfRibs;
	}
	else{
		this.numOfRibs=9;
	}
}
public void mustbeBorP(){
	if(BorP.equals("beef")){
		BorP.equals("beef");
	}
	else if(BorP.equals("pork")){
		BorP.equals("pork");
	}
	else{
		System.out.println("That ain't a rib kind");
	}
	
}
}
