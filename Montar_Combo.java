package facade;

import java.util.ArrayList;
import java.util.List;

public class Montar_Combo 
{

	 int contador;
	    Item I; //instância item
	    List<Item> ListaItens = new ArrayList<Item>(); //lista de objetos da classe item
	    
	    private String PratoPrincipal; 

	    Montar_Combo(String PratoPrincipal)
	    {
	        this.PratoPrincipal=PratoPrincipal;
	    }
	    
	    public void Adicionar(int codigo, String descricao, double preco)
	    {
	        I = new Item();
	        I.setCodigo(codigo);
	        I.setDescricao(descricao);
	        I.setPreco(preco);
	        ListaItens.add(I); //Add na lista
	    }
	    
	    public void MostraItens()
	    {
	        for(Item item: ListaItens)
	        {
	            System.out.println("Codigo: " + item.getCodigo() + "\t\tDescrição: " + item.getDescricao() + "\t\tPreço: R$ " + item.getPreco());
	        }
	    }

	    public String getPratoPrincipal() 
	    {
	        return PratoPrincipal;
	    }
	
}
