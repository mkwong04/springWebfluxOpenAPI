package testm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import testm.data.repository.FishReactiveRepository;
import testm.model.Fish;
import testm.model.FishOrder;
import testm.model.FishOrderResult;

@RestController
@RequestMapping("/fishes")
@Tag(name = "Fish", description = "Fish Service API")
public class FishController {

	@Autowired
	private FishReactiveRepository repo;
	/**
	 * 
	 * @return
	 */
	@ApiResponses(value = {
            @ApiResponse(responseCode="200",
         		        content = {@Content(mediaType = "application/json", 
         		        					array = @ArraySchema(schema = @Schema(implementation = Fish.class)))
         		                  }
         		   		)
            })
	@GetMapping
	public Flux<Fish> getFishes(){
		Flux<testm.data.model.Fish> dbResults = repo.findAllFishes();
		
		return dbResults.map(result -> new Fish(result.getId(), 
												result.getName(), 
												result.getAvailable(), 
												result.getUnitPrice()));
	}
	
	/**
	 * 
	 * @param order
	 * @return
	 */
	@ApiResponses(value = {
            @ApiResponse(responseCode="200",
         		        content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, 
         		                            schema = @Schema(implementation = FishOrderResult.class))
         		                  }
         		   		)
            })
	@PostMapping(path="/buy", consumes= {MediaType.APPLICATION_JSON_VALUE})
	public Mono<FishOrderResult> buyFish(@RequestBody final FishOrder order){
		//TODO: validation
		FishOrderResult result = new FishOrderResult(order, "Success");
		return Mono.just(result);
		
	}
}
