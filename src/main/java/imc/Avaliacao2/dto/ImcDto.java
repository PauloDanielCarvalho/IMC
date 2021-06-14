package imc.Avaliacao2.dto;





public class ImcDto {
	private double peso;
	private double altura;
	private double imc;
	private String resultado;
	
	public ImcDto(double altura,double peso) {	
		this.altura=altura;	
		this.peso=peso;
	}
	
	
	public ImcDto() {
	}


	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void setImc(double imc) {
		this.imc = peso/(altura*altura);
	}

	public String getResultado() {
	      if (imc <= 19)
	         return "Abaixo do Peso";
	      else
	         if (imc <= 25)
	            return "Peso ideal";
	         else
	            if (imc <= 30)
	               return "Acima do Peso";
	            else
	               if (imc <= 35)
	                  return "Obesidade Leve";
	               else
	                  return "Obesidade"; 
	      
	}
	
}
