package testm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import reactor.core.publisher.Flux;
import testm.data.repository.CatalogReactiveRepository;
import testm.model.Catalog;

@RestController
@RequestMapping("/catalogues")
@Tag(name = "Catalog", description = "Catalog API")
public class CatalogController {
	
	@Autowired
	private CatalogReactiveRepository catalogRepo;

	@Operation(summary="List catalogues")
	@ApiResponses(value = {
	                       @ApiResponse(responseCode="200",
	                    		        content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, 
	                    		                            array = @ArraySchema(schema = @Schema(implementation = Catalog.class)))
	                    		                  }
	                    		   		)
	                       })
	@GetMapping()
	public Flux<Catalog> getCatalogues(){
		Flux<testm.data.model.Catalog> dbResults = catalogRepo.findAllCatalog();
		//TODO: replace with repository/service layer
//		Catalog[] catalogues = new Catalog[] {
//								new Catalog("list","fish","/fishes"),
//								new Catalog("sell","fish","/fishes/sell"),
//								new Catalog("buy","fish","fishes/buy")};
//		return Flux.fromArray(catalogues);
		return dbResults.map(db -> new Catalog(db.getAction(),db.getType(),db.getUri()));
		
		
	}
	
}
