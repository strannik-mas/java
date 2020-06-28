package su.strannik.graph;

public interface ScalableExt extends Scaleable {
	void scale(double factorX, double factorY);
	void scaleX(double factor);
	void scaleY(double factor);
}
