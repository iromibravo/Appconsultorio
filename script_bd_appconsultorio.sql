CREATE database appconsultorio;
USE appconsultorio;
CREATE TABLE usuario (
  idusuario INT(11) NOT NULL,
  correo VARCHAR(45) NOT NULL,
  nombre VARCHAR(45) NOT NULL,
  apellido VARCHAR(45) NOT NULL,
  usuario VARCHAR(45) NOT NULL,
  contraseña VARCHAR(45) NOT NULL,
  estatus VARCHAR(45) NOT NULL,
  fecha_registro DATE NOT NULL,
  PRIMARY KEY (idusuario)
  );


CREATE TABLE turno (
  idturno INT(11) NOT NULL,
  nombre VARCHAR(45) NOT NULL,
  hora_inicio TIME NOT NULL,
  hora_fin TIME NOT NULL,
  PRIMARY KEY (idturno)
  );

CREATE TABLE especialidades (
  idespecialidades INT(11) NOT NULL,
  nombre VARCHAR(45) NOT NULL,
  PRIMARY KEY (idespecialidades)
  );

CREATE TABLE medico (
  idmedico INT(11) NOT NULL,
  nombres VARCHAR(70) NOT NULL,
  apellidos VARCHAR(70) NOT NULL,
  sexo VARCHAR(45) NOT NULL,
  direccion VARCHAR(45) NOT NULL,
  telefono VARCHAR(45) NOT NULL,
  correo VARCHAR(45) NOT NULL,
  usuario_idusuario INT(11) NOT NULL,
  turno_idturno INT(11) NOT NULL,
  especialidades_idespecialidades INT(11) NOT NULL,
  PRIMARY KEY (idmedico, usuario_idusuario, turno_idturno, especialidades_idespecialidades),
 
  CONSTRAINT fk_medico_usuario1
  FOREIGN KEY (usuario_idusuario)
  REFERENCES usuario (idusuario),
    
  CONSTRAINT fk_medico_turno1
  FOREIGN KEY (turno_idturno)
  REFERENCES turno (idturno),
   
  CONSTRAINT fk_medico_especialidades1
  FOREIGN KEY (especialidades_idespecialidades)
  REFERENCES especialidades (idespecialidades)
  );

CREATE TABLE paciente (
  idpaciente INT(11) NOT NULL,
  nombre VARCHAR(45) NOT NULL,
  apellidos VARCHAR(45) NOT NULL,
  sexo VARCHAR(45) NOT NULL,
  direccion VARCHAR(95) NOT NULL,
  telefono VARCHAR(45) NULL DEFAULT NULL,
  correo VARCHAR(45) NULL DEFAULT NULL,
  usuario_idusuario INT(11) NOT NULL,
  PRIMARY KEY (idpaciente, usuario_idusuario),
 
  CONSTRAINT fk_paciente_usuario1
  FOREIGN KEY (usuario_idusuario)
  REFERENCES usuario (idusuario)
  );


CREATE TABLE cita (
  idcita INT(11) NOT NULL,
  fecha DATETIME(4) NOT NULL,
  hora TIME NOT NULL,
  medico_idmedico INT(11) NOT NULL,
  paciente_idpaciente INT(11) NOT NULL,
  PRIMARY KEY (idcita, medico_idmedico, paciente_idpaciente),
  
  CONSTRAINT fk_cita_medico1
  FOREIGN KEY (medico_idmedico)
  REFERENCES medico (idmedico),
   
  CONSTRAINT fk_cita_paciente1
  FOREIGN KEY (paciente_idpaciente)
  REFERENCES paciente (idpaciente)
  );

CREATE TABLE consulta (
  idconsulta VARCHAR(45) NOT NULL,
  motivo VARCHAR(100) NOT NULL,
  diagnostico VARCHAR(45) NOT NULL,
  tratamiento VARCHAR(45) NOT NULL,
  fecha DATE NOT NULL,
  hora TIME NOT NULL,
  cita_idcita INT(11) NOT NULL,
  PRIMARY KEY (idconsulta, cita_idcita),
  
  CONSTRAINT fk_consulta_cita1
  FOREIGN KEY (cita_idcita)
  REFERENCES cita (idcita)
  );

CREATE TABLE medicamentos (
  idmedicamentos INT(11) NOT NULL,
  nombre_comercial VARCHAR(45) NOT NULL,
  nombre_generico VARCHAR(45) NULL,
  fecha_vencimiento DATE NOT NULL,
  PRIMARY KEY (idmedicamentos)
  );

CREATE TABLE medicamentos_consulta (
  medicamentos_idmedicamentos INT(11) NOT NULL,
  consulta_idconsulta VARCHAR(45) NOT NULL,
  PRIMARY KEY (medicamentos_idmedicamentos, consulta_idconsulta),
  
  CONSTRAINT fk_medicamentos_consulta_medicamentos1
  FOREIGN KEY (medicamentos_idmedicamentos)
  REFERENCES medicamentos (idmedicamentos),
  
  CONSTRAINT fk_medicamentos_consulta_consulta1
  FOREIGN KEY (consulta_idconsulta)
  REFERENCES consulta (idconsulta)
  );
