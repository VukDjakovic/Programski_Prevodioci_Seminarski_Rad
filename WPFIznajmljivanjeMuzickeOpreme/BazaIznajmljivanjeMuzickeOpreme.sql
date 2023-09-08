create database BazaIznajmljivanjeMuzickeOpreme
go
use BazaIznajmljivanjeMuzickeOpreme
go

create table Oprema(
ID_opreme int primary key identity(0,1) not null,
Tip nvarchar(255) not null,
Proizvodjac nvarchar(255) not null,
Naziv nvarchar(255) not null,
Cena int not null,
Datum_iznajmljivanja date,
Datum_vracanja date
)