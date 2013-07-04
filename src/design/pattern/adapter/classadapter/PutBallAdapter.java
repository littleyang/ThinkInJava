package design.pattern.adapter.classadapter;

/**
 * this is the adapter pattern:
 * shall we put the football using the basketBallBag?
 * ok,let do it. Using Object ObjectAdapter pattern
 * @author jenny
 *
 */
public class PutBallAdapter extends BassketBallBag {
	
	// first we should create foot ball bag 
	FootBallBag fbb ;
	// implements the constructor
	public PutBallAdapter(FootBallBag fbb){
		this.fbb = fbb;
	}
	// ok, let to override the put basket ball method
	@Override
	public void putBasketBall(){
		fbb.putFootBall();
	}

}
