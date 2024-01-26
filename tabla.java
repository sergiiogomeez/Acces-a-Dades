/*
dddddssssssssssssss
-- Tabla de Pokémon
CREATE TABLE Pokemon (
    ID INT PRIMARY KEY,
    Nombre VARCHAR(255),
    Tipo1 VARCHAR(255),
    Tipo2 VARCHAR(255),
    HP INT,
    Ataque INT,
    Defensa INT,
    AtaqueEspecial INT,
    DefensaEspecial INT,
    Velocidad INT,
    Descripcion TEXT,
    Generacion INT,
    EvolucionID INT,
    HabilidadID INT
);

-- Tabla de Movimientos
CREATE TABLE Moves (
    ID INT PRIMARY KEY,
    Nombre VARCHAR(255),
    Tipo VARCHAR(255),
    Poder INT,
    Precisio INT,
    Categoria VARCHAR(255),
    EfectosSecundarios TEXT,
    PP INT
);

-- Tabla de Habilidades
CREATE TABLE Abilities (
    ID INT PRIMARY KEY,
    Nombre VARCHAR(255),
    Descripcion TEXT
); ME CAGO EN T

-- Tabla de Tipos
CREATE TABLE Types (
    ID INT PRIMARY KEY,
    Nombre VARCHAR(255)
);

-- Tabla de Entrenadores
CREATE TABLE Trainers (
    ID INT PRIMARY KEY,
    Nombre VARCHAR(255)
);

-- Tabla de Regiones
CREATE TABLE Regions (
    ID INT PRIMARY KEY,
    Nombre VARCHAR(255)
);

-- Tabla de Pueblos/Ciudades
CREATE TABLE TownsCities (
    ID INT PRIMARY KEY,
    Nombre VARCHAR(255),
    LiderGimnasioID INT
);

-- Tabla de Objetos
CREATE TABLE Items (
    ID INT PRIMARY KEY,
    Nombre VARCHAR(255),
    Descripcion TEXT,
    TipoObjeto VARCHAR(255)
);

-- Tabla de Pokedex
CREATE TABLE Pokedex (
    ID INT PRIMARY KEY,
    NumeroPokedex INT,
    NombrePokemon VARCHAR(255),
    RegionID INT
);

-- Tabla de Evoluciones
CREATE TABLE Evolutions (
    ID INT PRIMARY KEY,
    PokemonPrevioID INT,
    PokemonResultanteID INT,
    MetodoEvolucion VARCHAR(255)
);

*/

/////////////////////////////////////////////

/*

INSERT INTO Pokemon (nombre, tipo, hp, ataque, defensa, ataque_especial, defensa_especial, velocidad, descripcion, generacion)
VALUES ('Pikachu', 'Eléctrico', 35, 55, 40, 50, 50, 90, 'Ratón Eléctrico', 1);

INSERT INTO Pokemon (nombre, tipo, hp, ataque, defensa, ataque_especial, defensa_especial, velocidad, descripcion, generacion)
VALUES ('Charizard', 'Fuego/Volador', 78, 84, 78, 109, 85, 100, 'Dragón Llamativo', 1);

INSERT INTO Moves (nombre, tipo, poder, precision, categoria, efectos_secundarios, pp)
VALUES ('Rayo', 'Eléctrico', 90, 100, 'Especial', NULL, 10);

INSERT INTO Moves (nombre, tipo, poder, precision, categoria, efectos_secundarios, pp)
VALUES ('Lanzallamas', 'Fuego', 90, 100, 'Especial', 'Puede quemar al objetivo', 15);

INSERT INTO Abilities (nombre, descripcion)
VALUES ('Pararrayos', 'Atrae todos los movimientos eléctricos hacia el Pokémon.');

INSERT INTO Abilities (nombre, descripcion)
VALUES ('Mar Llamas', 'Potencia los movimientos tipo Agua cuando el Pokémon tiene menos de la mitad de HP.');

INSERT INTO Types (nombre)
VALUES ('Eléctrico');

INSERT INTO Types (nombre)
VALUES ('Fuego');

INSERT INTO Trainers (nombre)
VALUES ('Ash Ketchum');

INSERT INTO Trainers (nombre)
VALUES ('Misty');

INSERT INTO Regions (nombre)
VALUES ('Kanto');

INSERT INTO Regions (nombre)
VALUES ('Johto');

INSERT INTO TownsCities (nombre, lider_gimnasio)
VALUES ('Pueblo Paleta', 'Azul');

INSERT INTO TownsCities (nombre, lider_gimnasio)
VALUES ('Ciudad Plateada', 'Giovanni');

INSERT INTO Items (nombre, descripcion, tipo)
VALUES ('Poción', 'Restaura 20 puntos de salud de un Pokémon', 'Curación');

INSERT INTO Items (nombre, descripcion, tipo)
VALUES ('Bola Maestra', 'Captura a Pokémon salvajes sin fallar', 'Captura');

INSERT INTO Pokedex (numero_pokedex, nombre_pokemon, region)
VALUES (25, 'Pikachu', 'Kanto');

INSERT INTO Pokedex (numero_pokedex, nombre_pokemon, region)
VALUES (6, 'Charizard', 'Kanto');

INSERT INTO Evolutions (id_pokemon_previo, id_pokemon_resultante, metodo_evolucion)
VALUES (10, 25, 'Subir a nivel');

INSERT INTO Evolutions (id_pokemon_previo, id_pokemon_resultante, metodo_evolucion)
VALUES (4, 6, 'Subir a nivel');

*/