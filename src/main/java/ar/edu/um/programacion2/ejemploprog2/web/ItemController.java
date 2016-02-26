package ar.edu.um.programacion2.ejemploprog2.web;
import ar.edu.um.programacion2.ejemploprog2.domain.Item;
import ar.edu.um.programacion2.ejemploprog2.domain.Negocio;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.roo.addon.web.mvc.controller.finder.RooWebFinder;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;
import java.util.ArrayList;
import java.util.List;
import org.gvnix.addon.web.mvc.annotations.jquery.GvNIXWebJQuery;

@RequestMapping("/items")
@Controller
@RooWebScaffold(path = "items", formBackingObject = Item.class)
@RooWebFinder
@RooWebJson(jsonObject = Item.class)
@GvNIXWebJQuery
public class ItemController {

    //AGREGAR
    @RequestMapping(method = RequestMethod.POST, headers = "Accept=application/json")
    public ResponseEntity<String> createFromJson(@RequestBody String json) {
        Item itemp = Item.fromJsonToItem(json);
        //Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        HttpHeaders headers = new HttpHeaders();
        //String userName = auth.getName();
        Long id = (long) 1;
        Negocio negocio = new Negocio();
        negocio = Negocio.findNegocio(id);
        itemp.setNegocio(negocio);
        itemp.persist();
        headers.add("Content-Type", "application/json");
        return new ResponseEntity<String>(headers, HttpStatus.CREATED);
    }

    //MODIFICAR
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT, headers = "Accept=application/json")
    public ResponseEntity<String> updateFromJson(@RequestBody String json, @PathVariable("id") Long id) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        //Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        Item item = Item.fromJsonToItem(json);
        Item anterior = Item.findItem(item.getId());
        anterior.setNombre(item.getNombre());
        if (anterior.merge() == null) {
            return new ResponseEntity<String>(headers, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<String>(headers, HttpStatus.OK);
    }

    /*
     @RequestMapping(value = "/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
     public ResponseEntity<String> updateFromJson1(@RequestBody String json, @PathVariable("id") Long id) {
     HttpHeaders headers = new HttpHeaders();
     headers.add("Content-Type", "application/json");
     Item item = Item.fromJsonToItem(json);
     Item anterior = Item.findItem(item.getId());
     anterior.setNombre(item.getNombre());
     if (anterior.merge() == null) {
     return new ResponseEntity<String>(headers, HttpStatus.NOT_FOUND);
     }
     return new ResponseEntity<String>(headers, HttpStatus.OK);
     }
     */
    //BORRAR
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
    public ResponseEntity<String> deleteFromJson(@PathVariable("id") Long id) {
        Item item = Item.findItem(id);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        if (item == null) {
            return new ResponseEntity<String>(headers, HttpStatus.NOT_FOUND);
        }
        item.remove();
        return new ResponseEntity<String>(headers, HttpStatus.OK);
    }

    //LISTAR
    //@SuppressWarnings({ "unchecked", "rawtypes" })
    @RequestMapping(headers = "Accept=application/json")
    @ResponseBody
    public ResponseEntity<String> listJson() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json; charset=utf-8");
        //Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        //String userName = auth.getName();
        List<Item> todos = new ArrayList<Item>();
        Negocio negocio1 = new Negocio();
        Long id = (long) 1;
        negocio1 = Negocio.findNegocio(id);
        todos = Item.findItemsByNegocio(negocio1).getResultList();
        return new ResponseEntity<String>(Item.toJsonArray(todos), headers, HttpStatus.OK);
    }
}
