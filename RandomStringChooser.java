package Random;
import java.lang.Math;

public class RandomStringChooser {
	private int rangeNum;
	private String[] arrayString;
	private int randNum;
	private int[] stringUsed;
	private String randString;
	
	public RandomStringChooser(String[] parrayString) {
		rangeNum = parrayString.length;
		arrayString = parrayString;
		stringUsed = new int[rangeNum-1];
		for(int x = 0; x< stringUsed.length; x++) {
			stringUsed[x] = 1000;
		}
	}
	
	private int getRandNum() {
		return (int)(Math.random()*rangeNum);
	}
	public String getNext() {
		randNum = getRandNum();
		randString = arrayString[randNum];
		for(int x = 0; x<stringUsed.length; x++) {
			if(stringUsed[x] == randNum) {
				return "NONE";
			}
		}
		return randString;
	}
}
