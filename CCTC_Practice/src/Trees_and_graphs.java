
public class Trees_and_graphs {
	Trees_and_graphs() { }
	
	public void run() {
		
	}
	
	public int height(TN root) {
		if(root == null) {
			return -1;
		}
		return 1 + Math.max(height(root.getLeft()), height(root.getRight()));
	}
}
