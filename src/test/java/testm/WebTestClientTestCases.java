package testm;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.hasSize;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;

import testm.model.Catalog;

//start as spring boot test with random port (injected by local server port)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class WebTestClientTestCases {

	@Autowired
	private WebTestClient webTestClient;
	
	/**
	 * test using JsonPath approach
	 */
	@Test
	public void testGetCatalog() {
		//http GET with API endpoint uri
		webTestClient.get().uri("/catalogues")
		             .accept(MediaType.APPLICATION_JSON)
		             //trigger exchange
		             .exchange()
		             //test for response status ok
		             .expectStatus().isOk()
		             //convert body to BodyContentSpec
		             .expectBody()
		             .consumeWith(System.out::println)
		             //assert catalog return 
		             .jsonPath("$..name").value(hasSize(3))
		             .jsonPath("$..name").value(hasItems("list","sell","buy"));
	}
	
	/**
	 * test using mapped POJO from response body
	 */
	@Test
	public void testGetCatalog2() {
		//http GET with API endpoint uri
		webTestClient.get().uri("/catalogues")
		             .accept(MediaType.APPLICATION_JSON)
		             //trigger exchange
		             .exchange()
		             //test for response status ok
		             .expectStatus().isOk()
		             //convert body to List of Catalog POJO
		             .expectBodyList(Catalog.class)
		             .hasSize(3)
		             .value(l -> { 
		            	 hasItems(l, hasProperty("name", equalTo("list")));
		            	 hasItems(l, hasProperty("name", equalTo("buy")));
		            	 hasItems(l, hasProperty("name", equalTo("sell")));
		                 } );
	}
}
