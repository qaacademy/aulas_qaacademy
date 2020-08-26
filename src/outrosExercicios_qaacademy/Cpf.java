package outrosExercicios_qaacademy;
import javax.swing.*;

   public class Cpf
   {
      public static void main (String args[])
      {
         String cpf, inicial;
			
			do {
			inicial = JOptionPane.showInputDialog ("Digite o cpf");
			cpf = limpaString(inicial);
			if (cpf.length() > 11)
			JOptionPane.showMessageDialog(null,"O CPF DIGITADO POSSUI MAIS DE 11 DIGITOS");
			}
			while(cpf.length() > 11);
			JOptionPane.showMessageDialog(null,"CPF Limpo: "+ cpf);
			         
         if (verificarPrimeiroDigito(cpf) && verificarSegundoDigito(cpf)) {
            JOptionPane.showMessageDialog(null,"CPF V�LIDO!!!");
         }else { 
            JOptionPane.showMessageDialog(null,"CPF INV�LIDO!!!");
         }
      	
      }
   
   	
      public static boolean verificarPrimeiroDigito(String cpf)
      {
         int primeiroDigito;
         int multiplicador[]={10,9,8,7,6,5,4,3,2};
         int soma =0;
         for(int i=0; i<multiplicador.length; i++)
         {
            soma = soma + multiplicador[i]*Character.digit(cpf.charAt(i), 10);
         }
         int resto = soma % 11;
         
         //primeiroDigito=(resto<2)?0:11-resto;
         
         if (resto<2)primeiroDigito=0;
         else primeiroDigito=11-resto;
      
         
         if (primeiroDigito==Character.digit(cpf.charAt(9),10))
            return true;
         else
            return false;
      
      
      }//fim do metodoprimeiroDigito
   	
      public static boolean verificarSegundoDigito(String cpf)
      {
      
         int segundoDigito;
         int multiplicador[]={11,10,9,8,7,6,5,4,3,2};
         int soma =0;
         for(int i=0; i<multiplicador.length; i++)
         {
            soma = soma + multiplicador[i]*Character.digit(cpf.charAt(i), 10);
         }
         int resto = soma % 11;
         if (resto<2)segundoDigito=0;
         else segundoDigito=11-resto;
      
         if (segundoDigito==Character.digit(cpf.charAt(10),10))
            return true;
         else
            return false;
      
      }//fim do segundo digito
   	
      public static String limpaString(String inicial)
      {
         String limpa="";
         for (int i=0; i<inicial.length();i++)
         {
            if (Character.isDigit(inicial.charAt(i)))
               limpa = limpa + inicial.charAt(i);
         }
      
         while (limpa.length()<11)
         {
            limpa="0"+limpa;
         }
         return limpa;
      		
      }//fim do metodo limpaString
   
   	
   
   }//fim da classe