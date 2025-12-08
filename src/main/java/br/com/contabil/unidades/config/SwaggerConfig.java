package br.com.contabil.unidades.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(info = @Info(title = "Tabela de unidades do jogo.", 
description = "Selecionar tabela de unidades do jogo.",
contact = @Contact(name = "Davi de Moraes",
url = "http://contabil.com.br/", email = "contabil@gmail.com"),
license = @License(name = "MIT Licence")),
servers = @Server(url = "http://localhost:10092"))

@SecurityScheme(name = "Token",
scheme = "Bearer", type = SecuritySchemeType.HTTP,
in = SecuritySchemeIn.HEADER, bearerFormat = "JWT")
public class SwaggerConfig {

}