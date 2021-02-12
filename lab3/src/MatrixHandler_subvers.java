	/** Этот класс складывает, вычитает и умножает матрицы.
	 * @author bym97
	 */
public class MatrixHandler_subvers {
/**Сложение двух матриц.
 * При сложении размерность матриц должна совпадать.
 * @param a  Матрица 1.
 * @param b  Матрица 2.
 * @return Возвращает полученную матрицу.
 * @throws IllegalArgumentException  Возвращает ошибку, если размерность матриц не одинакова.
 */
    public static double[][] add (double[][] a, double[][]b) throws IllegalArgumentException{
        /**
         */
        if (a.length == b.length && a[0].length == b[0].length) {
            double[][] c = new double[a.length][a[0].length];
            for (int i = 0; i < a.length; i++){
                for (int j = 0; j < a[0].length; j++){
                    c[i][j] = a[i][j] + b[i][j];
                }
            }
            
            return c;   
        } else {
			throw new IllegalArgumentException ("Matrix's dimensions should be same");
		}
    }
    
    /**
     * Вычитание матриц.
     * При вычитании размерность матриц должна совпадать.
     * @param a Матрица 1.
     * @param b Матрица 2.
     * @return Возвращает полученую матрицу.
     * @throws IllegalArgumentException Возвращает ошибку, если размерность матриц не одинакова.
     */
    public static double[][] substract (double[][] a, double[][]b) throws IllegalArgumentException{
        /**Размерность матриц должна быть одинакова.
         */
        if (a.length == b.length && a[0].length == b[0].length) {
            double[][] c = new double[a.length][a[0].length];
            for (int i = 0; i < a.length; i++){
                for (int j = 0; j < a[0].length; j++){
                    c[i][j] = a[i][j] - b[i][j];
                }
            }
            
            return c;   
        } else
        	
			throw new IllegalArgumentException ("Matrix's dimensions should be same");
    }
 
    /**Перемножение матриц.
     * Чтобы матрицу A  можно было умножить на матрицу B нужно, чтобы число столбцов матрицы A равнялось числу строк матрицы B.
     * @param a Матрица 1
     * @param b Матрица 2
     * @return Возвращает полученую матрицу. 
     * @throws IllegalArgumentException Возвращает ошибку, если число столбцов матрицы A не равняется числу строк матрицы B.
     */
    public static double[][] multiply (double[][] a, double[][]b) throws IllegalArgumentException{
        if (a.length == b[0].length) {
            double[][] c = new double[a[0].length][b.length];
            for (int i = 0; i < a[0].length; i++){
                for (int j = 0; j <b.length; j++){
                    /*Начало вычисления каждого элемента матрицы.
                     */
                    double temp = 0;
                    for (int k = 0; k < a.length; k++){
                        temp += a[k][i] * b[j][k];
                    }
                    c[i][j] = temp;
                }
            }
            return c;   
        } else
			throw new IllegalArgumentException ("Matrix A's columns amount must be same as B's rows amount");
    }
    /**Вывод матрицы.
     * 
     * @param a Выводит полученную матрицу.
     */
    public static void printm(double[][] a){
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[0].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}