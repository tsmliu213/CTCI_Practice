
public class TN {
	private int value;
	private TN left;
	private TN right;
	
	TN(int value, TN left, TN right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}
	
	TN(int value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}
	
	public TN getLeft() {
		return this.left;
	}
	
	public TN getRight() {
		return this.right;
	}
	
	public void setLeft(TN left) {
		this.left = left;
	}
	
	public void setRight(TN right) {
		this.right = right;
	}
	
	public int getValue() {
		return this.value;
	}
	
	
}
