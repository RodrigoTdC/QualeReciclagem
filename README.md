# QualeReciclagem

**Fabricante:**
```
	- nome
	- produtos[]
```

**Produto:**
```
	- enum de materiais
	- nome
	- marca(fabricante)
	- categoria
	- materiais de cada parte da embalagem(HashMap)
	- código
```

**Cadastro:**
```
	- lista de Produtos(Set)
	- lista de Fabricantes(Set)
```
```
	* Cadastrar produto(se o fabricante do produto não existe, cria um novo)
	* Pesquisar produto(por nome e por código) - retorna o produto encontrado
	* Pesquisar fabricante(por nome) - retorna o fabricante encontrado
```

**"Interface" de Usuário:**
```
	* Recebe entrada do teclado e chama os métodos adequados do cadastro. Se o usuário desejar sair, lança alguma exceção
```

**Main:**
```
	* Chama a interface
```
