package primercodigo;

import java.awt.Color;

public class Cilindro {
	    private double radio;
	    private double altura;
	    private String color;

	    // Constructor
	    public Cilindro(double radio, double altura, String color) {
	        this.radio = radio;
	        this.altura = altura;
	        this.color = color;
	    }

	    // Métodos para obtener y establecer el radio y la altura
	    public double getRadio() {
	        return radio;
	    }

	    public void setRadio(double radio) {
	        this.radio = radio;
	    }

	    public double getAltura() {
	        return altura;
	    }

	    public void setAltura(double altura) {
	        this.altura = altura;
	    }

	    // Método para calcular la longitud del cilindro
	    public double calcularLongitud() {
	        return 2 * Math.PI * radio;
	    }

	    // Método para calcular el área de la superficie del cilindro
	    public double calcularArea() {
	        return 2 * Math.PI * radio * (radio + altura);
	    }

	    // Método para cambiar el color del cilindro
	    public void setColor(String color) {
	        this.color = color;
	    }

	    // Método para obtener el color del cilindro
	    public String getColor() {
	        return color;
	    }

	    // Método toString para representar la información del cilindro
	    @Override
	    public String toString() {
	        return "Cilindro [radio=" + radio + ", altura=" + altura + ", color=" + color + "]";
	    }
	}



