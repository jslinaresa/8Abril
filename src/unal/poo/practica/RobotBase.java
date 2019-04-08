package unal.poo.practica;

import becker.robots.*;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class RobotBase
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
        public static void mover(int a){
            for (int i=0; i<a;i++){
                estudiante.move();
            }
        }
        public static void rodearObs (int a){
            mover(a-1);
            for (int i =0; i<3;i++){
            estudiante.turnLeft();
            mover(a);}
            estudiante.turnLeft();
            mover(1);
        }
        public static void derecha(){
            
            for (int i=0; i<3;i++){
                estudiante.turnLeft();
            }
        }
        public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("Field.txt");
	    objetos.showThingCounts(true);
      
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,0, 1, Direction.WEST,10);
            
            rodearObs(3);        
        
        }
}  