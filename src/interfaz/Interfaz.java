/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaz;

import gfutria.SearchStateSpaces;
import java.util.ArrayList;
import mundo.Misioneros;

/**
 *
 * @author Yohan Garzon Gonzalez
 */
public class Interfaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TEXT
        Misioneros misio = new Misioneros();
        ArrayList solver = new ArrayList();
        
        
        //True 1-- izquierda // false 0 -- derecha
        SearchStateSpaces sss = new SearchStateSpaces("0 0 : 3 3 B: 0", misio, 5); 
        solver = sss.solve();
        System.out.println(sss.steps());
        for (int i = 0; i < solver.size(); i++) {
            System.out.println(solver.get(i));
        }
        
        //solucion
//        System.out.println(clone.state());
//        clone.mover1M1C();
//        System.out.println(clone.state());
//        clone.mover1M();
//        System.out.println(clone.state());
//        clone.mover2C();
//        System.out.println(clone.state());
//        clone.mover1C();
//        System.out.println(clone.state());
//        clone.mover2M();
//        System.out.println(clone.state());
//        clone.mover1M1C();
//        System.out.println(clone.state());
//        clone.mover2M();
//        System.out.println(clone.state());
//        clone.mover1C();
//        System.out.println(clone.state());
//        clone.mover2C();
//        System.out.println(clone.state());
//        clone.mover1C();
//        System.out.println(clone.state());
//        clone.mover2C();
//        System.out.println(clone.state());
//        
//        // test 1
//        misio.mover1M1C();
//        System.out.println("subtest 1: " + misio.state());
//        misio.mover1M1C();
//        System.out.println("subtest 1.1: " + misio.state());
//
//        // test 2
//        misio.mover1C();
//        System.out.println(("subtest 2.1: " + misio.state()));
//        misio.mover1M();
//        System.out.println("subtest 2.2: " + misio.state());
//
//        // test 3
//        int[] juegoPr = new int[4];
//        juegoPr[0] = 3;
//        juegoPr[1] = 1;
//        juegoPr[2] = 0;
//        juegoPr[3] = 2;
//        misio.setCampoJuego(juegoPr);
//        misio.setBarco(true);
//        System.out.println("subtest 3.1: " + misio.state());
//        misio.mover2M();
//        System.out.println("subtest 3.2: " + misio.state());
//
//        // test 4
//        misio.mover1C();
//        System.out.println("subtest 4: " + misio.state());
//
//        // test 5
//        misio.mover2C();
//        System.out.println("subtest 5: " + misio.state());
//
//        // test 6
//        misio.mover2M();
//        System.out.println("subtest 6: " + misio.state());
//
//        // test 7
//        misio.mover1C();
//        misio.mover1M();
//        System.out.println("subtest 7: " + misio.state());
//
//        // test 7
//        misio.mover2C();
//        System.out.println("subtest 8: " + misio.state());

        //test 9
//        System.out.println("subtest 9:");
//        Misioneros temp1 = (Misioneros) misio.cloneObject(misio);
//        temp1.action(1);
//        System.out.println(temp1.state());
//
//        Misioneros temp2 = (Misioneros) temp1.cloneObject(temp1);
//        temp2.action(4);
//        System.out.println(temp2.state());
//
//        Misioneros temp3 = (Misioneros) temp2.cloneObject(temp2);
//        temp3.action(3);
//        System.out.println(temp3.state());
    }

}
