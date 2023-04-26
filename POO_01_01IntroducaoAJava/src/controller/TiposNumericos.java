package controller;

public class TiposNumericos {

	public static void main(String[] args) {
		byte menor = 10; // 1 byte
		short pequeno = 456; // 2 bytes
		int normal = 10252; // 4 bytes
		long muitoGrande = 6263732239L; // 8 bytes

		/*
		 * Precisão simples (7 dígitos) que utiliza 32 bits de armazenamento. Tornam-se
		 * imprecisas para valores muito grandes ou muito pequenos. Úteis quando
		 * precisamos de um valor fracional sem grande necessidade de precisão.
		 * 
		 * Ex: Reais e Centavos
		 */

		float numeroReal = 10.9f; // 4 bytes

		/*
		 * double Precisão dupla (15 dígitos) que utiliza 64 bits de armazenamento.
		 * Exemplo:
		 */

		double numero = 6745.9E13; // 8 bytes

	}

}
