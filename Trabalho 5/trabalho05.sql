CREATE TABLE pais (
              nome_pais VARCHAR(30) PRIMARY KEY
);
insert into pais
values('Brasil');
insert into pais
values('Alemanha');
insert into pais
values('Espanha');
insert into pais
values('Estados Unidos');
insert into pais
values('Canada');
insert into pais
values('Italia');

select * from pais;

CREATE TABLE cidade (
                id_cidade SERIAL PRIMARY KEY,
                nome VARCHAR(30) NOT NULL UNIQUE,
                nome_pais VARCHAR(30) NOT NULL
);
insert into cidade(nome, nome_pais)
values('Rio de Janeiro',(select nome_pais from pais where nome_pais = 'Brasil'));
insert into cidade(nome, nome_pais)
values('San Francisco',(select nome_pais from pais where nome_pais = 'Estados Unidos'));
insert into cidade(nome, nome_pais)
values('Ottawa',(select nome_pais from pais where nome_pais = 'Canada'));
insert into cidade(nome, nome_pais)
values('Florence',(select nome_pais from pais where nome_pais = 'Italia'));
insert into cidade(nome, nome_pais)
values('Salamanca',(select nome_pais from pais where nome_pais = 'Espanha'));
insert into cidade(nome, nome_pais)
values('Sao Paulo',(select nome_pais from pais where nome_pais = 'Brasil'));
insert into cidade(nome, nome_pais)
values('Brasilia',(select nome_pais from pais where nome_pais = 'Brasil'));

CREATE TABLE forum (
                id_forum SERIAL PRIMARY KEY,
                nome VARCHAR(100) NOT NULL UNIQUE,
                sigla VARCHAR(30) NOT NULL
);
insert into forum(nome, sigla)
values('Sensors to Cloud Architectures Workshop','SCAW');
insert into forum(nome, sigla)
values('IFIP/IEEE International Symposium on Integrated Network Management','IM');
insert into forum(nome, sigla)
values('ACM/SIGAPP Symposium On Applied Computing','SAC');
insert into forum(nome, sigla)
values('International Workshop on Product LinE Approaches in Software Engineering','IWPLA');
insert into forum(nome, sigla)
values('iSys: Revista Brasileira de Sistemas de Informação','iSys');
insert into forum(nome, sigla)
values('International Journal of Software Engineering and Knowledge Engineering','IJSEKE');
SELECT * FROM forum;

CREATE TABLE edicao_forum (
                id_edicao SERIAL PRIMARY KEY,
                ano INTEGER NOT NULL,
                qualis VARCHAR(30) NOT NULL,
                id_forum INTEGER NOT NULL,
                id_cidade INTEGER
);
insert into edicao_forum(ano, qualis, id_forum, id_cidade)
values(2015, '-', (select id_forum from forum where sigla = 'SCAW'), (select id_cidade from cidade where nome = 'San Francisco'));
insert into edicao_forum(ano, qualis, id_forum, id_cidade)
values(2015, '-', (select id_forum from forum where sigla = 'IM'), (select id_cidade from cidade where nome = 'Ottawa'));
insert into edicao_forum(ano, qualis, id_forum, id_cidade)
values(2015, '-', (select id_forum from forum where sigla = 'SAC'), (select id_cidade from cidade where nome = 'Salamanca'));
insert into edicao_forum(ano, qualis, id_forum, id_cidade)
values(2015, '-', (select id_forum from forum where sigla = 'IWPLA'), (select id_cidade from cidade where nome = 'Florence'));
insert into edicao_forum(ano, qualis, id_forum)
values(2016, 'B3', (select id_forum from forum where sigla = 'iSys'));
insert into edicao_forum(ano, qualis, id_forum)
values(2016, 'B1', (select id_forum from forum where sigla = 'IJSEKE'));
select * from edicao_forum;
CREATE TABLE producao (
                Id_Publicacao SERIAL PRIMARY KEY,
                titulo VARCHAR(100) NOT NULL,
                pagina_inicial INTEGER NOT NULL,
                pagina_final INTEGER NOT NULL,
                id_forum INTEGER NOT NULL
);

