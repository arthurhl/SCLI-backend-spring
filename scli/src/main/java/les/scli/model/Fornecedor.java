package les.scli.model;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"id"}) 
public class Fornecedor implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column()
	@NotBlank(message = "Nome obrigatório")
	private String nome;

	@Column(length=11)
	@NotBlank(message = "CPF obrigatório")
	@Size(min=11,max=11, message="CPF inválido")
	private String cpf;

	@Column()
	@NotBlank(message = "Uf obrigatório")
  	@Size(min = 2, max = 2, message = "Uf inválido")
	private String uf;

	@Column()
	@NotBlank(message = "Cidade obrigatório")
	private String cidade;

	@Column()
	@NotBlank(message = "Bairro obrigatório")
	private String bairro;

	@Column()
	@NotBlank(message = "Rua obrigatório")
	private String rua;
}
