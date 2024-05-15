USE master
GO

DROP DATABASE IF EXISTS Condominium_Rental_Management
CREATE DATABASE Condominium_Rental_Management
GO

USE Condominium_Rental_Management
GO

DROP TABLE IF EXISTS UserApp
CREATE TABLE UserApp (
	Id_User INT PRIMARY KEY IDENTITY,
	CI_Card VARCHAR(12) UNIQUE,
	Phone VARCHAR(10) UNIQUE,
	Pass VARCHAR(50),
	[Level] NVARCHAR(50),
	Fullname NVARCHAR(50),
	Gender NVARCHAR(3),
	Dob DATE,
	[Address] NVARCHAR(50),
)
GO

DROP TABLE IF EXISTS Apartment
CREATE TABLE Apartment (
	Id_Apt INT PRIMARY KEY IDENTITY,
	Number_Apt INT UNIQUE,
	[Status] BIT,
)
GO


DROP TABLE IF EXISTS [Contract]
CREATE TABLE [Contract] (
	Id_Contract INT PRIMARY KEY IDENTITY,
	Id_User INT,
	Id_Apt INT,
	Entry_Date DATE,
	Exp_Date DATE,
	Rent_Apt INT,
	Deposit INT,
	Parking_Fee INT,
	Garbage_Wifi INT,
	Water INT,
	Num_Occupants INT,
)
GO

DROP TABLE IF EXISTS Damage_Apt
CREATE TABLE Damage_Apt (
	Id_Dam INT PRIMARY KEY IDENTITY,
	Id_Apt INT,
	Id_User INT,
	Content NVARCHAR(50),
	Img_Add NVARCHAR(100),
	Img_File IMAGE ,
	Created_At DATE
)
GO

DROP TABLE IF EXISTS Bill
CREATE TABLE Bill (
	Id_Bill INT PRIMARY KEY IDENTITY,
	Id_Apt INT,
	Id_User INT,
	[Month] INT,
	Electricity INT,
	Created_At DATE
)     
GO

DROP TABLE IF EXISTS Complain
CREATE TABLE Complain (
	Id_Complain INT PRIMARY KEY IDENTITY,
	Content NVARCHAR(100),
	Id_User INT,
	Created_At DATE
)
GO

DROP TABLE IF EXISTS Payment_History
CREATE TABLE Payment_History (
	Id_PH INT PRIMARY KEY IDENTITY,
	Id_Apt INT,
	Id_User INT,
	Dop DATE,
	Img_Add NVARCHAR(150),
	Img_File IMAGE,
	Created_At DATE
)
GO


ALTER TABLE [Contract]
ADD CONSTRAINT FK_Contract_UserApp
FOREIGN KEY(Id_User)
REFERENCES UserApp(Id_User)
GO

ALTER TABLE [Contract]
ADD CONSTRAINT FK_Contract_Apartment
FOREIGN KEY(Id_Apt)
REFERENCES Apartment(Id_Apt)
GO

ALTER TABLE Damage_Apt
ADD CONSTRAINT FK_Damage_Apt_UserApp
FOREIGN KEY(Id_User)
REFERENCES UserApp(Id_User)
GO

ALTER TABLE Damage_Apt
ADD CONSTRAINT FK_Damage_Apt_Apartment
FOREIGN KEY(Id_Apt)
REFERENCES Apartment(Id_Apt)
GO

ALTER TABLE Bill
ADD CONSTRAINT FK_Bill_UserApp
FOREIGN KEY(Id_User)
REFERENCES UserApp(Id_User)
GO

ALTER TABLE Bill
ADD CONSTRAINT FK_Bill_Apartment
FOREIGN KEY(Id_Apt)
REFERENCES Apartment(Id_Apt)
GO

ALTER TABLE Complain
ADD CONSTRAINT FK_Complain_UserApp
FOREIGN KEY(Id_User)
REFERENCES UserApp(Id_User)
GO

