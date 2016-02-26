package ar.edu.um.programacion2.ejemploprog2.web;
import ar.edu.um.programacion2.ejemploprog2.domain.Cliente;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.gvnix.addon.web.mvc.annotations.jquery.GvNIXWebJQuery;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;

@RequestMapping("/clientes")
@Controller
@RooWebScaffold(path = "clientes", formBackingObject = Cliente.class)
@GvNIXWebJQuery
@RooWebJson(jsonObject = Cliente.class)
public class ClienteController {
}
