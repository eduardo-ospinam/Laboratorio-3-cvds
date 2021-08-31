package edu.eci.cvds.tdd.aerodescuentos;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class TarifasTest {
	private CalculadorDescuentos calcularDescuento = new CalculadorDescuentos(); 
	
	@Test
	public void descuentoDiasAntelacionMasEdadMayor() throws Exception {
		double CalculoTarifa = calcularDescuento.calculoTarifa(1000, 21, 70);
		Assert.assertEquals(CalculoTarifa,770.0);			
	}
	
	@Test
	public void descuentoDiasAntelacionMasEdadMenor() throws Exception {
		double CalculoTarifa = calcularDescuento.calculoTarifa(2000, 25, 15);
		Assert.assertEquals(CalculoTarifa,1600.0);			
	}
	
	@Test
	public void descuentoEdadMenor() throws Exception {
		double CalculoTarifa = calcularDescuento.calculoTarifa(3000, 15, 14);
		Assert.assertEquals(CalculoTarifa,2850.0);			
	}
	
	@Test
	public void descuentoEdadMayor() throws Exception {
		double CalculoTarifa = calcularDescuento.calculoTarifa(7000, 15, 80);
		Assert.assertEquals(CalculoTarifa,6440.0);			
	}
	
	@Test
	public void descuentoDiasAntelacionSinEdad() throws Exception {
		double CalculoTarifa = calcularDescuento.calculoTarifa(5000, 30, 20);
		Assert.assertEquals(CalculoTarifa,4250.0);			
	}
	
	@Test
	public void descuentoNulo() throws Exception {
		double CalculoTarifa = calcularDescuento.calculoTarifa(8000, 19, 25);
		Assert.assertEquals(CalculoTarifa,8000.0);	 		
	}
}
