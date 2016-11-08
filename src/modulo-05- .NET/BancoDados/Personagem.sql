	Create table Personagem(
	IDPersonagem	int Identity NOT NULL, 
	Imagem			varchar(100),
	Nome			varchar(100),
	DataNascimento	date,
	Altura			int,
	Peso			decimal(5,2),
	Origem			varchar(50),
	Golpes			varchar(50)
	
	Constraint PK_Personagem Primary key(IDPersonagem)
	);

	drop table Personagem

	INSERT INTO Personagem Values ('http//upload.wikimedia.org/wikipedia/en/e/e5/Ryu_TvC.png',
	'Ryu', 
	CONVERT(datetime, '19/03/1996',103),
	 190,
	 90.5,
	 'EUA',
	 'Raduken'
	 );




