
Select	MIN (salario) as MIN_SALARIO,
		MAX (salario) as MAX_SALARIO
		from Empregado;

Select	COUNT(1) as TotalEmpregados,
		COUNT(Distinct Cargo) as TotalCargos
	From Empregado;
		

Select Cargo, COUNT(1) as Total
From Empregado
Group by Cargo;

Select Cargo, IDGerente, COUNT(1) as Total
From Empregado
Group by Cargo, IDGerente;


Select CArgo,COUNT(1) as Total
	From Empregado
	Group by Cargo
	Having Count(1) > 1;


Select	NomeEmpregado, DataAdmissao, 
		DATEDIFF(Month, DataAdmissao, getDate()) MesesTrabalho
		From Empregado;


Select	IDAssociado, 
		Nome,
		CASE when sexo = 'F' then 'Feminino'
		   	 When sexo = 'M' then 'Masculino'
				else 'sei lá'
		End Genero
	From associado;

Select	a.Nome as NomeAssociado,
		c.Nome as NomeCidade	
	From Associado a
	INNER JOIN Cidade c ON c.IDCidade = a.IDCidade;


Select * from Cidade;

Select * from Associado;


Select IDCidade, Nome
	From Cidade e
	Where EXISTS (Select 1 
					From Associado a
					Where a.IDAssociado = e.IDCidade)
