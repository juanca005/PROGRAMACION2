// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package ar.edu.um.programacion2.ejemploprog2.web;

import ar.edu.um.programacion2.ejemploprog2.domain.Item;
import ar.edu.um.programacion2.ejemploprog2.domain.Negocio;
import ar.edu.um.programacion2.ejemploprog2.web.ItemController;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

privileged aspect ItemController_Roo_Controller_Finder {
    
    @RequestMapping(params = { "find=ByNegocio", "form" }, method = RequestMethod.GET)
    public String ItemController.findItemsByNegocioForm(Model uiModel) {
        uiModel.addAttribute("negocios", Negocio.findAllNegocios());
        return "items/findItemsByNegocio";
    }
    
    @RequestMapping(params = "find=ByNegocio", method = RequestMethod.GET)
    public String ItemController.findItemsByNegocio(@RequestParam("negocio") Negocio negocio, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, @RequestParam(value = "sortFieldName", required = false) String sortFieldName, @RequestParam(value = "sortOrder", required = false) String sortOrder, Model uiModel) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            final int firstResult = page == null ? 0 : (page.intValue() - 1) * sizeNo;
            uiModel.addAttribute("items", Item.findItemsByNegocio(negocio, sortFieldName, sortOrder).setFirstResult(firstResult).setMaxResults(sizeNo).getResultList());
            float nrOfPages = (float) Item.countFindItemsByNegocio(negocio) / sizeNo;
            uiModel.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            uiModel.addAttribute("items", Item.findItemsByNegocio(negocio, sortFieldName, sortOrder).getResultList());
        }
        return "items/list";
    }
    
}
