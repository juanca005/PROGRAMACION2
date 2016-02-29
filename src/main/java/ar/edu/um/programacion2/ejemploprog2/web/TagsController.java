package ar.edu.um.programacion2.ejemploprog2.web;
import ar.edu.um.programacion2.ejemploprog2.model.Tags;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/tagses")
@Controller
@RooWebScaffold(path = "tagses", formBackingObject = Tags.class)
public class TagsController {
}
