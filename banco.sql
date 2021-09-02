/*primeiro deve criar a tabela do estado*/

CREATE TABLE estado
(
    id integer primary key NOT NULL,
    sigla character(2) NOT NULL,
    nome character varying(50) NOT NULL
)

/* logo após crie a tabela da cidade */

CREATE TABLE cidade
(
    id serial primary key,
    nome character varying(255) NOT NULL,
    id_estado bigint,
    CONSTRAINT fk_estado FOREIGN KEY (id_estado)
        REFERENCES estado (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)