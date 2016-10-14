

Select * From Empregado;

Select * from Departamento

--7
Select	e.NomeEmpregado as NomeEmpregado, 
		g.NomeEmpregado as Gerente,
		--d.IDDepartamento,
		Empregado.IDDepartanento,
		Departamento.IDDepartamento as NomeDepartamento 
	From Empregado e
	LEFT join Empregado g  on g.IDGerente = e.IDEmpregado 
	Left join Departamento d on d.IDDepartamento = e.IDDepartamento
	Inner join Departamento on Empregado.IDDeparmanto = Departamento.IDDepartamento

Begin Transaction
ROLLBack

--8 
Select * into CopiaEmpregado from Empregado;
Select *  from CopiaEmpregado
Select * from Departamento

Alter table CopiaEmpregado add
			constraint FK_IDDepartamento 
						foreign key (IDDepartamento) 
						references Departamento (IDDepartamento)

Begin Transaction
RollBack

update CopiaEmpregado
	set Salario = Salario + (Salario * 0.145)
	where IDDepartamento = 10




