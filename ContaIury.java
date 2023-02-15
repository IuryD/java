public class ContaIury{
	public static void main(String[] args) {
	Conta bradesco = new Conta();
		bradesco.setTitular("iury");
		bradesco.setSaldo(100);
		
		double valorSaque=50;
		bradesco.saca(valorSaque);
		
		double valorDeposito = 70;
		bradesco.deposita(valorDeposito);
		
		
			
		}
}


