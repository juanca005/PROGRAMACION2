package ar.edu.um.programacion2.ejemploprog2.web;
import ar.edu.um.programacion2.ejemploprog2.domain.Negocio;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;
import org.gvnix.addon.web.mvc.annotations.jquery.GvNIXWebJQuery;

@RequestMapping("/negocios")
@Controller
@RooWebScaffold(path = "negocios", formBackingObject = Negocio.class)
@RooWebJson(jsonObject = Negocio.class)
@GvNIXWebJQuery
public class NegocioController {
}
