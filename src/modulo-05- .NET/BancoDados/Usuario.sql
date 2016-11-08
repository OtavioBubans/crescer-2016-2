Create Table Usuario(
	IDUsuario	int IDENTITY NOT NULL,
	Login		varchar(30) NOT NULL,
	Senha		varchar(30)NOT NULL,
	Email		varchar(30) NOT NULL

	CONSTRAINT PK_Usuario primary key(IDUsuario)
);

Insert into Usuario values('otavio','otavio123', 'otaviobubans@hotmail.com');

Select * from Usuario;

