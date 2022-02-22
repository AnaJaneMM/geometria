/**
 * 
 * @author Ana Martinez Mateo
 * @version:1.2
 */
public class Rectangulo extends FiguraGeometrica {
	private double l1;
	private double l2;
	/**
         * 
         *  Declaración de variables
         */
        
        /**
         * 
         * @param tipoFigura
         * @param lG
         * @param lP 
         */
	public Rectangulo(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
        
        /**
         * 
         * @return el area 11*12
         */
	@Override
	public double area() {
		return l1 * l2;
	}
	/**
         * 
         * @return el perímetro (2*11) + (2*12)
         */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
