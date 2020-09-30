package ExerciciosRelacionamentoEntreClasses;

class Teste {

	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.setNome("Leo");
		//contato.setEndereco("SP");
		
		//criar objeto endere�o
		Endereco end = new Endereco();
		end.setNomeRua("Street");
		end.setCep("01255-999");
		end.setCidade("S�o Paulo");
		end.setEstado("SP");
		end.setComplemento("n/a");
		
		Telefone tel = new Telefone();
		tel.setDdd("11");
		tel.setNumero("9999-9999");
		tel.setTipo("Celular");
		
		Telefone tel2 = new Telefone();
		tel.setDdd("11");
		tel.setNumero("8888-8888");
		tel.setTipo("Casa");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = tel;
		telefones[1] = tel2;
		
		contato.setEndereco(end);
		//contato.setTelefone(tel);
		contato.setTelefones(telefones);
		//Relacionamento telefone
		
		//Teste sa�do no console
		if(contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCep());
			System.out.println(contato.getNome());
			
		}
		//if(contato != null && contato.getTelefone() != null) {
	//		System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
			
	//	}
		if(contato != null && contato.getTelefones() != null) {
			for(Telefone i : contato.getTelefones()) {
				System.out.println(i);
				System.out.println(i.getDdd() + " " + i.getNumero());
			}
	
		}
	}

}
