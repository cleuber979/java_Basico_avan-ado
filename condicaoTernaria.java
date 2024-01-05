#expressão condicional ternaria é estrutura opcional ao if e else 

# exemplos 

   #(2>4)? 50 : 80 =>  o valor de saida vai ser 80 por que 2>4 o que vale e o que esta depois de : resultado 80#
   
  class exercicioCalculoConta {
    public static void main(String[] args) {
        
	double preco = 24.5;
	double desconto ;
	
	#versão simplificada
	#double desconto = (preco <20.0) ? preco * 0.1 : preco * 0.05;
	
	
	if (preco <20.0){
		desconto = preco * 0.1;
	}else{
		desconto = preco * 0.05;
	}
	 System.out.println(desconto);
	
    }
}