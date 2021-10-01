package facade;

public class Combo 
{

	Montar_Combo mc;

	    //Método Construtor
	    public Combo(String PratoPrincipal) 
	    {
	    	mc = new Montar_Combo(PratoPrincipal);
	    }
	    
	    public void add_item(int codigo, String descricao, double preco)
	    {
	    	mc.Adicionar(codigo,descricao,preco);
	    } 
	    
	  //Mostrar itens combo
	    public void mostrar_itens()
	    {
	    	mc.MostraItens();
	        System.out.println("\n");
	    }
	    
	
}
