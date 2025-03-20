package ru.otus.msa.hw_02_service.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.otus.msa.hw_02_service.dto.Health;

@RestController
public class HealthController {

	@GetMapping(value = "/health/")
	private Health getHeath() {
		return new Health("OK");
	}
}
