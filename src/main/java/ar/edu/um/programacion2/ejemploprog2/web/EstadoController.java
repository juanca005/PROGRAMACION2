package ar.edu.um.programacion2.ejemploprog2.web;
import ar.edu.um.programacion2.ejemploprog2.model.Estado;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/estadoes")
@Controller
@RooWebScaffold(path = "estadoes", formBackingObject = Estado.class)
public class EstadoController {
}
