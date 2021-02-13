package util;

public class cliente {
      private String nome;  
	  private int    conta;
	  private double saldo;
	
	  public cliente() {
		}
	  
	  public cliente(String nome, int conta) {
			this.nome = nome;
			this.conta = conta;
		
		}
	  public cliente(String nome, int conta, double inicioDeposito) {
		this.nome = nome;
		this.conta = conta;
		deposito(inicioDeposito);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getConta() {
		return conta;
	}

	public double getSaldo() {
		return saldo;
	}  
	
	  
    public void  deposito(double deposito) {
        saldo += deposito;
    }
    public void saque(double saque) {
        saldo  -= saque + +5.0;
    }
   public String toString(){
	   return "Conta: "
		   +  conta
		   + ",Nome: "
		   + nome
		   + ",Saldo:R$ "
		   + String.format("%.2f",saldo);
		   
		  	   
   }
}
