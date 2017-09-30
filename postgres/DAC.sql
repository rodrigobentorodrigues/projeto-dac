﻿CREATE TABLE curso(
	codigo_curso int primary key,
	abreviacao varchar(30) not null,
	descricao varchar(50) not null,
	periodo int not null,
	unidade varchar(50) not null
);
CREATE TABLE disciplina (
	codigo_disc int primary key,
	abreviacao varchar(30) not null,
	aulas_semana int not null,
	carga_horaria int not null,
	descricao varchar(50) not null,
	codigo_curso int,
	FOREIGN KEY (codigo_curso) REFERENCES curso(codigo_curso) 
);
CREATE TABLE laboratorio(
	codigo_lab int primary key,
	abreviacao varchar(40) not null,
	descricao varchar(60) not null
);
CREATE TABLE sala (
	codigo_sala int primary key,
	abreviacao varchar(30) not null,
	descricao varchar(50) not null
);
CREATE TABLE horario (
	codigo_hora int primary key,
	descricao varchar(50) not null,
	inicio TIME not null,
	fim TIME not null
);
CREATE TABLE professor(
	codigo_prof int primary key,
	email varchar(50) not null,
	nome varchar(50) not null,
	regime varchar(3) not null,
	unidade varchar(10) not null,
	vinculo varchar(12) not null
);
CREATE TABLE turma(
	codigo_turma int primary key,
	identificacao char not null,
	disciplina varchar(50) not null,
	codigo_curso int,
	codigo_prof int,
	foreign key (codigo_curso) REFERENCES curso(codigo_curso),
	foreign key (codigo_prof) REFERENCES professor(codigo_prof)
);
CREATE TABLE aula (
	id serial primary key,
	dia varchar(15) not null,
	codigo_curso int,
	codigo_disc int,
	codigo_hora int,
	codigo_prof int,
	codigo_sala int,
	codigo_lab int,
	codigo_turma int,
	foreign key (codigo_curso) REFERENCES curso(codigo_curso),
	foreign key (codigo_disc) REFERENCES disciplina(codigo_disc),
	foreign key (codigo_hora) REFERENCES horario(codigo_hora),
	foreign key (codigo_sala) REFERENCES sala(codigo_sala),
	foreign key (codigo_lab) REFERENCES laboratorio(codigo_lab),
	foreign key (codigo_turma) REFERENCES turma(codigo_turma),
	foreign key (codigo_prof) REFERENCES professor(codigo_prof)
);

INSERT INTO laboratorio (codigo_lab, abreviacao, descricao) VALUES(0, '', '');
INSERT INTO sala(codigo_sala, abreviacao, descricao) VALUES(0, '', '')

/*DROP TABLE disciplina, sala, laboratorio, horario, aula, turma, professor, curso*/