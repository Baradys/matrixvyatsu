	/** ���� ����� ����������, �������� � �������� �������.
	 * @author bym97
	 */
public class MatrixHandler_subvers {
/**�������� ���� ������.
 * ��� �������� ����������� ������ ������ ���������.
 * @param a  ������� 1.
 * @param b  ������� 2.
 * @return ���������� ���������� �������.
 * @throws IllegalArgumentException  ���������� ������, ���� ����������� ������ �� ���������.
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
     * ��������� ������.
     * ��� ��������� ����������� ������ ������ ���������.
     * @param a ������� 1.
     * @param b ������� 2.
     * @return ���������� ��������� �������.
     * @throws IllegalArgumentException ���������� ������, ���� ����������� ������ �� ���������.
     */
    public static double[][] substract (double[][] a, double[][]b) throws IllegalArgumentException{
        /**����������� ������ ������ ���� ���������.
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
 
    /**������������ ������.
     * ����� ������� A  ����� ���� �������� �� ������� B �����, ����� ����� �������� ������� A ��������� ����� ����� ������� B.
     * @param a ������� 1
     * @param b ������� 2
     * @return ���������� ��������� �������. 
     * @throws IllegalArgumentException ���������� ������, ���� ����� �������� ������� A �� ��������� ����� ����� ������� B.
     */
    public static double[][] multiply (double[][] a, double[][]b) throws IllegalArgumentException{
        if (a.length == b[0].length) {
            double[][] c = new double[a[0].length][b.length];
            for (int i = 0; i < a[0].length; i++){
                for (int j = 0; j <b.length; j++){
                    /*������ ���������� ������� �������� �������.
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
    /**����� �������.
     * 
     * @param a ������� ���������� �������.
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