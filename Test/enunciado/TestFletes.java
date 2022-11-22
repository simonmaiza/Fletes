package enunciado;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFletes {

	@Test
	public void testQueAgregoUnaCargaCamioneta() throws SobrepesoException {
		AgenciaFlete agencia = new AgenciaFlete();
		Vehiculo camioneta = new Camioneta("ABC123" , "Simon" , "Maiza" , 200.0 ,2010 );
		Carga carga1 = new Carga("Ladrillos" , 100.0);
		
		agencia.agregarVehiculo(camioneta);	
		
		camioneta.agregarCarga(carga1);
		
		Integer valorEsperado = 1;
		Integer valorObtenido = camioneta.obtenerCantidadDeCargas();
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test(expected = SobrepesoException.class)
	public void testQueNoAgregoUnaCargaCamionPorSobrepeso() throws SobrepesoException {
		AgenciaFlete agencia = new AgenciaFlete();
		Vehiculo camioneta = new Camioneta("ABC123" , "Simon" , "Maiza" , 200.0 ,2010 );
		Carga carga1 = new Carga("Ladrillos" ,300.0);
		
		agencia.agregarVehiculo(camioneta);	
		
		camioneta.agregarCarga(carga1);
	}
	@Test
	public void testQueTransfieraUnaCargaDeUnVehiculoAOtro() throws SobrepesoException, VehiculoNotFoundException {
		AgenciaFlete agencia = new AgenciaFlete();
		Vehiculo camioneta = new Camioneta("ABC123" , "Simon" , "Maiza" , 200.0 ,2010 );
		Carga carga1 = new Carga("Ladrillos" ,100.0);
		Vehiculo camion = new Camion("QWE321" , "Jose" , "Maiza", 1000.0 , true );
		
		agencia.agregarVehiculo(camioneta);	
		agencia.agregarVehiculo(camion);
		
		camioneta.agregarCarga(carga1);
		
		agencia.moverCargaDeUnVehiculoAOtro(camioneta.getPatente(), camion.getPatente(),carga1);
		 
		Integer valorEsperado = 1;
		Integer valorObtenido = camion.obtenerCantidadDeCargas();
		assertEquals(valorEsperado, valorObtenido);
	}
	//@Test
	//public void testQueNoPermitaTransfieraUnaCargaAUnVehiculoDestinoPorNooportarElPesoDeLasCargas()
		//	throws SobrepesoException {
	//}

}
