package Modelo;

public class Movimentacao {
	
	private String tipo;
	private double valor;
	private Object data;
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public Object getData() {
		return data;
	}
	
	public void setData(Object data){
		this.data = data;
	}

}
