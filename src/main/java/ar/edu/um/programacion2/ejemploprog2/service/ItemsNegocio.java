package ar.edu.um.programacion2.ejemploprog2.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import ar.edu.um.programacion2.ejemploprog2.domain.Item;
import ar.edu.um.programacion2.ejemploprog2.domain.Negocio;



@Service
public class ItemsNegocio {

public List<Item> menu (Negocio negocio){
		
		Item itemaux = new Item(); 			//Creo objeto tipo MensajePublico 
		
		List<Item> resultado = new ArrayList<Item>();	  
		
		List<Item> todos = Item.findAllItems();
		
		int contador = todos.size();
		Long m1=null;
		
		for(int i = 0; i < contador; i++){
			
			itemaux = todos.get(i);			//Leo mensajes 1 por 1 

			m1 = itemaux.getNegocio().getId();

				if(m1.equals(negocio.getId())){
						resultado.add(itemaux);
				}
			}
		
			
		if(resultado.size() > 0){		
			return resultado;
		}else{
			itemaux.setNombre("ERRRROORRRR! EN EL RETORNO DEL SERVICIO!!");
			resultado.add(itemaux);
			return resultado;
		}
	}
	

}
