package by.azarenko.controller;

import by.azarenko.model.Dsp;
import by.azarenko.services.DspService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class DspController {
    private DspService dspService;
    private int currentPage = 0;
    private String sort = "dsp";

    @Autowired(required = true)
    @Qualifier(value = "dspService")
    public void setDspService(DspService dspService) {
        this.dspService = dspService;
    }

    @RequestMapping(value = "dsp", method = RequestMethod.GET)
    public String dspMap(Model model) {
        sort = "dsp";
        model.addAttribute("dsp", new Dsp());
        List<Dsp> dsp = this.dspService.dspMap();
        model.addAttribute("dspMap",this.dspService.dspMap());
        return "dsp";
    }

    @RequestMapping(value = "/dsp/add", method = RequestMethod.POST)
    public String addDsp(@ModelAttribute("dsp") Dsp dsp) {
        if (dsp.getNumder() == 0) {
            this.dspService.add(dsp);
        } else {
            this.dspService.update(dsp);
        }
        return "redirect:/dsp";
    }

    @RequestMapping("/remove/{number}")
    public String removeDsp(@PathVariable("number") int number) {
        this.dspService.remove(number);
        return "redirect:/dsp";
    }

    @RequestMapping("/edit/{number}")
    public String editDsp(@PathVariable("number") int number, Model model) {
        model.addAttribute("dsp", this.dspService.getDspByNumber(number));
        model.addAttribute("dspMap", this.dspService.dspMap());

        return "dsp";
    }

    @RequestMapping("/dspDate/{number}")
    public String dspDate(@PathVariable("number") int number, Model model) {
        model.addAttribute("dsp", this.dspService.getDspByNumber(number));
        return "dsp";
    }


    private void setPaging(Integer page, Model model, List<Dsp> dsps) {
        PagedListHolder<Dsp> pagedListHolder = new PagedListHolder<>(dsps);
        pagedListHolder.setPageSize(10);

        model.addAttribute("maxPages", pagedListHolder.getPageCount());

        model.addAttribute("currentsort", sort);

        if (page == null || page < 1 || page > pagedListHolder.getPageCount())
            page = 1;

        model.addAttribute("page", page);
        currentPage = page;

        pagedListHolder.setPage(page - 1);
        model.addAttribute("dspMap", pagedListHolder.getPageList());
    }
}
