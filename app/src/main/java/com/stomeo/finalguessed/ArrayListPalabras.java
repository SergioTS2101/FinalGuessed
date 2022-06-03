package com.stomeo.finalguessed;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPalabras {

    private static List<ListaPalabras> listaCapitales() {

        final List<ListaPalabras> listaCapitales = new ArrayList<>();

        final ListaPalabras capital1 = new ListaPalabras("Kabul",1);
        final ListaPalabras capital2 = new ListaPalabras("Tirana",2);
        final ListaPalabras capital3 = new ListaPalabras("Luanda",3);
        final ListaPalabras capital4 = new ListaPalabras("Riad",4);
        final ListaPalabras capital5 = new ListaPalabras("Viena",5);
        final ListaPalabras capital6 = new ListaPalabras("Bruselas",6);
        final ListaPalabras capital7 = new ListaPalabras("Sucre",7);
        final ListaPalabras capital8 = new ListaPalabras("Ottawa",8);
        final ListaPalabras capital9 = new ListaPalabras("Zagreb",9);
        final ListaPalabras capital10 = new ListaPalabras("Santiago",10);
        final ListaPalabras capital11 = new ListaPalabras("Copenhague",11);
        final ListaPalabras capital12 = new ListaPalabras("Roseau",12);
        final ListaPalabras capital13 = new ListaPalabras("Quito",13);
        final ListaPalabras capital14 = new ListaPalabras("Madrid",14);
        final ListaPalabras capital15 = new ListaPalabras("Tallin",15);
        final ListaPalabras capital16 = new ListaPalabras("Atenas",16);
        final ListaPalabras capital17 = new ListaPalabras("Guatemala",17);
        final ListaPalabras capital18 = new ListaPalabras("Malabo",18);
        final ListaPalabras capital19 = new ListaPalabras("Budapest",19);
        final ListaPalabras capital20 = new ListaPalabras("Bagdad",20);
        final ListaPalabras capital21 = new ListaPalabras("Roma",21);
        final ListaPalabras capital22 = new ListaPalabras("Tokio",22);
        final ListaPalabras capital23 = new ListaPalabras("Luxemburgo",23);
        final ListaPalabras capital24 = new ListaPalabras("Biskek",24);
        final ListaPalabras capital25 = new ListaPalabras("Rabat",25);
        final ListaPalabras capital26 = new ListaPalabras("Oslo",26);
        final ListaPalabras capital27 = new ListaPalabras("Abuya",27);
        final ListaPalabras capital28 = new ListaPalabras("Wellington",28);
        final ListaPalabras capital29 = new ListaPalabras("Lima",29);
        final ListaPalabras capital30 = new ListaPalabras("Lisboa",30);

        listaCapitales.add(capital1);
        listaCapitales.add(capital2);
        listaCapitales.add(capital3);
        listaCapitales.add(capital4);
        listaCapitales.add(capital5);
        listaCapitales.add(capital6);
        listaCapitales.add(capital7);
        listaCapitales.add(capital8);
        listaCapitales.add(capital9);
        listaCapitales.add(capital10);
        listaCapitales.add(capital11);
        listaCapitales.add(capital12);
        listaCapitales.add(capital13);
        listaCapitales.add(capital14);
        listaCapitales.add(capital15);
        listaCapitales.add(capital16);
        listaCapitales.add(capital17);
        listaCapitales.add(capital18);
        listaCapitales.add(capital19);
        listaCapitales.add(capital20);
        listaCapitales.add(capital21);
        listaCapitales.add(capital22);
        listaCapitales.add(capital23);
        listaCapitales.add(capital24);
        listaCapitales.add(capital25);
        listaCapitales.add(capital26);
        listaCapitales.add(capital27);
        listaCapitales.add(capital28);
        listaCapitales.add(capital29);
        listaCapitales.add(capital30);

        return listaCapitales;
    }


    private static List<ListaPalabras> listaComidas(){
        final List<ListaPalabras> listaComidas = new ArrayList<>();

        final ListaPalabras comida1 = new ListaPalabras("Paella",1);
        final ListaPalabras comida2 = new ListaPalabras("Pizza",2);
        final ListaPalabras comida3 = new ListaPalabras("Pescado",3);
        final ListaPalabras comida4 = new ListaPalabras("Macarrones",4);
        final ListaPalabras comida5 = new ListaPalabras("Palomitas",5);
        final ListaPalabras comida6 = new ListaPalabras("Patata",6);
        final ListaPalabras comida7 = new ListaPalabras("Pan",7);
        final ListaPalabras comida8 = new ListaPalabras("Judias",8);
        final ListaPalabras comida9 = new ListaPalabras("Arroz",9);
        final ListaPalabras comida10 = new ListaPalabras("Albondigas",10);
        final ListaPalabras comida11 = new ListaPalabras("Lima",11);
        final ListaPalabras comida12 = new ListaPalabras("Fresa",12);
        final ListaPalabras comida13 = new ListaPalabras("Platano",13);
        final ListaPalabras comida14 = new ListaPalabras("Canelones",14);
        final ListaPalabras comida15 = new ListaPalabras("Cocido",15);
        final ListaPalabras comida16 = new ListaPalabras("Naranja",16);
        final ListaPalabras comida17 = new ListaPalabras("Queso",17);
        final ListaPalabras comida18 = new ListaPalabras("Lentejas",18);
        final ListaPalabras comida19 = new ListaPalabras("Singapur",19);
        final ListaPalabras comida20 = new ListaPalabras("Guisantes",20);
        final ListaPalabras comida21 = new ListaPalabras("Tomate",21);
        final ListaPalabras comida22 = new ListaPalabras("Remolacha",22);
        final ListaPalabras comida23 = new ListaPalabras("Cereza",23);
        final ListaPalabras comida24 = new ListaPalabras("Higo",24);
        final ListaPalabras comida25 = new ListaPalabras("Manzana",25);
        final ListaPalabras comida26 = new ListaPalabras("Pera",26);
        final ListaPalabras comida27 = new ListaPalabras("Jamon",27);
        final ListaPalabras comida28 = new ListaPalabras("Nectarina",28);
        final ListaPalabras comida29 = new ListaPalabras("Croquetas",29);
        final ListaPalabras comida30 = new ListaPalabras("Tortilla",30);

        listaComidas.add(comida1);
        listaComidas.add(comida2);
        listaComidas.add(comida3);
        listaComidas.add(comida4);
        listaComidas.add(comida5);
        listaComidas.add(comida6);
        listaComidas.add(comida7);
        listaComidas.add(comida8);
        listaComidas.add(comida9);
        listaComidas.add(comida10);
        listaComidas.add(comida11);
        listaComidas.add(comida12);
        listaComidas.add(comida13);
        listaComidas.add(comida14);
        listaComidas.add(comida15);
        listaComidas.add(comida16);
        listaComidas.add(comida17);
        listaComidas.add(comida18);
        listaComidas.add(comida19);
        listaComidas.add(comida20);
        listaComidas.add(comida21);
        listaComidas.add(comida22);
        listaComidas.add(comida23);
        listaComidas.add(comida24);
        listaComidas.add(comida25);
        listaComidas.add(comida26);
        listaComidas.add(comida27);
        listaComidas.add(comida28);
        listaComidas.add(comida29);
        listaComidas.add(comida30);

        return listaComidas;
    }

    private static List<ListaPalabras> listaAnimales(){
        final List<ListaPalabras> listaAnimales = new ArrayList<>();

        final ListaPalabras animal1 = new ListaPalabras("Perro",1);
        final ListaPalabras animal2 = new ListaPalabras("Oso",2);
        final ListaPalabras animal3 = new ListaPalabras("Serpiente",3);
        final ListaPalabras animal4 = new ListaPalabras("Cocodrilo",4);
        final ListaPalabras animal5 = new ListaPalabras("Pantera",5);
        final ListaPalabras animal6 = new ListaPalabras("Buho",6);
        final ListaPalabras animal7 = new ListaPalabras("Toro",7);
        final ListaPalabras animal8 = new ListaPalabras("Gato",8);
        final ListaPalabras animal9 = new ListaPalabras("Tigre",9);
        final ListaPalabras animal10 = new ListaPalabras("Cisne",10);
        final ListaPalabras animal11 = new ListaPalabras("Pato",11);
        final ListaPalabras animal12 = new ListaPalabras("Ciervo",12);
        final ListaPalabras animal13 = new ListaPalabras("Asno",13);
        final ListaPalabras animal14 = new ListaPalabras("Burro",14);
        final ListaPalabras animal15 = new ListaPalabras("Paloma",15);
        final ListaPalabras animal16 = new ListaPalabras("Jirafa",16);
        final ListaPalabras animal17 = new ListaPalabras("Guepardo",17);
        final ListaPalabras animal18 = new ListaPalabras("Hipopotamo",18);
        final ListaPalabras animal19 = new ListaPalabras("Rana",19);
        final ListaPalabras animal20 = new ListaPalabras("Elefante",20);
        final ListaPalabras animal21 = new ListaPalabras("Canguro",21);
        final ListaPalabras animal22 = new ListaPalabras("Caballo",22);
        final ListaPalabras animal23 = new ListaPalabras("Mono",23);
        final ListaPalabras animal24 = new ListaPalabras("Tortuga",24);
        final ListaPalabras animal25 = new ListaPalabras("Conejo",25);
        final ListaPalabras animal26 = new ListaPalabras("Camello",26);
        final ListaPalabras animal27 = new ListaPalabras("Loro",27);
        final ListaPalabras animal28 = new ListaPalabras("Camaleon",28);
        final ListaPalabras animal29 = new ListaPalabras("Flamenco",29);
        final ListaPalabras animal30 = new ListaPalabras("Delfin",30);

        listaAnimales.add(animal1);
        listaAnimales.add(animal2);
        listaAnimales.add(animal3);
        listaAnimales.add(animal4);
        listaAnimales.add(animal5);
        listaAnimales.add(animal6);
        listaAnimales.add(animal7);
        listaAnimales.add(animal8);
        listaAnimales.add(animal9);
        listaAnimales.add(animal10);
        listaAnimales.add(animal11);
        listaAnimales.add(animal12);
        listaAnimales.add(animal13);
        listaAnimales.add(animal14);
        listaAnimales.add(animal15);
        listaAnimales.add(animal16);
        listaAnimales.add(animal17);
        listaAnimales.add(animal18);
        listaAnimales.add(animal19);
        listaAnimales.add(animal20);
        listaAnimales.add(animal21);
        listaAnimales.add(animal22);
        listaAnimales.add(animal23);
        listaAnimales.add(animal24);
        listaAnimales.add(animal25);
        listaAnimales.add(animal26);
        listaAnimales.add(animal27);
        listaAnimales.add(animal28);
        listaAnimales.add(animal29);
        listaAnimales.add(animal30);

        return listaAnimales;
    }

    private static List<ListaPalabras> listaProfesiones(){
        final List<ListaPalabras> listaProfesiones = new ArrayList<>();

        final ListaPalabras profesion1 = new ListaPalabras("Florista",1);
        final ListaPalabras profesion2 = new ListaPalabras("Profesor",2);
        final ListaPalabras profesion3 = new ListaPalabras("Arquitecto",3);
        final ListaPalabras profesion4 = new ListaPalabras("Carpintero",4);
        final ListaPalabras profesion5 = new ListaPalabras("Decorador",5);
        final ListaPalabras profesion6 = new ListaPalabras("Bioquimico",6);
        final ListaPalabras profesion7 = new ListaPalabras("Astronomo",7);
        final ListaPalabras profesion8 = new ListaPalabras("Socorrista",8);
        final ListaPalabras profesion9 = new ListaPalabras("Dietista",9);
        final ListaPalabras profesion10 = new ListaPalabras("Jardinero",10);
        final ListaPalabras profesion11 = new ListaPalabras("Rotulista",11);
        final ListaPalabras profesion12 = new ListaPalabras("Diseñador",12);
        final ListaPalabras profesion13 = new ListaPalabras("Periodista",13);
        final ListaPalabras profesion14 = new ListaPalabras("Bombero",14);
        final ListaPalabras profesion15 = new ListaPalabras("Economista",15);
        final ListaPalabras profesion16 = new ListaPalabras("Niñero",16);
        final ListaPalabras profesion17 = new ListaPalabras("Pescador",17);
        final ListaPalabras profesion18 = new ListaPalabras("Conserje",18);
        final ListaPalabras profesion19 = new ListaPalabras("Panadero",19);
        final ListaPalabras profesion20 = new ListaPalabras("Cocinero",20);
        final ListaPalabras profesion21 = new ListaPalabras("Camarero",21);
        final ListaPalabras profesion22 = new ListaPalabras("Sommelier",22);
        final ListaPalabras profesion23 = new ListaPalabras("Crupier",23);
        final ListaPalabras profesion24 = new ListaPalabras("Portero",24);
        final ListaPalabras profesion25 = new ListaPalabras("Logopeda",25);
        final ListaPalabras profesion26 = new ListaPalabras("Traductor",26);
        final ListaPalabras profesion27 = new ListaPalabras("Tapicero",27);
        final ListaPalabras profesion28 = new ListaPalabras("Arqueologo",28);
        final ListaPalabras profesion29 = new ListaPalabras("Editor",29);
        final ListaPalabras profesion30 = new ListaPalabras("Sacerdote",30);

        listaProfesiones.add(profesion1);
        listaProfesiones.add(profesion2);
        listaProfesiones.add(profesion3);
        listaProfesiones.add(profesion4);
        listaProfesiones.add(profesion5);
        listaProfesiones.add(profesion6);
        listaProfesiones.add(profesion7);
        listaProfesiones.add(profesion8);
        listaProfesiones.add(profesion9);
        listaProfesiones.add(profesion10);
        listaProfesiones.add(profesion11);
        listaProfesiones.add(profesion12);
        listaProfesiones.add(profesion13);
        listaProfesiones.add(profesion14);
        listaProfesiones.add(profesion15);
        listaProfesiones.add(profesion16);
        listaProfesiones.add(profesion17);
        listaProfesiones.add(profesion18);
        listaProfesiones.add(profesion19);
        listaProfesiones.add(profesion20);
        listaProfesiones.add(profesion21);
        listaProfesiones.add(profesion22);
        listaProfesiones.add(profesion23);
        listaProfesiones.add(profesion24);
        listaProfesiones.add(profesion25);
        listaProfesiones.add(profesion26);
        listaProfesiones.add(profesion27);
        listaProfesiones.add(profesion28);
        listaProfesiones.add(profesion29);
        listaProfesiones.add(profesion30);

        return listaProfesiones;
    }

    private static List<ListaPalabras> listaDeportes() {
        final List<ListaPalabras> listaDeportes = new ArrayList<>();

        final ListaPalabras deporte1 = new ListaPalabras("Futbol",1);
        final ListaPalabras deporte2 = new ListaPalabras("Baloncesto",2);
        final ListaPalabras deporte3 = new ListaPalabras("Balonmano",3);
        final ListaPalabras deporte4 = new ListaPalabras("Boxeo",4);
        final ListaPalabras deporte5 = new ListaPalabras("Esgrima",5);
        final ListaPalabras deporte6 = new ListaPalabras("Tenis",6);
        final ListaPalabras deporte7 = new ListaPalabras("Rugby",7);
        final ListaPalabras deporte8 = new ListaPalabras("Polo",8);
        final ListaPalabras deporte9 = new ListaPalabras("Hockey",9);
        final ListaPalabras deporte10 = new ListaPalabras("Cricket",10);
        final ListaPalabras deporte11 = new ListaPalabras("Golf",11);
        final ListaPalabras deporte12 = new ListaPalabras("Ciclismo",12);
        final ListaPalabras deporte13 = new ListaPalabras("Escalada",13);
        final ListaPalabras deporte14 = new ListaPalabras("Senderismo",14);
        final ListaPalabras deporte15 = new ListaPalabras("Buceo",15);
        final ListaPalabras deporte16 = new ListaPalabras("Natacion",16);
        final ListaPalabras deporte17 = new ListaPalabras("Remo",17);
        final ListaPalabras deporte18 = new ListaPalabras("Surf",18);
        final ListaPalabras deporte19 = new ListaPalabras("Waterpolo",19);
        final ListaPalabras deporte20 = new ListaPalabras("Windsurf",20);
        final ListaPalabras deporte21 = new ListaPalabras("Trial",21);
        final ListaPalabras deporte22 = new ListaPalabras("Equitacion",22);
        final ListaPalabras deporte23 = new ListaPalabras("Judo",23);
        final ListaPalabras deporte24 = new ListaPalabras("Karate",24);
        final ListaPalabras deporte25 = new ListaPalabras("Curling",25);
        final ListaPalabras deporte26 = new ListaPalabras("Squash",26);
        final ListaPalabras deporte27 = new ListaPalabras("Slackline",27);
        final ListaPalabras deporte28 = new ListaPalabras("Badminton",28);
        final ListaPalabras deporte29 = new ListaPalabras("Voleibol",29);
        final ListaPalabras deporte30 = new ListaPalabras("Padel",30);

        listaDeportes.add(deporte1);
        listaDeportes.add(deporte2);
        listaDeportes.add(deporte3);
        listaDeportes.add(deporte4);
        listaDeportes.add(deporte5);
        listaDeportes.add(deporte6);
        listaDeportes.add(deporte7);
        listaDeportes.add(deporte8);
        listaDeportes.add(deporte9);
        listaDeportes.add(deporte10);
        listaDeportes.add(deporte11);
        listaDeportes.add(deporte12);
        listaDeportes.add(deporte13);
        listaDeportes.add(deporte14);
        listaDeportes.add(deporte15);
        listaDeportes.add(deporte16);
        listaDeportes.add(deporte17);
        listaDeportes.add(deporte18);
        listaDeportes.add(deporte19);
        listaDeportes.add(deporte20);
        listaDeportes.add(deporte21);
        listaDeportes.add(deporte22);
        listaDeportes.add(deporte23);
        listaDeportes.add(deporte24);
        listaDeportes.add(deporte25);
        listaDeportes.add(deporte26);
        listaDeportes.add(deporte27);
        listaDeportes.add(deporte28);
        listaDeportes.add(deporte29);
        listaDeportes.add(deporte30);

        return listaDeportes;
    }

    private static List<ListaPalabras> listaPeliculas() {
        final List<ListaPalabras> listaPeliculas = new ArrayList<>();

        final ListaPalabras pelicula1 = new ListaPalabras("Acorralado",1);
        final ListaPalabras pelicula2 = new ListaPalabras("Terminator",2);
        final ListaPalabras pelicula3 = new ListaPalabras("Alien",3);
        final ListaPalabras pelicula4 = new ListaPalabras("Origen",4);
        final ListaPalabras pelicula5 = new ListaPalabras("Coco",5);
        final ListaPalabras pelicula6 = new ListaPalabras("Titanic",6);
        final ListaPalabras pelicula7 = new ListaPalabras("Batman",7);
        final ListaPalabras pelicula8 = new ListaPalabras("Dumbo",8);
        final ListaPalabras pelicula9 = new ListaPalabras("Aladdin",9);
        final ListaPalabras pelicula10 = new ListaPalabras("Pinocho",10);
        final ListaPalabras pelicula11 = new ListaPalabras("Bambi",11);
        final ListaPalabras pelicula12 = new ListaPalabras("Mulan",12);
        final ListaPalabras pelicula13 = new ListaPalabras("Tarzan",13);
        final ListaPalabras pelicula14 = new ListaPalabras("Enredados",14);
        final ListaPalabras pelicula15 = new ListaPalabras("Bolt",15);
        final ListaPalabras pelicula16 = new ListaPalabras("Encanto",16);
        final ListaPalabras pelicula17 = new ListaPalabras("Frozen",17);
        final ListaPalabras pelicula18 = new ListaPalabras("Vaiana",18);
        final ListaPalabras pelicula19 = new ListaPalabras("Sonic",19);
        final ListaPalabras pelicula20 = new ListaPalabras("Thor",20);
        final ListaPalabras pelicula21 = new ListaPalabras("Hulk",21);
        final ListaPalabras pelicula22 = new ListaPalabras("Matrix",22);
        final ListaPalabras pelicula23 = new ListaPalabras("Up",23);
        final ListaPalabras pelicula24 = new ListaPalabras("Seven",24);
        final ListaPalabras pelicula25 = new ListaPalabras("Memento",25);
        final ListaPalabras pelicula26 = new ListaPalabras("Morbius",26);
        final ListaPalabras pelicula27 = new ListaPalabras("Scream",27);
        final ListaPalabras pelicula28 = new ListaPalabras("Uncharted",28);
        final ListaPalabras pelicula29 = new ListaPalabras("Macbeth",29);
        final ListaPalabras pelicula30 = new ListaPalabras("Red",30);

        listaPeliculas.add(pelicula1);
        listaPeliculas.add(pelicula2);
        listaPeliculas.add(pelicula3);
        listaPeliculas.add(pelicula4);
        listaPeliculas.add(pelicula5);
        listaPeliculas.add(pelicula6);
        listaPeliculas.add(pelicula7);
        listaPeliculas.add(pelicula8);
        listaPeliculas.add(pelicula9);
        listaPeliculas.add(pelicula10);
        listaPeliculas.add(pelicula11);
        listaPeliculas.add(pelicula12);
        listaPeliculas.add(pelicula13);
        listaPeliculas.add(pelicula14);
        listaPeliculas.add(pelicula15);
        listaPeliculas.add(pelicula16);
        listaPeliculas.add(pelicula17);
        listaPeliculas.add(pelicula18);
        listaPeliculas.add(pelicula19);
        listaPeliculas.add(pelicula20);
        listaPeliculas.add(pelicula21);
        listaPeliculas.add(pelicula22);
        listaPeliculas.add(pelicula23);
        listaPeliculas.add(pelicula24);
        listaPeliculas.add(pelicula25);
        listaPeliculas.add(pelicula26);
        listaPeliculas.add(pelicula27);
        listaPeliculas.add(pelicula28);
        listaPeliculas.add(pelicula29);
        listaPeliculas.add(pelicula30);

        return listaPeliculas;
    }

    public static List<ListaPalabras> getPalabras(String temaElegido) {
        switch (temaElegido) {
            case "capitales":
                return listaCapitales();
            case "comida":
                return listaComidas();
            case "animales":
                return listaAnimales();
            case "profesiones":
                return listaProfesiones();
            case "deportes":
                return listaDeportes();
            case "cine":
                return listaPeliculas();
            default :
                return listaPeliculas();
        }
    }
}
