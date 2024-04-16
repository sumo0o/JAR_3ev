package primercodigo;

public class ParejaDeNumeros {
	//Atributos -> variables
	int num1;
	int num2;
	
	//métodos -> funciones
	//CONSTRUCTOR
	ParejaDeNumeros(int num1Enviado,int num2Enviado){
		num1 = num1Enviado;
		num2 = num2Enviado;
		
		
	}
	
	
	//Resto
	int DevuelveSuma(){
		int respuesta;
		respuesta=num1+num2;
		return respuesta;
	}
	
	int DevuelveResta() {
		int respuesta;
		respuesta=num1-num2;
		return respuesta;
	}
	
	int DevuelveMultiplicacion() {
		int respuesta;
		respuesta=num1*num2;
		return respuesta;
	}
	
	int DevuelveDivisión() {
		int respuesta;
		respuesta=num1/num2;
		return respuesta;
	}
	
	
	

}
