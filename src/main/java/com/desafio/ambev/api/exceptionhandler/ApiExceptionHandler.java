package com.desafio.ambev.api.exceptionhandler;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.desafio.ambev.api.exceptionhandler.Erro.Campo;


@ControllerAdvice
public class ApiExceptionHandler extends ResponseEntityExceptionHandler {
	
	
	@Autowired
	private MessageSource messageSource;
	
	
	//para tratar os erros em geral 
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		
		List<Campo> campos = new ArrayList<Erro.Campo>();
		
		for (ObjectError error : ex.getBindingResult().getAllErrors() ) {
			
			//pode n�o ser um FildErros, tomar cuidado 
			String nome = ((FieldError) error).getField();
			String mensagem = messageSource.getMessage(error, LocaleContextHolder.getLocale());
			
			campos.add(new Erro.Campo(nome, mensagem));
		}
		
		
		Erro erro = new Erro();
		erro.setStatus(status.value());
		erro.setTitulo("Um ou mais campos inv�lidos.");
		erro.setDataHora(LocalDateTime.now());
		erro.setCampos(campos);
		
		return super.handleExceptionInternal(ex, erro, headers, status, request);
	}
	
	

}
