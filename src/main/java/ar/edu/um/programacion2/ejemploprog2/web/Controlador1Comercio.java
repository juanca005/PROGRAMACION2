package ar.edu.um.programacion2.ejemploprog2.web;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ar.edu.um.programacion2.ejemploprog2.model.Comercio;
import ar.edu.um.programacion2.ejemploprog2.model.Producto;

@RequestMapping("/menucomercio/**")
@Controller
public class Controlador1Comercio {

    @RequestMapping(method = RequestMethod.POST, value = "{id}")
    public void post(@PathVariable Long id, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    }

    @RequestMapping
    public String index() {
        return "menucomercio/index";
    }


   @RequestMapping(value = "/cargarproducto", method = RequestMethod.GET, produces = "text/html")
    public String cargarproducto() {
        return "menucomercio/cargarproducto";
    }


@RequestMapping(value = "/formulario_metodo_1", method = RequestMethod.GET, produces = "text/html")
    public String formulario_metodo_1(@Valid Producto producto, BindingResult bindingResult, Model uiModel, HttpServletRequest request, HttpServletResponse response) {
        if (bindingResult.hasErrors()) {
            //Si la conversion da error entonces se llama de nuevo el formulario para corregir
        	uiModel.addAttribute("productoError", producto);
            return "menucomercio/cargarproducto";
        }
        // Como la conversion fue correcta vamos a grabar o persistir los datos en la base de datos.
        uiModel.asMap().clear();
        producto.persist();
        //Paso el objeto persona a la vista a traves de uiModel
        uiModel.addAttribute("productoOK", producto);
        //Indico que quiero acceder a la vista referenciada por "controla/personaResultadoOK"
        return "menucomercio/index";
    }






}
