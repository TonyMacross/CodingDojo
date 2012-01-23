package net.grupocae.cd;

public class NumerosRomanos {

	public static void main(String[] args) {
		//regresaRomano("MCMLXXIX");
		regresaRomano("1979");
	}

	public static void regresaRomano(String numero) {

		String[] arreglo_miles = { "", "M", "MM", "MMM" };
		String[] arreglo_cienes = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
		String[] arreglo_diezes = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
		String[] arreglo_unos = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };

		int unos, diezes, cienes, miles, numeroInt;
		numeroInt = Integer.parseInt(numero);
		if (!(numeroInt < 3900) || !(numeroInt > 0)) {
			System.out.println("Los Romanos no contaban mas alla de lo evidente");
		} else {
			unos = numeroInt % 10;
			diezes = numeroInt % 100 - unos;
			cienes = numeroInt % 1000 - (diezes + unos);
			miles = numeroInt - (cienes + diezes + unos);
			System.out.println(arreglo_miles[miles / 1000]
					+ arreglo_cienes[cienes / 100] + arreglo_diezes[diezes / 10]
					+ arreglo_unos[unos]);
		}
	}
}