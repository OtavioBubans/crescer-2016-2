--1 - Empregados admitidos entre 1/05/1980 e 20/01/1982
	--exibir total de meses trabalhadosa até 31/12/2000

Select	NomeEmpregado,  
		DataAdmissao, 
		DateDiff(month, DataAdmissao, convert(datetime, '31/12/2000', 103) ) meses_trabalho 
		From   Empregado 
		Where  DataAdmissao between convert(datetime, '01/05/1980', 103)  
											and convert(datetime, '20/01/1982', 103) ;

--2 qual cargo tem mais empregados

Select top 1 WITH TIES cargo, Count(1) Total_Empregados
	From Empregado
	Group by cargo
	order by Total_empregados desc;


--3 Listar a quantidade de cidades agrupada por estado

Select UF, COUNT(1) as QuantidadeCidada
	From Cidade
	group by UF; 



--4 Listar cidade com mesmos nome e UF
Select Nome, uf, count(1) Total
	From Cidade 
	 Group by Nome, UF
	 having count(1) > 1

-- 5 identificar qual deve ser o proximo ID da tabela associado
	Select isnull (max(IDassociado) + 1,0) as Proximo_ID 
	From Associado



--6 listar nome empregado, salario e percentual  

Select NomeEmpregado, 
       Salario, 
     Case when Salario <= 1164 then 0 
          when Salario <= 2336 then 15 
      else 27.5 
     End Perc_IR 
From   Empregado; 
