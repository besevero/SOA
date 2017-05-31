CREATE TABLE autores (
                id_autor INTEGER NOT NULL,
                nome VARCHAR(30) NOT NULL,
                nome_citacao VARCHAR(30) NOT NULL,
                cpf VARCHAR(13) NOT NULL,
                CONSTRAINT autores_pk PRIMARY KEY (id_autor)
);


CREATE TABLE publicacoes (
                id_publicacao INTEGER NOT NULL,
                titulo VARCHAR(100) NOT NULL,
                pagina_inicial INTEGER NOT NULL,
                pagina_final INTEGER NOT NULL,
                data_publicacao VARCHAR(10) NOT NULL,
                qualis VARCHAR(8) NOT NULL,
                id_autor INTEGER NOT NULL,
                CONSTRAINT publicacoes_pk PRIMARY KEY (id_publicacao)
);
