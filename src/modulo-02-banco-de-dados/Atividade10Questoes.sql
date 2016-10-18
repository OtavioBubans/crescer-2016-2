

Select * from Pedido;

Select * from PedidoItem;

Select * from Produto;

Select * from ProdutoMaterial;


-- 1 Lista total pedidos m�s de setembro
Select IDPedido,
		DataPedido 
	From Pedido
	Where DataPedido between convert(datetime, '01/09/2016',103)
						and	convert(datetime, '30/09/2016', 103); 

Select count(1) as totalPedidos
	From Pedido
	Where DataPedido between convert(datetime, '01/09/2016',103)
						and	convert(datetime, '30/09/2016', 103)+.99999; 
		
	
-- 2 Lista dos produtos que utiliza o material com ID 15836					
 
 -- sem nome e apenas o ID
 Select IDProduto,
		IDMaterial	
	From ProdutoMaterial
	Where IDMaterial = 15836;


-- nome do Produto
Select IDProduto, Nome
	From Produto pro
	Where Exists (Select 1
					From ProdutoMAterial PM
					Where pm.IDProduto = pro.IDProduto
					And pm.IDMaterial = 15836)

create index IX_ProdutoMaterial_Material  on ProdutoMaterial (IDMaterial);


-- 3 Lista de todos clientes que tenha LTDA no nome ou raz�o social

Select * from Cliente; 

Select	IDCliente, Nome, 
		RazaoSocial 		
	From Cliente
	Where	RazaoSocial like '%LTDA%' 
		OR	Nome like '%LTDA%';	

/* 4 - Crie (insira) um novo registro na tabela de Produto, com as seguintes informa��es:
		Nome: Galocha Maragato
		Pre�o de custo: 35.67
		Pre�o de venda: 77.95
		Situa��o: A  
*/
	Select * From Produto;
	Begin Transaction
	RollBack

Insert into Produto
	(Nome, PrecoCusto, PrecoVenda, Situacao)
	values
	('Galocha Maragato', 35.67, 77.95, 'A')

Select Nome from Produto
Where Nome ='Galocha Maragato';


/*  5) Identifique e liste os produtos que n�o tiveram nenhum pedido, considere os relacionamentos no modelo de
dados, pois n�o h� relacionamento direto entre Produto e Pedido (ser� preciso relacionar PedidoItem).
Obs.: o produto criado anteriormente dever� ser listado (apenas este)
*/
Select * From PedidoItem;
Select * From Produto;

Select IDProduto,
		Nome as ProdutoSemNenhumPedido
	From Produto p
	Where Not exists (Select 1  
						from PedidoItem i
						Where p.IDProduto = i.IDProduto)

/* 6) Identifique qual o estado (coluna UF da tabela Cidade) possu� o maior n�mero de clientes (tabela Cliente), 
liste tamb�m qual o Estado possu� o menor n�mero de clientes.*/

Select * From Cidade
Select * From Cliente

Select 
			UF as Estado,
			IDCliente, Count(1) as NumeroClientes
		From Cliente c

		Inner join Cidade i on i.IDCidade = c.IDCidade
		Group by UF
		Order by NumeroClientes;
		

Select IDCidade, count(1) as TotalDeCidade
	From Cliente
	Group by IDCidade
Order by TotalDeCidade DESC	


Select UF, count (1) as totalUF
	from Cidade
	Group by UF


	

/*7) Alguns materiais est�o em falta no estoque, com isso alguns pedidos sofrer�o atraso na entrega. Abaixo mais
informa��es:
a. A lista de materiais que est�o em falta, s�o os seguintes:
		IDMaterial	Descricao
		14650		Frente de caixa #14650
		15703		Sistema de rastreabilidade #15703
		15836		Intranet #15836
		16003		Controle de permiss�es #16003
		16604		Frente de caixa #16604
		17226		Frente de caixa #17226

b. Liste os pedidos com produtos que precisam destes materiais, considere somente os pedidos que ser�o
entregues em outubro de 2016.
	i. Campos que devem ser exibidos: IDPedido, DataEntrega, ValorPedido, Quantidade de itens

c. Liste tamb�m os clientes destes pedidos, pois estes ser�o notificados pela �rea respons�vel.
*/







/* 8) Dentro da atual estrutura, cada produto � composto por 1 ou v�rios materiais (tabela ProdutoMaterial).
Identifique se existe algum produto sem material relacionado.
Obs.: o produto criado anteriormente dever� ser listado.*/Select * from ProdutoMaterialOrder by IDMaterial;

Select IDProduto,
		Nome as ProdutoSemMaterial
	From Produto p
	Where Not exists (Select 1  
						from ProdutoMaterial i
						Where p.IDProduto = i.IDProduto)


/*	
	9)Lista qual o primeiro nome mais popular entre os clientes, considere apenas o primeiro nome.
*/

select top 1 with ties Substring(Nome, 1, Charindex(' ', Nome) -1) as NomePopular,
			count(*) as NomeIgual
			from Cliente
			group by Substring(Nome, 1, Charindex(' ', Nome) -1)
			having count(*) > 1
			order by NomeIgual desc





/*			
10) Atualize a situa��o na tabela de Produto, considere as seguintes condi��es:
	Valor Condi��o
	F Produtos que est�o com materiais em falta no estoque conforme a lista na tabela 7.a
	Q Produtos que n�o est�o em falta, por�m que est�o sem pedidos nos �ltimos 2 meses.
	A Todos os demais registros.

*/