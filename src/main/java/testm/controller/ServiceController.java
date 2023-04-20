package testm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;
import reactor.core.publisher.Flux;
import testm.model.Catalog;

@RestController
@RequestMapping("/services")
@Tag(name = "service", description = "service API")
public class ServiceController {

	@GetMapping("/catalogues")
	public Flux<Catalog> getCatalogues(){
		//TODO: replace with repository/service layer
		Catalog[] catalogues = new Catalog[2];
		catalogues[0] = new Catalog("sell","fish");
		catalogues[1] = new Catalog("buy","fish");
		
		return Flux.fromArray(catalogues);
	}
}
