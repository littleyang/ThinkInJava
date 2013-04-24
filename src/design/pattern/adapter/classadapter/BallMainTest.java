package design.pattern.adapter.classadapter;

/**
 * let write some test
 * @author jenny
 *
 */
public class BallMainTest {
	
	public static void main(String[] args){
		// put a basket ball into the bag
		PutBall pb = new PutBall();
		BassketBallBag bbg = new BassketBallBag();
		pb.putBall(bbg);
		// let try to put a foot ball using the PutBall method directly,and this may be wrong
		FootBallBag fb = new FootBallBag();
		//pb.putBall(bbg);
		
		// ok, let using the adapter pattern
		// create an object of PutBallAdapter
		PutBallAdapter pba = new PutBallAdapter(fb);
		pba.putBasketBall();
		
		
	}

}
