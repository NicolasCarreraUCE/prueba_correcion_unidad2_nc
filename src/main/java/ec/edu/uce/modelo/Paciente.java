package ec.edu.uce.modelo;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "paciente")
public class Paciente {

	@Column(name = "paci_id")
	private Integer id;
	@Column(name = "paci_cedula")
	private String cedula;
	@Column(name = "paci_nombre")
	private String nombre;
	@Column(name = "paci_apellido")
	private String apellido;
	@Column(name = "paci_fecha_nacimiento")
	private LocalDateTime fechaNacimiento;
	@Column(name = "paci_codigo_seguro")
	private String codigoSeguro;
	@Column(name = "paci_estatura")
	private Double estatura;
	@Column(name = "paci_peso")
	private Double peso;
	
	@Column(name = "paci_genero")
	private String genero;
	
	@OneToMany(mappedBy = "paciente")
	private List<CitaMedica> citaMedicas;
}
