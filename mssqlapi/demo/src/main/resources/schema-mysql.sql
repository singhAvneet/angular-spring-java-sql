--CREATE LOGIN sa WITH PASSWORD = 'Gms@1212';
--GO
--CREATE USER sa FOR LOGIN sa;
--GO
--ALTER SERVER ROLE sysadmin ADD MEMBER [sa];
--GO
--SET ANSI_NULLS ON
--GO
--SET QUOTED_IDENTIFIER ON
--GO
--CREATE DATABASE library;
--GO
--USE library;
--GO
--CREATE TABLE library.books(
--	[Id] [int] IDENTITY(1,1) PRIMARY KEY,,
--	[book_name] [varchar](50) NOT NULL,
--	[author_name] [varchar](50) NULL,
--	[isbn] [varchar](50) NULL)
--GO


--USE [library]
--GO
--
--CREATE PROCEDURE findallauthor
--AS
--SELECT * FROM dbo.books
--GO;


