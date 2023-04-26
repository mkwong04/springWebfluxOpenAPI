package testm.controller;

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
import testm.model.Fish;
import testm.model.FishOrder;
import testm.model.FishOrderResult;

@RestController
@RequestMapping("/fishes")
@Tag(name = "Fish", description = "Fish Service API")
public class FishController {

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
		//TODO: replace with repository/service layer
		Fish[] fishes = new Fish[] {
									new Fish("X1","Tiger Fish",10,100.0),
									new Fish("Y1","Lion Fish", 9, 99.9)
		};
		
		return Flux.fromArray(fishes);
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
