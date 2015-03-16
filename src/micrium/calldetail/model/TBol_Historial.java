package micrium.calldetail.model;

import java.io.Serializable;
import java.sql.Date;

public class TBol_Historial implements Serializable {
	private static final long serialVersionUID = 1L;

	private String Cod_Ticket;
	private String Contrato;
	private String Linea;
	private Date Fecha_Inicial;
	private Date Fecha_Final;
	private String tipo_solicitud;
	private String periodicidad;
	private Date Fecha_Ejecucion;
	private String Hash;
	private String Estado;
	private String Codigo_Detalle;
	private String Descripcion;
	private String Usuario_Creacion;
	private String Usuario_Modificacion;
	private String Usuario_Eliminacion;
	private Date Fecha_Creacion;
	private Date Fecha_Modificacion;
	private Date Fecha_Eliminacion;	
	

	public TBol_Historial() {
	}


	
	public String getCod_Ticket() {
		return Cod_Ticket;
	}



	public void setCod_Ticket(String cod_Ticket) {
		Cod_Ticket = cod_Ticket;
	}







	public String getPeriodicidad() {
		return periodicidad;
	}



	public void setPeriodicidad(String periodicidad) {
		this.periodicidad = periodicidad;
	}



	public Date getFecha_Ejecucion() {
		return Fecha_Ejecucion;
	}



	public void setFecha_Ejecucion(Date fecha_Ejecucion) {
		Fecha_Ejecucion = fecha_Ejecucion;
	}



	public Date getFecha_Inicial() {
		return Fecha_Inicial;
	}



	public void setFecha_Inicial(Date fecha_Inicial) {
		Fecha_Inicial = fecha_Inicial;
	}



	public Date getFecha_Final() {
		return Fecha_Final;
	}



	public void setFecha_Final(Date fecha_Final) {
		Fecha_Final = fecha_Final;
	}



	public String getTipo_solicitud() {
		return tipo_solicitud;
	}



	public void setTipo_solicitud(String tipo_solicitud) {
		this.tipo_solicitud = tipo_solicitud;
	}



	public String getHash() {
		return Hash;
	}



	public void setHash(String hash) {
		Hash = hash;
	}



	public String getEstado() {
		return Estado;
	}



	public void setEstado(String estado) {
		Estado = estado;
	}






	public String getCodigo_Detalle() {
		return Codigo_Detalle;
	}



	public void setCodigo_Detalle(String codigo_Detalle) {
		Codigo_Detalle = codigo_Detalle;
	}



	public String getContrato() {
		return Contrato;
	}



	public void setContrato(String contrato) {
		Contrato = contrato;
	}



	public String getLinea() {
		return Linea;
	}



	public void setLinea(String linea) {
		Linea = linea;
	}



	public String getDescripcion() {
		return Descripcion;
	}



	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}



	public String getUsuario_Creacion() {
		return Usuario_Creacion;
	}


	public void setUsuario_Creacion(String usuario_Creacion) {
		Usuario_Creacion = usuario_Creacion;
	}


	public String getUsuario_Modificacion() {
		return Usuario_Modificacion;
	}


	public void setUsuario_Modificacion(String usuario_Modificacion) {
		Usuario_Modificacion = usuario_Modificacion;
	}


	public String getUsuario_Eliminacion() {
		return Usuario_Eliminacion;
	}


	public void setUsuario_Eliminacion(String usuario_Eliminacion) {
		Usuario_Eliminacion = usuario_Eliminacion;
	}


	public Date getFecha_Creacion() {
		return Fecha_Creacion;
	}


	public void setFecha_Creacion(Date fecha_Creacion) {
		Fecha_Creacion = fecha_Creacion;
	}


	public Date getFecha_Modificacion() {
		return Fecha_Modificacion;
	}


	public void setFecha_Modificacion(Date fecha_Modificacion) {
		Fecha_Modificacion = fecha_Modificacion;
	}


	public Date getFecha_Eliminacion() {
		return Fecha_Eliminacion;
	}


	public void setFecha_Eliminacion(Date fecha_Eliminacion) {
		Fecha_Eliminacion = fecha_Eliminacion;
	}

	


/*	@Override
	public String toString() {
		return "{correoId:" + correoId + ", tipoAdjunto:" + tipoAdjunto + ", adjunto:" + adjunto + ", asunto:" + asunto + ", destTo:" + destTo
				+ ", destCc:" + destCc + ", fecha:" + fecha + ", hash:" + hash + ", mensaje:" + mensaje + ", programado:" + programado + ", enviado:"
				+ enviado + ", pendiente:" + pendiente + ", detalleId:" + detalleId + "}";
	}*/

}