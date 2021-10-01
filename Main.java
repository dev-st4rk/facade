package facade;

public class Main 
{
	//Professor, não julgue minha formatação de código, estou acostumado com C# kkkkkkkkkkk
	
	public static void main(String[] args) 
	{
       Combo cmb = new Combo("Beirute"); 
        cmb.add_item(1, "Sobremesa: Pastel de Belém", 50); //OBS: Os Valores são caros porque a loja é de aeroporto
        cmb.add_item(2, "Bebida: Coca-Cola sem açucar", 31);
        cmb.mostrar_itens(); 
        
    }
	
}
