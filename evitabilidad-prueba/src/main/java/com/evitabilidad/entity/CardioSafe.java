package com.evitabilidad.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "CARDIOSAFE")
public class CardioSafe {

	@Id
	@Column(name = "ID_ESTANCIA", insertable = false, updatable = false)
	private Integer idEstancia;

	@Column(name = "PRESTADOR_SERVICIO_HOSPITALARIO")
	private String prestadorServicioHospitalario;

	@Column(name = "NIT")
	private String nit;

	@Column(name = "TIPO_DE_IDENTIFICACION")
	private String tipoDeIdentificacion;	
	
	@Column(name = "NUMERO_DE_IDENTIFICACION")
	private String numeroDeIdentificacion;	
	
	@Column(name = "NOMBRES")
	private String nombres;
	
	@Column(name = "PLAN")
	private String plan;

	@Column(name = "IPS_PRIMARIA")
	private String ipsPrimaria;
	
	@Column(name = "CODIGO_HABILITACION_IPS_PRIMARIA")
	private String codigHabilitaciónIpsPrimaria;
	
	@Column(name = "GENERO")
	private String genero;
	
	@Column(name = "EDAD")
	private Integer edad;
	
	@Column(name = "TIPO_DE_EDAD")
	private String tipoDeEdad;
	
	@Column(name = "CURSO_DE_VIDA")
	private String cursoDeVida;
		
	@Column(name = "FECHA_DE_INGRESO_HOSPITALIZACION")
	private LocalDate fechaDeIngresoHospitalizacion;
	
	@Column(name = "FECHA_DE_EGRESO_HOSPITALIZACION")
	private LocalDate fechaDeEgresoHospitalizacion;
	
	@Column(name = "TOTAL_DIAS_HOSPITALIZACION")
	private Integer totaLdDiasHospitalizacion;
	
	@Column(name = "DESCRIPCION_DX_PRINCIPAL") 
	private String descripcionDxPrincipal; 
	 
	@Column(name = "CODIGO_CIE10_DX_2") 
	private String codigocCie10Dx2; 
	
	@Column(name = "DESCRIPCION_SEGUNDO_DX")
	private String descripcionSegundoDx;
	
	@Column(name = "CODIGO_CIE10_DX_3") 
	private String codigoCie10Dx3; 
	
	@Column(name = "DESCRIPCION_TERCER_DX")
	private String descripcionTercerDx;
	
	@Column(name = "DIAGNOSTICO_EVITABLE")
	private String diagnosticoEvitable;
	
	@Column(name = "POBLACION_COHORTES")
	private String poblacionCohortes;
	
	@Column(name = "CAUSALES_RUTA_PREHOSPITALARIA")
	private String causalesRutaPrehospitalaria;
	
	@Column(name = "CATEGORIA_CIE_10") 
	private String categoriaCie10; 
	
	@Column(name = "PATOLOGIA_DESCRIPCION_CIE")
	private String patologiaDescripcionCie;
	
	@Column(name = "GRUPO_DE_RIESGO")
	private String grupoDeRiesgo;
	
	@Column(name = "REHOSPITALIZACION")
	private String rehospitalizacion;
	
	@Column(name = "SEMANA")
	private String semana;
	
	@Column(name = "FECHA_DE_REPORTE")
	private LocalDate fechaDeReporte;
	
	@Column(name = "COSTO")
	private Integer costo;

	@ManyToOne
    @JoinColumn(name = "CODIGO_CIE10_DX_PPAL", referencedColumnName = "CODIGO_DE_LA_CIE_10")
    private Cie10Priorizados cie10Priorizados;

    @ManyToOne
    @JoinColumn(name = "ID_ESTANCIA", referencedColumnName = "ID_EST")
    private Listas listas;

	public Integer getIdEstancia() {
		return idEstancia;
	}

	public void setIdEstancia(Integer idEstancia) {
		this.idEstancia = idEstancia;
	}

	public String getPrestadorServicioHospitalario() {
		return prestadorServicioHospitalario;
	}

