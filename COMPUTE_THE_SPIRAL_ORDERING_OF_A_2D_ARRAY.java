package Array;

import java.util.*;

public class COMPUTE_THE_SPIRAL_ORDERING_OF_A_2D_ARRAY {
	public static List<Integer>matrixInSpiralOrder(List<List<Integer>>squareMatrix){
		List<Integer> spiralOrdering = new ArrayList <>();
		for (int offset = 0; offset < Math.ceil(0.5 * squareMatrix.size());++offset) {
			matrixLayerInClockwise(squareMatrix , offset, spiralOrdering);
		}
		return spiralOrdering ;
	}
	private static void matrixLayerInClockwise(List<List<Integer>>squareMatrix,int offset,List<Integer>spiralOrdering) {
		if (offset == squareMatrix.size() - offset - 1) {
			spiralOrdering.add(squareMatrix.get(offset).get(offset));
		    return ;
		}
		for (int j = offset; j < squareMatrix.size() - offset - 1; ++j) {
			spiralOrdering.add(squareMatrix.get(offset).get(j));
		}
		for (int i = offset; i < squareMatrix.size() - offset - 1; ++i) {
			spiralOrdering.add(squareMatrix.get(i).get(squareMatrix.size() - offset - 1));
		}
		for (int j = squareMatrix.size() - offset - 1; j > offset; --j) {
			spiralOrdering.add(squareMatrix.get(squareMatrix.size() - offset - 1).get(j));
		}
		for (int i = squareMatrix.size() - offset - 1; i > offset; --i) {
			spiralOrdering.add(squareMatrix.get(i).get(offset));
		}
	}
 public static void main(String[] args) {
	// TODO Auto-generated method stub
	List<List<Integer>> a=new ArrayList<List<Integer>>();
	a.add(new ArrayList<Integer>());
	a.get(0).add(0, 1);
	a.get(0).add(1, 2);
	a.get(0).add(2, 3);
	a.add(new ArrayList<Integer>(Arrays.asList(4,5,6)));
	a.add(new ArrayList<Integer>(Arrays.asList(7,8,9)));
	System.out.println("Matrix(3*3):- "+a);
	System.out.println("Spiral order: "+matrixInSpiralOrder(a));
	List<List<Integer>> b=new ArrayList<List<Integer>>();
	b.add(new ArrayList<Integer>());
	b.get(0).add(0, 1);
	b.get(0).add(1, 2);
	b.get(0).add(2, 3);
	b.get(0).add(3, 4);
	b.add(new ArrayList<Integer>(Arrays.asList(5,6,7,8)));
	b.add(new ArrayList<Integer>(Arrays.asList(9,10,11,12)));
	b.add(new ArrayList<Integer>(Arrays.asList(13,14,15,16)));
	System.out.println("Matrix(4*4):- "+b);
	System.out.println("Spiral order: "+matrixInSpiralOrder(b));

 }
}
