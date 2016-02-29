package ar.edu.um.programacion2.ejemploprog2.web;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/menucliente/**")
@Controller
public class Controlador1Cliente {

    @RequestMapping(method = RequestMethod.POST, value = "{id}")
    public void post(@PathVariable Long id, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    }

    @RequestMapping
    public String index() {
        return "menucliente/index";
    }

@RequestMapping(value = "/buscarproducto", method = RequestMethod.GET, produces = "text/html")
    public String buscarproducto() {
        return "menucliente/buscarproducto";
    }


@RequestMapping(value = "/comprarproducto", method = RequestMethod.GET, produces = "text/html")
    public String comprarproducto() {
        return "menucliente/comprarproducto";
    }



}