	public void setPrestadorServicioHospitalario(String prestadorServicioHospitalario) {
		this.prestadorServicioHospitalario = prestadorServicioHospitalario;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getTipoDeIdentificacion() {
		return tipoDeIdentificacion;
	}

	public void setTipoDeIdentificacion(String tipoDeIdentificacion) {
		this.tipoDeIdentificacion = tipoDeIdentificacion;
	}

	public String getNumeroDeIdentificacion() {
		return numeroDeIdentificacion;
	}

	public void setNumeroDeIdentificacion(String numeroDeIdentificacion) {
		this.numeroDeIdentificacion = numeroDeIdentificacion;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public String getIpsPrimaria() {
		return ipsPrimaria;
	}

	public void setIpsPrimaria(String ipsPrimaria) {
		this.ipsPrimaria = ipsPrimaria;
	}

	public String getCodigHabilitaciónIpsPrimaria() {
		return codigHabilitaciónIpsPrimaria;
	}

	public void setCodigHabilitaciónIpsPrimaria(String codigHabilitaciónIpsPrimaria) {
		this.codigHabilitaciónIpsPrimaria = codigHabilitaciónIpsPrimaria;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getTipoDeEdad() {
		return tipoDeEdad;
	}

	public void setTipoDeEdad(String tipoDeEdad) {
		this.tipoDeEdad = tipoDeEdad;
	}

	public String getCursoDeVida() {
		return cursoDeVida;
	}

	public void setCursoDeVida(String cursoDeVida) {
		this.cursoDeVida = cursoDeVida;
	}

	public LocalDate getFechaDeIngresoHospitalizacion() {
		return fechaDeIngresoHospitalizacion;
	}

	public void setFechaDeIngresoHospitalizacion(LocalDate fechaDeIngresoHospitalizacion) {
		this.fechaDeIngresoHospitalizacion = fechaDeIngresoHospitalizacion;
	}

	public LocalDate getFechaDeEgresoHospitalizacion() {
		return fechaDeEgresoHospitalizacion;
	}

	public void setFechaDeEgresoHospitalizacion(LocalDate fechaDeEgresoHospitalizacion) {
		this.fechaDeEgresoHospitalizacion = fechaDeEgresoHospitalizacion;
	}

	public Integer getTotaLdDiasHospitalizacion() {
		return totaLdDiasHospitalizacion;
	}

	public void setTotaLdDiasHospitalizacion(Integer totaLdDiasHospitalizacion) {
		this.totaLdDiasHospitalizacion = totaLdDiasHospitalizacion;
	}

	public String getDescripcionDxPrincipal() {
		return descripcionDxPrincipal;
	}

	public void setDescripcionDxPrincipal(String descripcionDxPrincipal) {
		this.descripcionDxPrincipal = descripcionDxPrincipal;
	}

	public String getCodigocCie10Dx2() {
		return codigocCie10Dx2;
	}

	public void setCodigocCie10Dx2(String codigocCie10Dx2) {
		this.codigocCie10Dx2 = codigocCie10Dx2;
	}

	public String getDescripcionSegundoDx() {
		return descripcionSegundoDx;
	}

	public void setDescripcionSegundoDx(String descripcionSegundoDx) {
		this.descripcionSegundoDx = descripcionSegundoDx;
	}

	public String getCodigoCie10Dx3() {
		return codigoCie10Dx3;
	}

	public void setCodigoCie10Dx3(String codigoCie10Dx3) {
		this.codigoCie10Dx3 = codigoCie10Dx3;
	}

	public String getDescripcionTercerDx() {
		return descripcionTercerDx;
	}

	public void setDescripcionTercerDx(String descripcionTercerDx) {
		this.descripcionTercerDx = descripcionTercerDx;
	}

	public String getDiagnosticoEvitable() {
		return diagnosticoEvitable;
	}

	public void setDiagnosticoEvitable(String diagnosticoEvitable) {
		this.diagnosticoEvitable = diagnosticoEvitable;
	}

	public String getPoblacionCohortes() {
		return poblacionCohortes;
	}

	public void setPoblacionCohortes(String poblacionCohortes) {
		this.poblacionCohortes = poblacionCohortes;
	}

	public String getCausalesRutaPrehospitalaria() {
		return causalesRutaPrehospitalaria;
	}

	public void setCausalesRutaPrehospitalaria(String causalesRutaPrehospitalaria) {
		this.causalesRutaPrehospitalaria = causalesRutaPrehospitalaria;
	}

	public String getCategoriaCie10() {
		return categoriaCie10;
	}

	public void setCategoriaCie10(String categoriaCie10) {
		this.categoriaCie10 = categoriaCie10;
	}

	public String getPatologiaDescripcionCie() {
		return patologiaDescripcionCie;
	}

	public void setPatologiaDescripcionCie(String patologiaDescripcionCie) {
		this.patologiaDescripcionCie = patologiaDescripcionCie;
	}

	public String getGrupoDeRiesgo() {
		return grupoDeRiesgo;
	}

	public void setGrupoDeRiesgo(String grupoDeRiesgo) {
		this.grupoDeRiesgo = grupoDeRiesgo;
	}

	public String getRehospitalizacion() {
		return rehospitalizacion;
	}

	public void setRehospitalizacion(String rehospitalizacion) {
		this.rehospitalizacion = rehospitalizacion;
	}

	public String getSemana() {
		return semana;
	}

	public void setSemana(String semana) {
		this.semana = semana;
	}

	public LocalDate getFechaDeReporte() {
		return fechaDeReporte;
	}

	public void setFechaDeReporte(LocalDate fechaDeReporte) {
		this.fechaDeReporte = fechaDeReporte;
	}

	public Integer getCosto() {
		return costo;
	}

	public void setCosto(Integer costo) {
		this.costo = costo;
	}

	public Cie10Priorizados getCie10Priorizados() {
		return cie10Priorizados;
	}

	public void setCie10Priorizados(Cie10Priorizados cie10Priorizados) {
		this.cie10Priorizados = cie10Priorizados;
	}

	public Listas getListas() {
		return listas;
	}

	public void setListas(Listas listas) {
		this.listas = listas;
	}		
}
