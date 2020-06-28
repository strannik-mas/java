package su.strannik.graph;

public interface Scaleable {
	public static final int K = 1;
	
	public int x = 1;	//всё-равно константа  static final
	
	void scale(double factor);
}
