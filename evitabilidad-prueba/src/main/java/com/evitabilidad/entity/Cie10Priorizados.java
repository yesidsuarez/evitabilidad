package com.evitabilidad.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CIE10_PRIORIZADOS")
public class Cie10Priorizados {

	@Id
	@Column(name = "CODIGO_DE_LA_CIE_10") 
	private String codigoDeLaCie10; 

	@Column(name = "CATEGORIAS_PRINCIPALES")
	private String categoriasPrincipales;
	
	@Column(name = "DESCRIPCION_DE_CODIGOS")
	private String descripcionDeCodigos;
	
	@Column(name = "CONCEPTO_EVITABILIDAD_CONCURRENCIA")
	private String conceptoEvitabilidadConcurrencia;
	
	@Column(name = "EVITABILIDAD_PRIORIZADOS")
	private String evitabilidadPriorizados;
	
	@Column(name = "GRUPO_ETAREO")
	private String grupoEtareo;
	
	@Column(name = "GRUPO_DE_RIESGO_RESOLUCION_3202")
	private String grupodeRiesgoResolucion3202;

	public String getCodigoDeLaCie10() {
		return codigoDeLaCie10;
	}

	public void setCodigoDeLaCie10(String codigoDeLaCie10) {
		this.codigoDeLaCie10 = codigoDeLaCie10;
	}

	public String getCategoriasPrincipales() {
		return categoriasPrincipales;
	}

	public void setCategoriasPrincipales(String categoriasPrincipales) {
		this.categoriasPrincipales = categoriasPrincipales;
	}

	public String getDescripcionDeCodigos() {
		return descripcionDeCodigos;
	}

	public void setDescripcionDeCodigos(String descripcionDeCodigos) {
		this.descripcionDeCodigos = descripcionDeCodigos;
	}

	public String getConceptoEvitabilidadConcurrencia() {
		return conceptoEvitabilidadConcurrencia;
	}

	public void setConceptoEvitabilidadConcurrencia(String conceptoEvitabilidadConcurrencia) {
		this.conceptoEvitabilidadConcurrencia = conceptoEvitabilidadConcurrencia;
	}

	public String getEvitabilidadPriorizados() {
		return evitabilidadPriorizados;
	}

	public void setEvitabilidadPriorizados(String evitabilidadPriorizados) {
		this.evitabilidadPriorizados = evitabilidadPriorizados;
	}

	public String getGrupoEtareo() {
		return grupoEtareo;
	}

	public void setGrupoEtareo(String grupoEtareo) {
		this.grupoEtareo = grupoEtareo;
	}

	public String getGrupodeRiesgoResolucion3202() {
		return grupodeRiesgoResolucion3202;
	}

	public void setGrupodeRiesgoResolucion3202(String grupodeRiesgoResolucion3202) {
		this.grupodeRiesgoResolucion3202 = grupodeRiesgoResolucion3202;
	}

	
		
}
