package org.mvpigs;

import org.mvpigs.tryItOut.Interfaz.*;

public class Circulo implements Drawable {
	private String nombre = "Unknown";
	private double radio = 0d;
	private final double PI = Math.PI;
	
	public Circulo(){
	}
	
	public Circulo(double radio){
		super();
		this.radio = radio;
    }
    
    public Circulo(String nombre, double radio){
		this.nombre = nombre;
		this.radio = radio;
	}
	
	public double area() {
		return PI * Math.pow(this.radio, 2);
	}
	

    public String getNombre() {
        return this.nombre;
    }

	public void draw(){
		System.out.println("Esto es un: " + this.getNombre());
	}
}