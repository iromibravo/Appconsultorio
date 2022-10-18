CREATE database appconsultorio;
USE appconsultorio;

CREATE TABLE turno (
  idturno INT(11) NOT NULL,
  nombre VARCHAR(45) NOT NULL,
  hora_inicio TIME NOT NULL,
  hora_fin TIME NOT NULL,
  PRIMARY KEY (idturno)
  );

CREATE TABLE especialidad (
  idespecialidad INT(11) NOT NULL,
  nombre VARCHAR(45) NOT NULL,
  PRIMARY KEY (idespecialidad)
  );

CREATE TABLE medico (
  idmedico INT(11) NOT NULL,
  nombres VARCHAR(70) NOT NULL,
  apellidos VARCHAR(70) NOT NULL,
  sexo VARCHAR(45) NOT NULL,
  direccion VARCHAR(45) NOT NULL,
  telefono VARCHAR(45) NOT NULL,
  correo VARCHAR(45) NOT NULL,
  contraseña VARCHAR(45) NULL DEFAULT NULL,
  turno_idturno INT(11) NOT NULL,
  especialidad_idespecialidad INT(11) NOT NULL,
  PRIMARY KEY (idmedico,turno_idturno, especialidad_idespecialidad),
   
  CONSTRAINT fk_medico_turno1
  FOREIGN KEY (turno_idturno)
  REFERENCES turno (idturno),
   
  CONSTRAINT fk_medico_especialidad1
  FOREIGN KEY (especialidad_idespecialidad)
  REFERENCES especialidad (idespecialidad)
  );

CREATE TABLE paciente (
  idpaciente INT(11) NOT NULL,
  nombre VARCHAR(45) NOT NULL,
  apellidos VARCHAR(45) NOT NULL,
  sexo VARCHAR(45) NOT NULL,
  direccion VARCHAR(95) NOT NULL,
  telefono VARCHAR(45) NULL DEFAULT NULL,
  correo VARCHAR(45) NULL DEFAULT NULL,
  contraseña VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (idpaciente)
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

CREATE TABLE medicamento (
  idmedicamento INT(11) NOT NULL,
  nombre_comercial VARCHAR(45) NOT NULL,
  nombre_generico VARCHAR(45) NULL,
  fecha_vencimiento DATE NOT NULL,
  PRIMARY KEY (idmedicamento)
  );

CREATE TABLE consulta_medicamento (
consulta_idconsulta VARCHAR(45) NOT NULL,  
medicamento_idmedicamento INT(11) NOT NULL,
  
  PRIMARY KEY (consulta_idconsulta, medicamento_idmedicamento),
  
 CONSTRAINT fk_consulta_medicamento_consulta1
  FOREIGN KEY (consulta_idconsulta)
  REFERENCES consulta (idconsulta),
  
CONSTRAINT fk_consulta_medicamento_medicamento1
  FOREIGN KEY (medicamento_idmedicamento)
  REFERENCES medicamento (idmedicamento)
  
 );
