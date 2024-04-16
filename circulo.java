package primercodigo;

public class circulo {
	int coordX;
	int coordY;
	int radio;
	
	circulo(int coordXEnviada,int coordYEnviada,int radioEnviado){
		coordX=coordXEnviada;
		coordY=coordYEnviada;
		radio=radioEnviado;
	}
	
	
	double devuelveLongitudCirculo() {
		double respuesta;
		respuesta=2 * Math.PI*radio;
		return respuesta;
	}

	double devuelveArea() {
		double respuesta;
		respuesta= Math.PI*radio*radio;
		return respuesta;
	}
}
