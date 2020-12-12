# QualeReciclagem

Fabricante
	-nome
	-produtos[]

Produto
	-enum de materiais
	-nome
	-marca(fabricante)
	-categoria
	-materiais de cada parte da embalagem(HashMap)
	-código

Cadastro
	-Lista de Produtos(Set)
	-Lista de Fabricantes(Set)

	*cadastrar produto(se o fabricante do produto não existe, cria um novo)
	*pesquisar produto(por nome e por código) - retorna o produto encontrado
	*pesquisar fabricante(por nome) - retorna o fabricante encontrado

"Interface" de Usuário
	*recebe entrada do teclado e chama os métodos adequados do cadastro. Se o usuário desejar sair, lança alguma exceção

Main
	*chama a interface
