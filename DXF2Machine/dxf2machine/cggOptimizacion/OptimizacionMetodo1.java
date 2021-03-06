/*------------------------------------------------------------------------------------------ 
Copyright 2014, Celeste Gabriela Guagliano. 

This file is part of DXF2Machine project. 

DXF2Machine is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License. 

DXF2Machine is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details. 

You should have received a copy of the GNU General Public License along with DXF2Machine. If not, see <http://www.gnu.org/licenses/>.
  --------------------------------------------------------------------------------------------*/

package cggOptimizacion;

import java.util.Hashtable;

import cggColeccion.ColeccionFunciones;
import cggOptimizacion.Optimizacion;

/**
 * This class implements an algorithm of optimization for lists.
 * This kind of optimization receives a list, sorts the elements and returns a new list.  
 * @author: Celeste G. Guagliano
 * @version: 13/01/15
 * 
 */ 
public class OptimizacionMetodo1 extends Optimizacion {

	public static Hashtable Optimizacion(Hashtable lista) {
		Hashtable listaOptimizada = new Hashtable();
		listaOptimizada = ColeccionFunciones.InicializarTablaOrdenada(lista);
		lista = ColeccionFunciones.ObtenerNuevaLista(lista, listaOptimizada);
		listaOptimizada = ColeccionFunciones.ObtenerElementosOrdenados(
				listaOptimizada, lista);
		return listaOptimizada;
	}

}
