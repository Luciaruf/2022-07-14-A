package it.polito.tdp.nyc.model;

public class Arco implements Comparable<Arco>{

	private String v1;
	private String v2;
	private Integer peso;
	
	
	public Arco(String v1, String v2, Integer peso) {
		super();
		this.v1 = v1;
		this.v2 = v2;
		this.peso = peso;
	}


	public String getV1() {
		return v1;
	}


	public void setV1(String v1) {
		this.v1 = v1;
	}


	public String getV2() {
		return v2;
	}


	public void setV2(String v2) {
		this.v2 = v2;
	}


	public Integer getPeso() {
		return peso;
	}


	public void setPeso(Integer peso) {
		this.peso = peso;
	}


	@Override
	public int compareTo(Arco o) { //(int) (o.peso-this.peso) è sbagliato perchè sono dei double, in questo caso funziona però
		return o.peso-this.peso;
		//- this.peso.compareTo(o.peso); questa sarebbe la soluzione esatta perchè hanno la D maiuscola quindi vale il compareTo
	}


	@Override
	public String toString() {
		return "Arco v1= " + v1 + ", v2= " + v2 + ", peso= " + peso ;
	}
	
	
	
}
