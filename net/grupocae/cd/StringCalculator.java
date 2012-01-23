package net.grupocae.cd;

public class StringCalculator {
	public static void main(String[] args){
		System.out.println(add(""));
		System.out.println(add("1,2"));
		System.out.println(add("1\n2"));
		System.out.println(add("1,2\n3"));
		System.out.println(add("//???++++ddddd**\n1++++2**3ddddd6"));
		System.out.println(add("//d**\n1d2d3d6"));
	}
	
	public static String validarDelimitador(char delimitador){
		if (delimitador=='*'||delimitador=='$'||delimitador=='^'||delimitador=='+'||delimitador=='?') 
			return "\\" + delimitador;
		else 
			return ""+delimitador;
	}
	
	public static int add(String cadena) {
		int suma = 0;
		if (cadena.startsWith("//")) {
			String delimitador = cadena.substring(2, cadena.indexOf("\n"));
			if (delimitador.length() > 1) {
				String delimitadores = "";
				for (int i = 0; i < delimitador.length(); i++) {
					delimitadores += validarDelimitador(delimitador.charAt(i));
					if (!(delimitador.charAt((i) >= delimitador.length() - 1 ? i: (i) + 1) == delimitador.charAt(i)))
						delimitadores += "|";
				}
				delimitador = delimitadores;
			} else {
					delimitador = validarDelimitador(delimitador.charAt(0));
			}

			String[] deliminadorValores = cadena.split("\n");
			String[] cadenas = deliminadorValores[1].split(delimitador);
			if (cadena.length() > 0 && cadenas.length > 0) {
				for (String cadenaNumero : cadenas) {
					suma += Integer.parseInt(cadenaNumero);
				}
				return suma;
			}
		} else {
			String[] cadenas = cadena.split(",|\n");
			if (cadena.length() > 0 && cadenas.length > 0) {
				for (String cadenaNumero : cadenas) {
					suma += Integer.parseInt(cadenaNumero);
				}
				return suma;
			}
		}

		
		return suma;
	}
}