package br.com.dhecastro.aplicacaoarvore.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.dhecastro.aplicacaoarvore.model.Arvore;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api(value="REST Aplicacao Arvore")
@RestController
@RequestMapping("/aplicacaoarvore")
public class AplicacaoArvoreResource {
	
	private Arvore arvore;
	 
	@ApiOperation(value="Retorna a soma dos nos subsequentes de uma arvore binaria")
    @RequestMapping(value = "/calcula/{chavebusca}", method = RequestMethod.GET)
    public ResponseEntity<String> calcularNosSubsequentes(@ApiParam("numero do no de partida") @PathVariable("chavebusca") int chavebusca) {
    
	    arvore = new Arvore();
	    arvore.insere(10);
	    arvore.insere(20);
	    arvore.insere(30);
	    arvore.insere(40);
	    arvore.insere(35);
	    arvore.insere(60);
	    arvore.insere(70);
	    arvore.insere(80);
	    arvore.insere(90);
	    arvore.insere(100);
	    arvore.posOrdem(arvore.buscarNo(chavebusca));
		
	    return new ResponseEntity<String>("SOMA:::::::::::" + String.valueOf(arvore.soma - chavebusca), HttpStatus.OK);
    } 
}
