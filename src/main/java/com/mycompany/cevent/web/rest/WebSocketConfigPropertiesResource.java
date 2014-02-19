package com.mycompany.cevent.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.codahale.metrics.annotation.Timed;
import com.mycompany.cevent.config.WebSocketConfigProperties;

/**
 * REST controller for getting web socket properties.
 */
@RestController
@RequestMapping("/app")
public class WebSocketConfigPropertiesResource {

	private final Logger log = LoggerFactory
			.getLogger(WebSocketConfigPropertiesResource.class);

	@Autowired
	private WebSocketConfigProperties webSocketConfigProperties;

	/**
	 * GET /rest/wsport -> get the server websocket port.
	 */
	@RequestMapping(value = "/rest/wsport", method = RequestMethod.GET, produces = "application/json")
	@Timed
	public int getWsport() {
		log.debug("REST request to get ws port");
		return webSocketConfigProperties.getPort();
	}
}
