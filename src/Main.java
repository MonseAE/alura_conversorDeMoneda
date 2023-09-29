import java.awt.Dimension;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Main {

	public static void main(String[] args) {
		int continuar = 0;
		UIManager.put("OptionPane.minimumSize",new Dimension(400,100)); 
		while(continuar == 0){
			String[] choices = { "Conversor de moneda", "Conversor de temperatura" };
		    String input = (String) JOptionPane.showInputDialog(null, "Seleccione una opción de conversión",
		        "Menu", JOptionPane.DEFAULT_OPTION, null,                                                                        
		        choices, // Array of choices
		        choices[0]); // Initial choice
		    //System.out.println(input);
		    if(input.equals("Conversor de moneda")) {
		    	String dinero = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir:");
		    	
		    	try {
					Double.parseDouble(dinero);
				}catch (Exception e){
					JOptionPane.showMessageDialog(null, "Valor no valido");
					dinero = "0.0";
				}
		    	
		    	String[] tiposDeConversion = { "De peso a Dólar","De peso a Euros","De peso a Libras Esterlinas", "De peso a Yen Japonés","De peso a Won sul-coreano", 
		    			"De Dolar a peso","De Euros a peso", "De Libra Esterlina a peso", "De Yen Japones a peso", "De Won sul-coreano a peso"};
			    String conversionDeMonedaSeleccionada = (String) JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero",
			        "Monedas", JOptionPane.DEFAULT_OPTION, null,                                                                        
			        tiposDeConversion, // Array of choices
			        tiposDeConversion[0]);
			    String total = convertirMoneda(dinero,conversionDeMonedaSeleccionada);
			    JOptionPane.showMessageDialog(null, "Tienes $"+ total );
			    continuar = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
			 			    
		    }
		    
		}
		
		JOptionPane.showMessageDialog(null, "Programa terminado");
		

	}
	
	public static String convertirMoneda(String cantidadDeDinero, String tipoDeConversion) {
		if(cantidadDeDinero == null || cantidadDeDinero.equals("")) {
			return "0.0";
		}
		
		Double dineroDouble = Double.parseDouble(cantidadDeDinero);
		
		
		
		switch(tipoDeConversion) {
		case "De peso a Dólar":
			dineroDouble = dineroDouble * 0.056;
			return Double.toString(dineroDouble)+ " dolares"; 
			
		case "De peso a Euros":
			dineroDouble = dineroDouble * 0.054;
			return Double.toString(dineroDouble)+ " euros"; 
			
		case "De peso a Libras Esterlinas":
			dineroDouble = dineroDouble * 0.047;
			return Double.toString(dineroDouble)+ " libras esterlinas"; 
			
		case "De peso a Yen Japonés":
			dineroDouble = dineroDouble * 8.44;
			return Double.toString(dineroDouble)+ " yenes japoneses"; 
			
		case "De peso a Won sul-coreano":
			dineroDouble = dineroDouble * 76.56;
			return Double.toString(dineroDouble)+ " wones"; 
			
		case "De Dolar a peso":
			dineroDouble = dineroDouble * 17.70;
			return Double.toString(dineroDouble)+ " pesos"; 
			
		case "De Euros a peso":
			dineroDouble = dineroDouble * 18.59;
			return Double.toString(dineroDouble)+ " pesos"; 
			
		case "De Libra Esterlina a peso":
			dineroDouble = dineroDouble * 21.48;
			return Double.toString(dineroDouble)+ " pesos"; 
			
		case "De Yen Japones a peso":
			dineroDouble = dineroDouble * 0.12;
			return Double.toString(dineroDouble)+ " pesos"; 
			
		case "De Won sul-coreano a peso":
			dineroDouble = dineroDouble * 0.013;
			return Double.toString(dineroDouble)+ " pesos"; 
		default:
			return null;
		}
		
	}

}
