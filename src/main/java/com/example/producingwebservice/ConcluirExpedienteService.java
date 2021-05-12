package com.example.producingwebservice;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;


@Component
public class ConcluirExpedienteService {
	private static final Map<String, Object> respuesta = new HashMap<>();

	@PostConstruct
	public void initData() {

	}

}