ALTER TABLE Payment_History
ADD CONSTRAINT FK_Payment_History_UserApp
FOREIGN KEY(Id_User)
REFERENCES UserApp(Id_User)
GO

ALTER TABLE Payment_History
ADD CONSTRAINT FK_Payment_History_Apartment
FOREIGN KEY(Id_Apt)
REFERENCES Apartment(Id_Apt)
GO


CREATE PROC limitComplain
@Id_NguoiDung INT,@Created_At DATE
AS
BEGIN
	SELECT COUNT(Id_User) FROM Complain 
	WHERE Complain.Id_User = @Id_NguoiDung AND Complain.Created_At = @Created_At 
END
GO

CREATE PROC limitPayment_History
@Id_NguoiDung INT,@Created_At DATE
AS
BEGIN
	SELECT COUNT(Id_User) FROM Payment_History
	WHERE Payment_History.Id_User = @Id_NguoiDung AND Payment_History.Created_At = @Created_At 
END
GO 

CREATE PROC limitDamage_Apt
@Id_NguoiDung INT,@Created_At DATE
AS
BEGIN
	SELECT COUNT(Id_User) FROM Damage_Apt 
	WHERE Damage_Apt.Id_User = @Id_NguoiDung AND Damage_Apt.Created_At = @Created_At 
END
GO

INSERT INTO Apartment (Number_Apt,[Status]) Values (1,1)
INSERT INTO Apartment (Number_Apt,[Status]) Values (2,0)
INSERT INTO Apartment (Number_Apt,[Status]) Values (3,0)
INSERT INTO Apartment (Number_Apt,[Status]) Values (4,0)
INSERT INTO Apartment (Number_Apt,[Status]) Values (5,0)
INSERT INTO Apartment (Number_Apt,[Status]) Values (6,1)
INSERT INTO Apartment (Number_Apt,[Status]) Values (7,0)
INSERT INTO Apartment (Number_Apt,[Status]) Values (8,0)
INSERT INTO Apartment (Number_Apt,[Status]) Values (9,0)
INSERT INTO Apartment (Number_Apt,[Status]) Values (10,0)
go


INSERT INTO UserApp (Fullname,Pass,[Level],CI_Card,Phone) VALUES (N'jhcasb','00E2E3579A5083FCB9A4199B7B4DE6DD',2,746842546485,'0987654322')
INSERT INTO UserApp (Fullname,Pass,[Level],CI_Card,Phone) VALUES (N'jhcasb','00E2E3579A5083FCB9A4199B7B4DE6DD',1,746842546476,'0987654321')
go 
insert into [Contract] (Id_Apt,Id_User,Deposit,Entry_Date,Exp_Date,Garbage_Wifi,Num_Occupants,Parking_Fee,Rent_Apt,Water) 
values (1,1,1000,N'2000/02/05',N'2000/02/05',10000,2,1002,20000,300)
insert into [Contract] (Id_Apt,Id_User,Deposit,Entry_Date,Exp_Date,Garbage_Wifi,Num_Occupants,Parking_Fee,Rent_Apt,Water) 
values (6,2,1000,N'2001/02/05',N'2001/02/05',60000,1,1002,10000,300)
go
insert into Bill(Id_Apt,Id_User,Electricity,[Month])
values (1,1,5000,10)
go

CREATE PROC selPhong
AS
BEGIN 
SELECT * FROM Apartment
END
GO

CREATE PROC getDataWithNumber_Apt 
@SoPhong INT
AS
BEGIN
SELECT UserApp.Fullname,[Contract].* FROM 
	UserApp FULL OUTER JOIN [Contract] 
	ON  UserApp.Id_User = [Contract].Id_User
		FULL OUTER JOIN Apartment
	ON  [Contract].Id_Apt = Apartment.Id_Apt
	WHERE Apartment.Number_Apt = @SoPhong	
END
GO


limitDamage_Apt 1,'2022/12/06'
