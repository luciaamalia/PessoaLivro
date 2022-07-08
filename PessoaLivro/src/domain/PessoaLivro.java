package domain;

public class PessoaLivro {

	public static void main(String[] args) {
		Pessoa[] p = new Pessoa[2];
		Livro[] l = new Livro[3];
		
		p[0] = new Pessoa("Pedro", 22, "M");
		p[1] = new Pessoa("Maria", 32, "F");
		
		l[0] = new Livro("As aventuras de Garfield", "José", 300, p[0]);
		l[1] = new Livro("Como saborear um sushi", "Pedro", 400, p[1]);
		l[2] = new Livro("O pequeno princípe", "Maria", 150, p[1]);
		
		
		l[0].abrir();
		l[0].folhear(12);
		l[0].avancarPag();
		System.out.println(l[1].detalhes());
		
		l[1].abrir();
		l[1].folhear(15);
		l[1].voltarPag();
		System.out.println(l[1].detalhes());
		
	}

}