insert into producao(titulo, pagina_inicial, pagina_final, id_forum)
values('A Cloud-based Architecture for the Internet of Things Targeting Industrial Engine Remote Monitoring', 0,0, 
	(select id_edicao from edicao_forum where id_forum = (select id_forum from forum where sigla = 'SCAW')));
insert into producao(titulo, pagina_inicial, pagina_final, id_forum)
values('ResearchOps: The case for DevOps in scientific applications', 1398, 1404, 
	(select id_edicao from edicao_forum where id_forum = (select id_forum from forum where sigla = 'IM')));
	
insert into producao(titulo, pagina_inicial, pagina_final, id_forum)
values('Architecting Cloud Tools using Software Product Line Techniques: an Exploratory Study', 1441,1448, 
	(select id_edicao from edicao_forum where id_forum = (select id_forum from forum where sigla = 'SAC')));
insert into producao(titulo, pagina_inicial, pagina_final, id_forum)
values('WISE-SPL: Bringing Multi-tenancy to the Weather InSights Environment System', 0,0, 
	(select id_edicao from edicao_forum where id_forum = (select id_forum from forum where sigla = 'IWPLA')));
	
insert into producao(titulo, pagina_inicial, pagina_final, id_forum)
values('DW-CGU: Integração dos Dados do Portal da Transparência do Governo Federal Brasileiro', 6,32, 
	(select id_edicao from edicao_forum where id_forum = (select id_forum from forum where sigla = 'iSys')));

insert into producao(titulo, pagina_inicial, pagina_final, id_forum)
values(' An Automated Approach for Scheduling Bug Fix Tasks', 239,271, 
	(select id_edicao from edicao_forum where id_forum = (select id_forum from forum where sigla = 'IJSEKE')));

select * from producao;
CREATE TABLE autor (
                Id_Autor SERIAL PRIMARY KEY,
                nome VARCHAR(100) NOT NULL UNIQUE,
                nome_citacao VARCHAR(30) NOT NULL,
                cpf VARCHAR(14) NOT NULL
);

insert into autor(nome, nome_citacao, cpf)
values('Leonardo Guerreiro Azevedo', 'L. G.;AZEVEDO', '914.645.435-22');
insert into autor(nome, nome_citacao, cpf)
values('Kate Cerqueira Revoredo', 'REVOREDO, K', '173.440.175-44');
insert into autor(nome, nome_citacao, cpf)
values('Fernanda Araujo Baiao Amorim', 'BAIAO, F. A', '025.528.615-97');
insert into autor(nome, nome_citacao, cpf)
values('Marcio de Oliveira Barros', 'BARROS, M. O.', '623.244.298-13');

select * from autor;

CREATE TABLE escreve (
                Id_Autor INTEGER NOT NULL,
                Id_Publicacao INTEGER NOT NULL,
                CONSTRAINT escreve_pk PRIMARY KEY (Id_Autor, Id_Publicacao)
);

insert into escreve
values(
	(select id_autor from autor where nome = 'Leonardo Guerreiro Azevedo'),
	(select id_publicacao from producao where titulo = 'A Cloud-based Architecture for the Internet of Things Targeting Industrial Engine Remote Monitoring')
);
insert into escreve
values(
	(select id_autor from autor where nome = 'Leonardo Guerreiro Azevedo'),
	(select id_publicacao from producao where titulo = 'ResearchOps: The case for DevOps in scientific applications')
);
insert into escreve
values(
	(select id_autor from autor where nome = 'Leonardo Guerreiro Azevedo'),
	(select id_publicacao from producao where titulo = 'Architecting Cloud Tools using Software Product Line Techniques: an Exploratory Study')
);
insert into escreve
values(
	(select id_autor from autor where nome = 'Leonardo Guerreiro Azevedo'),
	(select id_publicacao from producao where titulo = 'WISE-SPL: Bringing Multi-tenancy to the Weather InSights Environment System')
);
insert into escreve
values(
	(select id_autor from autor where nome = 'Kate Cerqueira Revoredo'),
	(select id_publicacao from producao where titulo = 'DW-CGU: Integração dos Dados do Portal da Transparência do Governo Federal Brasileiro')
);
insert into escreve
values(
	(select id_autor from autor where nome = 'Marcio de Oliveira Barros'),
	(select id_publicacao from producao where titulo = ' An Automated Approach for Scheduling Bug Fix Tasks')
);
select * from escreve;