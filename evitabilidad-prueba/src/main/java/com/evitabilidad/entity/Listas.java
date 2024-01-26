package com.evitabilidad.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "LISTAS")
public class Listas {

	@Id
	@Column(name = "ID_EST")
	private Integer idEst;
		
	@Column(name = "REGIONAL") 
	private String regional; 

	@Column(name = "ZONAL")
	private String zonal;
	
	@Column(name = "PACIENTE_RETOMADO")
	private String paciente_retomado;

	@Column(name = "FECHA_DE_RETOMA")
	private LocalDate fechaDeRetoma;
	
	@Column(name = "OPORTUNIDAD_CITA")
	private String oportunidadCita;
	
	@Column(name = "IPS_RETOMA")
	private String ips_retoma;
	
	@Column(name = "SERVICIO_O_ESPECIALIDAD_DE_RETOMA")
	private String servicioEspecialidadDeRetoma;
	
	@Column(name = "RETOMA_EFECTIVA")
	private String retomaEfectiva;
	
	@Column(name = "USUARIO_IDENTIFICADO_PROGRAMA")
	private String usuarioIdentificadoPrograma;
	
	@Column(name = "CAUSALES_ASOCIACION_HOSPI_EVI_1") 
	private String causalesAsociacionHospiEvi_1; 
	
	@Column(name = "CAUSALES_ASOCIACION_HOSPI_EVI_2") 
	private String causalesAsociacionHospiEvi_2; 
	
	@Column(name = "CAUSALES_ASOCIACION_HOSPI_EVI_3") 
	private String causalesAsociacionHospiEvi_3; 
	
	@Column(name = "CAUSA_DE_NO_RETOMA")
	private String causaDeNoRetoma;
	
	@Column(name = "OBSERVACIONES")
	private String observaciones;
	
	@Column(name = "REGISTRO_HOSPITALIZACION")
	private String registroHospitalizacion;
	
	@Column(name = "NUMERO_DE_CONTACTO")
	private String numeroDeContacto;

	public Integer getIdEst() {
		return idEst;
	}

	public void setIdEst(Integer idEst) {
		this.idEst = idEst;
	}

	public String getRegional() {
		return regional;
	}

	public void setRegional(String regional) {
		this.regional = regional;
	}

	public String getZonal() {
		return zonal;
	}

	public void setZonal(String zonal) {
		this.zonal = zonal;
	}

	public String getPaciente_retomado() {
		return paciente_retomado;
	}

	public void setPaciente_retomado(String paciente_retomado) {
		this.paciente_retomado = paciente_retomado;
	}

	public LocalDate getFechaDeRetoma() {
		return fechaDeRetoma;
	}

	public void setFechaDeRetoma(LocalDate fechaDeRetoma) {
		this.fechaDeRetoma = fechaDeRetoma;
	}

	public String getOportunidadCita() {
		return oportunidadCita;
	}

	public void setOportunidadCita(String oportunidadCita) {
		this.oportunidadCita = oportunidadCita;
	}

	public String getIps_retoma() {
		return ips_retoma;
	}

	public void setIps_retoma(String ips_retoma) {
		this.ips_retoma = ips_retoma;
	}

	public String getServicioEspecialidadDeRetoma() {
		return servicioEspecialidadDeRetoma;
	}

	public void setServicioEspecialidadDeRetoma(String servicioEspecialidadDeRetoma) {
		this.servicioEspecialidadDeRetoma = servicioEspecialidadDeRetoma;
	}

	public String getRetomaEfectiva() {
		return retomaEfectiva;
	}

	public void setRetomaEfectiva(String retomaEfectiva) {
		this.retomaEfectiva = retomaEfectiva;
	}

	public String getUsuarioIdentificadoPrograma() {
		return usuarioIdentificadoPrograma;
	}

	public void setUsuarioIdentificadoPrograma(String usuarioIdentificadoPrograma) {
		this.usuarioIdentificadoPrograma = usuarioIdentificadoPrograma;
	}

	public String getCausalesAsociacionHospiEvi_1() {
		return causalesAsociacionHospiEvi_1;
	}

	public void setCausalesAsociacionHospiEvi_1(String causalesAsociacionHospiEvi_1) {
		this.causalesAsociacionHospiEvi_1 = causalesAsociacionHospiEvi_1;
	}

	public String getCausalesAsociacionHospiEvi_2() {
		return causalesAsociacionHospiEvi_2;
	}

	public void setCausalesAsociacionHospiEvi_2(String causalesAsociacionHospiEvi_2) {
		this.causalesAsociacionHospiEvi_2 = causalesAsociacionHospiEvi_2;
	}

	public String getCausalesAsociacionHospiEvi_3() {
		return causalesAsociacionHospiEvi_3;
	}

	public void setCausalesAsociacionHospiEvi_3(String causalesAsociacionHospiEvi_3) {
		this.causalesAsociacionHospiEvi_3 = causalesAsociacionHospiEvi_3;
	}

	public String getCausaDeNoRetoma() {
		return causaDeNoRetoma;
	}

	public void setCausaDeNoRetoma(String causaDeNoRetoma) {
		this.causaDeNoRetoma = causaDeNoRetoma;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getRegistroHospitalizacion() {
		return registroHospitalizacion;
	}

	public void setRegistroHospitalizacion(String registroHospitalizacion) {
		this.registroHospitalizacion = registroHospitalizacion;
	}

	public String getNumeroDeContacto() {
		return numeroDeContacto;
	}

	public void setNumeroDeContacto(String numeroDeContacto) {
		this.numeroDeContacto = numeroDeContacto;
	}

	
		
}
