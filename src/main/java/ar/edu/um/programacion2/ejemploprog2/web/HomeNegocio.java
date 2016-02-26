package ar.edu.um.programacion2.ejemploprog2.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.roo.addon.web.mvc.controller.finder.RooWebFinder;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ar.edu.um.programacion2.ejemploprog2.domain.Item;
import ar.edu.um.programacion2.ejemploprog2.domain.Negocio;
import ar.edu.um.programacion2.ejemploprog2.service.ItemsNegocio;;


@RequestMapping("/homenegocio/")
@RooWebFinder


@Controller
public class HomeNegocio {
	@Autowired ItemsNegocio itemss;
	
	@RequestMapping(method = RequestMethod.POST, value = "{id}")
    public void post(@PathVariable Long id, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET, produces = "text/html")
    public String home(Model uiModel, HttpServletRequest request, HttpServletResponse response) {

    	
    	//usuario request
    	//Usuario usuarioAux = new Usuario();
    	
    	
    	//buscarnegocio
    /*	ArrayList<Item> menu = new ArrayList<Item>();
    	Negocio negocio1 = new Negocio();
		Long id = (long) 1;
		negocio1= Negocio.findNegocio(id);
    	String nya = "jose";
        //TypedQuery<Negocio> negocio = Negocio.findNegociosByNyaEquals(nya);
         
                
    	
    	menu = itemss.menu(negocio1);
		//TypedQuery<Item> itemss = Item.findItemsByNegocio(negocio1);
		
		
		uiModel.addAttribute("menu",menu);
		uiModel.addAttribute("negocio", negocio1.getNya());
		//String elnombre= "hola puto";
    	uiModel.addAttribute("string", nya);
    	
		*/
    	
			
        return "homenegocio/home";	
        
        

    }
    
    @RequestMapping
    public String index() {
        return "homenegocio/index";
    }
    
    
   
}
