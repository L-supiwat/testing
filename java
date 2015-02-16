public class Coin{
	private int face;
	public static int HEAD = 0;
	public static int TAIL = 1;
	public Coin(){
		face = (int)(Math.random()*2);
	}
	public int getFace(){
		return face;
	}
	public int flip(){
		if (face == 1){
			face = 0;
			return face;
		}
		else {
			face = 1;
			return face;
		}
	}
	public int spin(){
		face = (int)(Math.random()*2);
		return face;
	}
}
