package br.com.mns.resultatec.milerp.controller.pricingtables;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PricingTables {

	@GetMapping("/pricing-tables")
    public String pricingTables() {
        return "pricing-tables";
    }
}
