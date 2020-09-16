package test;

import org.junit.Assert;
import org.junit.Test;

import exercicios_qaacademy.Exercicio08;
import utils.Utilidades;

public class TesteExercicio08 {

	Exercicio08 ex8 = new Exercicio08();

	@Test
	public void testeCalculoIR() {

		Assert.assertEquals("Valor de IR incorreto", "0,1", ex8.calculaIRString(1903.99));
		Assert.assertEquals("Valor de IR incorreto", "69,2", ex8.calculaIRString(2826.66));
		Assert.assertEquals("Valor de IR incorreto", "207,86", ex8.calculaIRString(3751.06));
		Assert.assertEquals("Valor de IR incorreto", "413,43", ex8.calculaIRString(4664.69));
		Assert.assertEquals("Valor de IR incorreto", "0", ex8.calculaIRString(1903.98));

	}

	@Test
	public void testeSalarioLiquido() {

		double salario = 1903.99;

		double inss = 190.03;

		double irpf = ex8.calculaIR(salario);

		Assert.assertEquals("Valor de IR incorreto", "1713,86", ex8.calculaSalarioLiquido(salario, irpf, inss));

	}
	
	@Test
	public void testeCalculoIR_double() {
		
	
		Assert.assertEquals("Valor de IR incorreto", "0,1",irpfFormatado(1903.99));
		Assert.assertEquals("Valor de IR incorreto", "69,2", irpfFormatado(2826.66));
		Assert.assertEquals("Valor de IR incorreto", "207,86",irpfFormatado(3751.06));
		Assert.assertEquals("Valor de IR incorreto", "413,43", irpfFormatado(4664.69));
		Assert.assertEquals("Valor de IR incorreto", "0", irpfFormatado(1903.98));
}
	
/**
 *  metodo para formatar um double e transformar em uma string. 
 * @param salario
 * @return String irpf
 */
	public String irpfFormatado(double salario) {
		return Utilidades.formatarDouble(ex8.calculaIR(salario));
	}

}
