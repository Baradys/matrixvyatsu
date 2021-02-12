/**
 * Этот класс содержит матрицы.
 * 
 * @author bym97
 */
public class Main_subvers {
	/**
	 * a - первая матрица b - вторая матрица c - третья матрица Фигурные скобки по
	 * порядку заключают каждую линию по оси Y матрицы
	 */
	/**
	 * @param args передает значения команд
	 */
	public static void main(String[] args) {
		double[][] a = { { 11, 55, 33 }, { 22, 45, 76 }, { 1, 2, 3 } };

		double[][] b = { { 98, 87, 67 }, { 87, 65, 56 }, { 1, 2, 3 } };
		MatrixHandler_subvers.printm(MatrixHandler_subvers.add(a, b));
		MatrixHandler_subvers.printm(MatrixHandler_subvers.substract(a, b));

		double[][] c = { { 32, 11, 5 }, { 2, 8, 6 }, { 12, 4, 6 } };
		MatrixHandler_subvers.printm(MatrixHandler_subvers.multiply(a, c));

	}
}
