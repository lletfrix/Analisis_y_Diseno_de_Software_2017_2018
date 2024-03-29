package GR2202_RafaelSergio.practica4_opt;

import java.io.IOException;

public class TesterAlgoritmo {
	public static void main(String[] args) throws IllegalArgumentException, CloneNotSupportedException, ArgsDistintosFuncionesException, IOException {
		DominioBooleano dom = new DominioBooleano();
		int nArio[] = {2, 2, 1, 2, 2};
		dom.definirConjuntoTerminales("X", "Y", "Z");
		dom.definirConjuntoFunciones(nArio, "∧", "v", "¬", "NAND", "NOR");
        Algoritmo algoritmo = new Algoritmo(3, 4, 100, 1, 10000);
        algoritmo.defineConjuntoTerminales(dom.getTerminales());
        algoritmo.defineConjuntoFunciones(dom.getFunciones());
        dom.definirValoresPrueba("files/datos.txt");
        algoritmo.ejecutar(dom);
	}
}
