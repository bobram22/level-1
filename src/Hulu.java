
public class Hulu {
public static void main(String[] args) {
	Movie m1 = new Movie("Ice Age Collision Course" , 5);
	Movie m2 = new Movie("The Princess Bride" , 5);
	Movie m3 = new Movie("Grown Ups" , 5);
	Movie m4 = new Movie("Inside Out" , 4);
	Movie m5 = new Movie("Star Wars The Force Awakens" , 0);
	NetflixQueue q1 = new NetflixQueue();
	q1.addMovie(m5);
	q1.addMovie(m4);
	q1.addMovie(m3);
	q1.addMovie(m2);
	q1.addMovie(m1);
	
	String p1 = m1.getTicketPrice();
	String p2 = m2.getTicketPrice();
	String p3 = m3.getTicketPrice();
	String p4 = m4.getTicketPrice();
	String p5 = m5.getTicketPrice();
	System.out.println(p1);
	System.out.println(p2);
	System.out.println(p3);
	System.out.println(p4);
	System.out.println(p5);
	q1.printMovies();
	Movie b1 = q1.getBestMovie();
	System.out.println(b1);
	q1.sortMoviesByRating();
	Movie b2 = q1.getMovie(1);
	System.out.println(b2);
	
}
}
//Paste the code below into 2 classes called Movie and NetflixQueue.
//Create your own class with a main() method that will use Movie and NetflixQueue to complete the following challenges:
	//1. Instantiate some Movie objects (at least 5).
	//2. Use the Movie class to get the ticket price of one of your movies.


	//3. Instantiate a NetflixQueue.
	//4. Add your movies to the Netflix queue.
	//5. Print all the movies in your queue.
	
	//6. Use your NetflixQueue object to finish the sentence "the best movie is...."
	//7. Use your NetflixQueue to finish the sentence "the second best movie is...." 
