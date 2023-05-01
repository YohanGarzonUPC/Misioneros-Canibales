/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundo;

import gfutria.Logic;

/**
 *
 * @author Yohan Garzon Gonzalez
 */
public class Misioneros extends Logic {

    private int[] campoJuego;
    private boolean barco; //True 1-- izquierda // false 0 -- derecha

    public Misioneros() {
        this.campoJuego = new int[4];
        campoJuego[0] = campoJuego[1] = 3;
        barco = true;

//        String xyz = ""; 
//        for(int i=0; i<3; i++)
//          xyz = xyz + orrillaIzquierda[i]; 
//        for(int i=0; i<3; i++)
//          xyz = xyz + orrillaDerecha[i];
//        
//        System.out.println(">>X " + xyz);
    }

    public int[] getCampoJuego() {
        return campoJuego;
    }

    public void setCampoJuego(int[] campoJuego) {
        this.campoJuego = campoJuego;
    }

    public boolean isBarco() {
        return barco;
    }

    public void setBarco(boolean barco) {
        this.barco = barco;
    }

    public void mover1M1C() {
        if (barco) {
            if (campoJuego[0] > 0 && campoJuego[1] > 0) {
                if (campoJuego[0] >= campoJuego[1]) {
                    if (campoJuego[2] >= campoJuego[3]) {
                        campoJuego[0]--;
                        campoJuego[1]--;
                        campoJuego[2]++;
                        campoJuego[3]++;
                        barco = false;
                    }
                }
            }
        } else {
            if (campoJuego[2] > 0 && campoJuego[3] > 0) {
                if (campoJuego[2] >= campoJuego[3]) {
                    if (campoJuego[0] >= campoJuego[1]) {
                        campoJuego[2]--;
                        campoJuego[3]--;
                        campoJuego[0]++;
                        campoJuego[1]++;
                        barco = true;
                    }
                }
            }
        }
    }

    public void mover2C() {
        if (barco) {
            if (campoJuego[1] > 1) {
                if ((campoJuego[1] - 2) <= campoJuego[0] || campoJuego[0] == 0) {
                    if ((campoJuego[3] + 2) <= campoJuego[2] || campoJuego[2] == 0) {
                        campoJuego[1] -= 2;
                        campoJuego[3] += 2;
                        barco = false;
                    }
                }
            }
        } else {
            if (campoJuego[3] > 1) {
                if ((campoJuego[3] - 2) <= campoJuego[2] || campoJuego[2] == 0) {
                    if ((campoJuego[1] + 2) <= campoJuego[0] || campoJuego[0] == 0) {
                        campoJuego[3] -= 2;
                        campoJuego[1] += 2;
                        barco = true;
                    }
                }
            }
        }
    }

    public void mover2M() {
        if (barco) {
            if (campoJuego[0] > 1) {
                if ((campoJuego[0] - 2) >= campoJuego[1] || (campoJuego[0] - 2) == 0) {
                    if ((campoJuego[2] + 2) >= campoJuego[3]) {
                        campoJuego[0] -= 2;
                        campoJuego[2] += 2;
                        barco = false;
                    }
                }
            }
        } else {
            if (campoJuego[2] > 1) {
                if ((campoJuego[2] - 2) >= campoJuego[3] || (campoJuego[2] - 2) == 0) {
                    if ((campoJuego[0] + 2) >= campoJuego[1]) {
                        campoJuego[2] -= 2;
                        campoJuego[0] += 2;
                        barco = true;
                    }
                }
            }
        }
    }

    public void mover1C() {
        if (barco) {
            if (campoJuego[1] > 0) {
                if ((campoJuego[1] - 1) <= campoJuego[0] || campoJuego[0] == 0) {
                    if ((campoJuego[3] + 1) <= campoJuego[2] || campoJuego[2] == 0) {
                        campoJuego[1]--;
                        campoJuego[3]++;
                        barco = false;
                    }
                }
            }
        } else {
            if (campoJuego[3] > 0) {
                if ((campoJuego[3] - 1) <= campoJuego[2] || campoJuego[2] == 0) {
                    if ((campoJuego[1] + 1) <= campoJuego[0] || campoJuego[0] == 0) {
                        campoJuego[3]--;
                        campoJuego[1]++;
                        barco = true;
                    }
                }
            }
        }
    }

    public void mover1M() {
        if (barco) {
            if (campoJuego[0] > 0) {
                if ((campoJuego[0] - 1) >= campoJuego[1] || campoJuego[0] - 1 == 0) {
                    if ((campoJuego[2] + 1) >= campoJuego[3]) {
                        campoJuego[0]--;
                        campoJuego[2]++;
                        barco = false;
                    }
                }
            }
        } else {
            if (campoJuego[2] > 0) {
                if ((campoJuego[2] - 1) >= campoJuego[3] || campoJuego[2] - 1 == 0) {
                    if ((campoJuego[0] + 1) >= campoJuego[1]) {
                        campoJuego[2]--;
                        campoJuego[0]++;
                        barco = true;
                    }
                }
            }
        }
    }

    @Override
    public Logic cloneObject(Logic logic
    ) {
        Misioneros temp = new Misioneros();
        Misioneros temp1 = (Misioneros) logic;

        int[] tempArreglo = new int[4];
        for (int i = 0; i < tempArreglo.length; i++) {
            tempArreglo[i] = temp1.getCampoJuego()[i];
        }
        temp.setCampoJuego(tempArreglo);
        temp.setBarco(temp1.isBarco());

        return temp;
    }

    @Override
    public String state() {
        String estado = "";
        for (int i = 0; i < campoJuego.length; i++) {
            estado += campoJuego[i] + " ";
            if (i == 1) {
                estado += ": ";
            }
        }
        estado += "B: ";
        if (barco) {
            estado += "1";
        } else {
            estado += "0";
        }

        return estado;
    }

    @Override
    public void action(int i
    ) {
        switch (i) {
            case 1:
                mover1M1C();
                break;
            case 2:
                mover1C();
                break;
            case 3:
                mover2C();
                break;
            case 4:
                mover1M();
                break;
            case 5:
                mover2M();
                break;
        }
    }
}

/*

llevar11
llevar10
llevar01
llevar02
llevar20



 */
