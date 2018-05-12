package com.archit.eventmanagement.controllers;

import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.RequestMapping;

// tells Spring that this is a Controller
// & it should be the part of spring data rest
// Unlike @Controller or @RestController, it will derive the base path and
// becomes the part of spring data application.
@RepositoryRestController
@RequestMapping("/events")
public class EventKickOffController {
}
