CREATE TABLE IF NOT EXISTS Jugadors(
Id Tinyint Primary key,
Nom Varchar(30)
);



CREATE TABLE IF NOT EXISTS Partida(
	Id_partida Tinyint Primary Key,
	NumFilialAlpha Integer,
	NumFilialOmega Integer,
	NumFilialDelta Integer,
	NumFilialOmicron Integer,
	NumFilialBeta Integer,
	NumFilialGama Integer

);
CREATE TABLE IF NOT EXISTS Tiene(
    	Id Tinyint,
	Id_Partida Tinyint,
	NumeroAssocioAlpha Integer,
    	Primary Key(Id,Id_Partida),
	NumeroAssocioOmega Integer,
	NumeroAssocioDelta Integer,
	NumeroAssocioOmicron Integer,
	NumeroAssocioBeta Integer,
	NumeroAssocioGama Integer,
	NumMonedas Integer,Jugadors
	FOREIGN KEY ( Id) REFERENCES Jugadors (Id),
	FOREIGN KEY ( Id_Partida) REFERENCES Partida (Id_Partida)
    

);

